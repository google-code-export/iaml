/**
 * 
 */
package org.openiaml.emf.properties.library;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.openiaml.emf.properties.IEMFElementSelector;
import org.openiaml.emf.properties.IterateOverAll;

/**
 * @author jmwright
 *
 */
public class ContainmentsSum extends IterateOverAll {
	/**
	 * @param name
	 */
	public ContainmentsSum(String name, IEMFElementSelector selector) {
		super(name, selector);
	}
	
	public ContainmentsSum(IEMFElementSelector selector) {
		this(ContainmentsSum.class.getSimpleName(), selector);
	}

	@Override
	public int get(EObject obj) {
		int result = 0;
		List<EReference> refs = obj.eClass().getEAllContainments();
		for (EReference ref : refs) {
			if (ignoreReference(ref))
				continue; // ignore

			if (obj.eGet(ref) != null) {
				if (obj.eGet(ref) instanceof List<?>)
					result += ((List<?>) obj.eGet(ref)).size();
				else
					result ++;
			}
		}
		return result;
	}
}