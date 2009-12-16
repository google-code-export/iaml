/**
 * 
 */
package org.openiaml.emf.properties.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.openiaml.emf.DijkstraAlgorithm;
import org.openiaml.emf.properties.IEMFElementSelector;
import org.openiaml.emf.properties.IterateOverAll;

/**
 * @author jmwright
 *
 */
public class ContainmentsDiameter extends IterateOverAll {
	private int max = -1;

	/**
	 * @param name
	 */
	public ContainmentsDiameter(String name, IEMFElementSelector selector) {
		super(name, selector);
	}

	@Override
	public Object evaluate(EObject root) {
		// evaluate as normal
		super.evaluate(root);
		// but return the maximum
		return max;
	}

	@Override
	public int get(final EObject root) {
		// use dijkstra's algorithm to find the shortest path between any vertices
		DijkstraAlgorithm<EObject> dj = new DijkstraAlgorithm<EObject>() {

			@Override
			public Collection<EObject> getEdges() {
				// vertices = all EObjects in the root							
				Collection<EObject> nodes = toCollection(root.eAllContents());
				// add self
				nodes.add(root);
				return removeIgnoredClasses(nodes);
			}

			@Override
			public List<EObject> getNeighbours(EObject u) {
				// edges = all EReferences (including containments)
				List<EObject> neighbours = new ArrayList<EObject>();
				for (EReference ref : u.eClass().getEAllContainments()) {
					if (ignoreReference(ref))
						continue;	// ignore
					
					if (ref.isMany()) {
						List<?> r = (List<?>) u.eGet(ref);
						for (Object rr : r) {
							neighbours.add((EObject) rr);
						}
					} else {
						if (u.eGet(ref) != null) {
							neighbours.add((EObject) u.eGet(ref));
						}
					}
				}
				return neighbours;
			}
			
		};
		
		// for all nodes
		double count = 0;
		for (EObject source : dj.getEdges()) {
			System.out.println(( count / (dj.getEdges().size() + 1) * 100) + "%");
			count++;
			for (EObject target : dj.getEdges()) {
				// ignoring self
				if (!source.equals(target)) {
					int path = dj.dijkstra(source, target);
					if (path > max)
						max = path;
				}
			}
		}
		
		return 0;	// ignore return value
	}

}