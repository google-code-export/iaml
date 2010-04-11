/**
 * 
 */
package org.openiaml.model.codegen.php;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.jaxen.JaxenException;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.util.ProgressMonitorAdapter;
import org.openiaml.model.codegen.ICodeGenerator;
import org.openiaml.model.model.DynamicApplicationElementSet;
import org.openiaml.model.model.InternetApplication;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.domain.DomainPackage;

import ca.ecliptical.emf.xpath.EMFXPath;

/**
 * @author jmwright
 *
 */
public class OawCodeGenerator implements ICodeGenerator {
	
	public static final String PLUGIN_ID = "org.openiaml.model.codegen.php"; 
	
	/**
	 * Generate code for a given model file into a given output directory.
	 * Does NOT deal with inference.
	 * 
	 */
	public IStatus generateCode(IFile file, IProgressMonitor monitor, 
			Map<String,String> runtimeProperties) {
		
		// reset exception-key map
		resetKeyToExceptionMap();
		
		// we need to guess how many files this method will create,
		// so we can try and have some sort of progress monitor.
		int filesToCreate = guessNumberOfFilesToCreate(file);
		
		monitor.beginTask("Generating code from '" + file.getName() + "'", filesToCreate * 2);
		
		/*
		 * We have to do some magic to enable OAW logging to go through
		 * our own class. We have to provide this information to 
		 * commons.logging directly.
		 * 
		 * Based on http://oaw-forum.itemis.de/forum/viewtopic.php?forum=1&showtopic=1486 (german)
		 */
		ClassLoader oldcl = Thread.currentThread().getContextClassLoader();
		
		try {
			// to enable custom logging
			Thread.currentThread().setContextClassLoader(OawCodeGenerator.class.getClassLoader());
			CustomOAWLog.registerToLogFactory();
			
			// notify the logger of our monitor, so we can keep track
			// of created files
			CustomOAWLog.setMonitor(monitor);
			
			String wfFile = "src/workflow/runtime.oaw";
			Map<String,String> properties = new HashMap<String,String>();
			properties.put("model", file.getFullPath().toString());
			properties.put("src-gen", file.getProject().getLocation().toString());	// have to get absolute filename for output dir
			properties.put("config_runtime", runtimeProperties.get("config_runtime"));
			properties.put("config_web", runtimeProperties.get("config_web"));
			properties.put("debug", Boolean.toString(Boolean.parseBoolean(runtimeProperties.get("debug"))));
			
			Map<String,Object> slotContents = new HashMap<String,Object>();

			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;

			try {
				IACleanerBeautifier.setMonitor(monitor);
				executeWorkflow(wfFile, monitor, properties, slotContents);
			} catch (OperationCanceledException e) {
				// monitor was cancelled; OK
			} finally {
				IACleanerBeautifier.setMonitor(null);
			}

			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;

			// refresh output folder
			try {
				file.getProject().refreshLocal(IResource.DEPTH_INFINITE, new SubProgressMonitor(monitor, filesToCreate));
			} catch (CoreException e) {
				return new Status(Status.WARNING, PLUGIN_ID, "Could not refresh local project", e);
			}
			
			if (CustomOAWLog.hasErrors()) {
				return CustomOAWLog.getErrors();
			}
			return Status.OK_STATUS;
		} finally {
			// reset the classloader/log
			Thread.currentThread().setContextClassLoader(oldcl);
			CustomOAWLog.unregisterFromLogFactory();
			
			// the monitor is done
			monitor.done();
		}
			
	}
	
	/**
	 * <p>Execute the workflow in the given workflow file.
	 * By default, this creates a new {@link WorkflowRunner} and then
	 * calls {@link WorkflowRunner#run(String, org.openarchitectureware.workflow.monitor.ProgressMonitor, Map, Map)}.
	 * </p>
	 * 
	 * <p>This method is extracted so it can be overridden if necessary.</p>
	 * 
	 * @param wfFile
	 * @param monitor
	 * @param properties
	 * @param slotContents
	 */
	protected void executeWorkflow(String wfFile, IProgressMonitor monitor, Map<String, String> properties, Map<String, ?> slotContents) {
		new WorkflowRunner().run(wfFile,
				new ProgressMonitorAdapter(monitor), properties, slotContents);
		
	}
	
