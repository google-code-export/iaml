package org.openiaml.model.diagram.custom.actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.openiaml.model.model.InternetApplication;

/**
 * Action to generate code from an .iaml file, and then
 * view it with the internal web browser
 * 
 * @see GenerateCodeAction
 * @author jmwright
 *
 */
public class GenerateCodeActionAndView extends GenerateCodeAction implements IViewActionDelegate {
	
	/**
	 * Extends {@link GenerateCodeAction} to also open a new
	 * web browser window when the code has finished generating.
	 * 
	 * @param o
	 * @param monitor 
	 * @return 
	 */
	protected IStatus generateCodeFrom(IFile o, IAction action, IProgressMonitor monitor) {
		IStatus result = super.generateCodeFrom(o, action, monitor);
		
		if (result != null && result.isOK()) {
			// it was ok: try and load it
			EObject model = getLoadedModel();
			if (model instanceof InternetApplication) {
				String url = ((InternetApplication) model).getRuntimeUrl();
				
				if (url == null || url.isEmpty()) {
					return new Status(IStatus.WARNING, PLUGIN_ID, "Could not load generated code: no runtime URL found.");
				}
				URL urlAsUrl;
				try {
					urlAsUrl = new URL(url);

					// load this url + sitemap.html
					PlatformUI.getWorkbench().getBrowserSupport().createBrowser(PLUGIN_ID).openURL(urlAsUrl); 
				} catch (MalformedURLException e) {
					return new Status(IStatus.WARNING, PLUGIN_ID, "Runtime url '" + url + "' is not a valid URL.", e);
				} catch (PartInitException e) {
					return new Status(IStatus.ERROR, PLUGIN_ID, "Part init exception", e);
				}
				
			}
		}
		
		return result;
	}

}
