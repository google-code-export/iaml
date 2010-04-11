package org.openiaml.model.diagram.custom.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.openiaml.model.model.diagram.part.IamlDiagramEditorPlugin;

/**
 * An abstract action that wraps around a lot of the common code
 * with various actions, adding support for rendering progress monitors
 * (rather than halting the current thread).
 * 
 * @see org.openiaml.model.codegen.oaw
 * @author jmwright
 *
 */
public abstract class ProgressEnabledAction<T> implements IViewActionDelegate {

	public static final String PLUGIN_ID = "org.openiaml.model.diagram.custom";

	protected Object[] selection;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
	 */
	@Override
	public void init(IViewPart view) {
		// does nothing
	}
	
	/**
	 * Get all objects of type T from the list of selected objects. Usually
	 * this is accomplished by just selecting all objects that are instanceof T. 
	 * 
	 * @param selection
	 * @return
	 */
	public abstract List<T> getSelection(Object[] selection);
	
	/**
	 * The message to render while progressing.
	 * 
	 * @return
	 */
	public abstract String getProgressMessage();
	
	/**
	 * Create an error message for an individual object, which has returned
	 * an error status with the given message.
	 *  
	 * @param individual
	 * @return
	 */
	public abstract String getErrorMessage(T individual, String message);

	/**
	 * Create the actual runnable which will execute our action.
	 * 
	 * @param result
	 * @return
	 */
	public IRunnableWithProgress getRunnable(final List<T> result) {
		return new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
		    	int scale = 4000;
		    	
		    	monitor.beginTask(getProgressMessage(), result.size() * scale);
		    	
		    	for (T individual : result) {
		    		// create a new sub-progress
		    		IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 1 * scale);
		    		
					IStatus status = execute(individual, subMonitor);
					if (!status.isOK()) {
						// make a status to wrap it around
						IStatus multi = new MultiStatus(
								PLUGIN_ID, 
								Status.ERROR, 
								new IStatus[] { status }, 
								getErrorMessage(individual, status.getMessage()),
								status.getException());
						// log it
						Platform.getLog(getDefaultPlugin().getBundle()).log(multi);
						
						monitor.done();
						return;
					}
		    	}
		    	
		    	monitor.done();
		    }
		};
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(final IAction action) {
		// get all the appropriate selected objects of type T
		final List<T> result = getSelection(selection);
		
		/**
		 * Create a progress display monitor, and actually
		 * execute the code generation.
		 */
		try {
			PlatformUI.getWorkbench().getProgressService().
				busyCursorWhile(getRunnable(result));
		} catch (InvocationTargetException e) {
			getDefaultPlugin().logError(e.getMessage(), e);
		} catch (InterruptedException e) {
			getDefaultPlugin().logError(e.getMessage(), e);
		}

	}
	
	/**
	 * Make a new ERROR IStatus with the given message and cause.
	 * 
	 * @param message
	 * @param cause
	 * @return
	 */
	protected IStatus errorStatus(String message, Throwable cause) {
		return new Status(IStatus.ERROR, PLUGIN_ID, message, cause);
	}
	
	/**
	 * Make a new ERROR IStatus with the given message.
	 * 
	 * @param message
	 * @param cause
	 * @return
	 */
	protected IStatus errorStatus(String message) {
		return new Status(IStatus.ERROR, PLUGIN_ID, message, null);
	}
	
	/**
	 * This is the method that actually does the work of this action.
	 * Returns a Status; if the Status is not OK then the Status message
	 * will be logged as an error, and execution will be cancelled.
	 * 
	 * @param individual the individual element to process
	 * @param monitor a sub-monitor for status progression
	 * @return
	 */
	public abstract IStatus execute(T individual, IProgressMonitor monitor);
	
	/**
	 * Get the default editor plugin, which we will use to log errors and the like.
	 * 
	 * @return
	 */
	public IamlDiagramEditorPlugin getDefaultPlugin() {
		return IamlDiagramEditorPlugin.getInstance();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = null;
		if (selection instanceof IStructuredSelection) {
			this.selection = ((IStructuredSelection) selection).toArray();
		}
	}

}