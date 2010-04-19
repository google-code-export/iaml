package org.openiaml.model.diagram.custom.commands.shortcuts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.openiaml.model.model.ApplicationElementContainer;
import org.openiaml.model.model.ApplicationElementProperty;
import org.openiaml.model.model.EventTrigger;
import org.openiaml.model.model.Operation;
import org.openiaml.model.model.StaticValue;
import org.openiaml.model.model.WireEdge;
import org.openiaml.model.model.WireEdgesSource;

/**
 * Implementation of the missing shortcuts for DomainStore.
 * 
 * @author jmwright
 *
 */
public class CreateMissingElementShortcutsCommand extends
		AbstractCreateMissingShortcutsCommand {

	private String modelId;
	
	public CreateMissingElementShortcutsCommand(GraphicalEditPart root, PreferencesHint prefHint, String modelId) {
		super(root, prefHint);
		this.modelId = modelId;
	}
	
	@Override
	protected List<WireEdge> getEdgesIn(EObject object) {
		ApplicationElementContainer rootObject = (ApplicationElementContainer) object;
		
		List<WireEdge> connectionsIn = new ArrayList<WireEdge>();
	
		// StaticValue doesn't have in edges
		
		// EventTrigger doesn't have in edges
		
		// Operation (incl ChainedOperation)
		for (Operation child : rootObject.getOperations()) {
			connectionsIn.addAll( child.getInEdges() );
		}
		
		// ApplicationElementProperty
		for (ApplicationElementProperty child : rootObject.getProperties()) {
			connectionsIn.addAll( child.getInEdges() );
		}
		
		return connectionsIn;
	}

	@Override
	protected List<WireEdge> getEdgesOut(EObject object) {
		ApplicationElementContainer rootObject = (ApplicationElementContainer) object;
		
		List<WireEdge> connectionsOut = new ArrayList<WireEdge>();

		// StaticValue
		for (StaticValue child : rootObject.getValues()) {
			connectionsOut.addAll( child.getOutEdges() );
		}

		// EventTrigger
		for (EventTrigger child : rootObject.getEventTriggers()) {
			connectionsOut.addAll( child.getOutEdges() );
		}
		
		// Operation (incl ChainedOperation)
		for (Operation child : rootObject.getOperations()) {
			// not all Operations have outwards edges
			if (child instanceof WireEdgesSource) {
				connectionsOut.addAll( ((WireEdgesSource) child).getOutEdges() );
			}
		}
		
		// ApplicationElementProperty
		for (ApplicationElementProperty child : rootObject.getProperties()) {
			connectionsOut.addAll( child.getOutEdges() );
		}
		
		return connectionsOut;

	}

	@Override
	protected String getEditPartModelId() {
		return modelId;
	}

}