	/**
	 * Guess how many files we are going to create. 
	 * Unfortunately without loading the IFile directly I'm not
	 * sure this can be reliably determined, so we will just
	 * guess '100'.
	 * 
	 * @param file
	 * @return
	 */
	protected int guessNumberOfFilesToCreate(IFile file) {
		return 100;
	}

	/**
	 * <p>
	 * Construct a RuntimeException with the given message, and throw it.
	 * Useful in templates, as we can get a stack trace to problems, rather
	 * than using OAW's ERROR code, which only prints out text.
	 * </p>
	 * 
	 * <p>
	 * This includes a workaround for an OAW problem, where an exception thrown during
	 * workflow execution is renamed a WorkflowInterruption, and the causing exception is
	 * lost when saved to the error log. Our workaround is to serialise this exception
	 * into a special map ({@link #getExceptionForKey(String)}, which can then be unserialised
	 * by the log when it receives the error log message.
	 * </p>
	 * 
	 * <p>
	 * This workaround is saved in the thrown exception message, as "[original message] @key:[generated key]".
	 * The original exception can be retrieved through {@link #getExceptionForKey(String)}.
	 * </p>
	 * 
	 * @param message
	 */
	public static void throwException(String message) {
		Throwable e = new RuntimeException(message);
		String key = generateExceptionKey();
		keyToExceptionMap.put(key, e);
		throw new RuntimeException(e.getMessage() + " @key:" + key, e);
	}

	/**
	 * Generate a new exception key.
	 * 
	 * @return
	 */
	private static String generateExceptionKey() {
		keyToExceptionCount++;
		return "ex" + keyToExceptionCount;
	}

	public static Map<String,Throwable> keyToExceptionMap;
	public static int keyToExceptionCount;
	
	public static void resetKeyToExceptionMap() {
		keyToExceptionMap = new HashMap<String,Throwable>();
		keyToExceptionCount = 0;
	}
	
	public static Throwable getExceptionForKey(String key) {
		return keyToExceptionMap.get(key);
	}
	
	/**
	 * Get the exception for a given message. If no exception exists,
	 * null is returned.
	 * 
	 * @param message
	 * @return
	 */
	public static Throwable getExceptionForMessage(String message) {
		if (message.indexOf("@key:") < 0) {
			return null;
		}
		String key = message.substring(message.indexOf("@key:") + "@key:".length());
		// remove trailing whitespace
		if (key.indexOf(" ") >= 0) {
			key = key.substring(0, key.indexOf(" "));
		}
		if (key.indexOf("\r") >= 0) {
			key = key.substring(0, key.indexOf("\r"));
		}
		if (key.indexOf("\n") >= 0) {
			key = key.substring(0, key.indexOf("\n"));
		}
		if (key.indexOf("\t") >= 0) {
			key = key.substring(0, key.indexOf("\t"));
		}
		return keyToExceptionMap.get(key);
	}
	
	/**
	 * Here we evaluate the given query over the existing InternetApplication,
	 * and return all model elements that match.
	 * 
	 * @param root
	 * @param set
	 * @return
	 * @throws JaxenException 
	 */
	public static Set<EObject> resolveDynamicSet(InternetApplication root, DynamicApplicationElementSet set) throws JaxenException {
		if (set.getQuery().startsWith("xpath:")) {
			String query = set.getQuery();

			// remove prefix		
			query = query.substring("xpath:".length());
			
			// TODO move this into Java code (to reduce redunancy of the following code)
			EMFXPath xpath = new EMFXPath(query);
			xpath.addNamespace("iaml", ModelPackage.eNS_URI);
			xpath.addNamespace("iaml.domain", DomainPackage.eNS_URI);
			xpath.addNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
			List<?> results = xpath.selectNodes(root);
			
			Set<EObject> out = new HashSet<EObject>();
			for (Object o : results) {
				if (o instanceof EObject) {
					out.add((EObject) o);
				}
			}
			return out;
		}
		
		// TODO make into a real Exception
		throw new RuntimeException("Cannot resolve Dynamic Set for set query: " + set.getQuery() + " (set=" + set + ")");
	}
	
}