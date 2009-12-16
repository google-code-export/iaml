/**
 * 
 */
package org.openiaml.model.diagram.helpers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.openiaml.model.model.GeneratedElement;
import org.openiaml.model.model.GeneratesElements;

/**
 * Handles deleted GeneratedElements and the elements recursively
 * generated by the element.
 * 
 * @author jmwright
 *
 */
public class GeneratedElementDeleter {

	private GeneratedElement source;

	public GeneratedElementDeleter(GeneratedElement source) {
		this.source = source;
	}
	
	/**
	 * Look through the model and find all elements that should be
	 * deleted, if this element is deleted.
	 * 
	 * This list <b>won't</b> contain the source element.
	 * 
	 * TODO Perhaps a more advanced element deleter would actually consider
	 * the rule/Activations which created this element, and delete all
	 * elements created at the same time. This would continue to follow
	 * our monotonicity property. The only problem with this is that it
	 * would require generating and keeping track of activation IDs for all
	 * generated elements as well.
	 * 
	 * @return
	 */
	public List<EObject> getElementsToDelete() {
		List<EObject> result = new ArrayList<EObject>();
		
		// all elements generated by this
		if (source instanceof GeneratesElements) {
			GeneratesElements g = (GeneratesElements) source;
			for (EObject part : g.getGeneratedElements()) {
				result.add(part);
					
				// recursive delete of generated elements
				if (part instanceof GeneratedElement) {
					result.addAll( new GeneratedElementDeleter((GeneratedElement) part).getElementsToDelete() );
				}
			}
		}
		
		return result;
		
	}
	
}
