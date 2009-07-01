/**
 * 
 */
package org.openiaml.model.inference;

import org.openiaml.model.model.ApplicationElement;
import org.openiaml.model.model.ApplicationElementContainer;
import org.openiaml.model.model.ApplicationElementProperty;
import org.openiaml.model.model.ChainedOperation;
import org.openiaml.model.model.CompositeCondition;
import org.openiaml.model.model.CompositeOperation;
import org.openiaml.model.model.ContainsConditions;
import org.openiaml.model.model.ContainsEventTriggers;
import org.openiaml.model.model.ContainsOperations;
import org.openiaml.model.model.ContainsWires;
import org.openiaml.model.model.DataFlowEdge;
import org.openiaml.model.model.DomainAttribute;
import org.openiaml.model.model.DomainAttributeInstance;
import org.openiaml.model.model.DomainObject;
import org.openiaml.model.model.DomainObjectInstance;
import org.openiaml.model.model.DomainStore;
import org.openiaml.model.model.EventTrigger;
import org.openiaml.model.model.ExecutionEdge;
import org.openiaml.model.model.GeneratedElement;
import org.openiaml.model.model.GeneratesElements;
import org.openiaml.model.model.InternetApplication;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.NamedElement;
import org.openiaml.model.model.Operation;
import org.openiaml.model.model.Parameter;
import org.openiaml.model.model.StaticValue;
import org.openiaml.model.model.WireEdgeDestination;
import org.openiaml.model.model.WireEdgesSource;
import org.openiaml.model.model.operations.CancelNode;
import org.openiaml.model.model.operations.DecisionCondition;
import org.openiaml.model.model.operations.DecisionOperation;
import org.openiaml.model.model.operations.FinishNode;
import org.openiaml.model.model.operations.OperationsPackage;
import org.openiaml.model.model.operations.StartNode;
import org.openiaml.model.model.scopes.ScopesPackage;
import org.openiaml.model.model.scopes.Session;
import org.openiaml.model.model.visual.Button;
import org.openiaml.model.model.visual.InputForm;
import org.openiaml.model.model.visual.InputTextField;
import org.openiaml.model.model.visual.Page;
import org.openiaml.model.model.visual.VisualPackage;
import org.openiaml.model.model.wires.ConditionWire;
import org.openiaml.model.model.wires.NavigateWire;
import org.openiaml.model.model.wires.ParameterWire;
import org.openiaml.model.model.wires.RunInstanceWire;
import org.openiaml.model.model.wires.SetWire;
import org.openiaml.model.model.wires.SyncWire;
import org.openiaml.model.model.wires.WiresPackage;

/**
 * Provides some helpful wrapper methods.
 * 
 * TODO it would be nice one day if this could be automatically generated?
 * 
 * @author jmwright
 *
 */
public abstract class EcoreCreateElementsHelper implements ICreateElements {

	public ApplicationElementProperty generatedApplicationElementProperty(GeneratesElements by, ApplicationElement container) throws InferenceException {
		ApplicationElementProperty fieldValue = (ApplicationElementProperty) createElement( container, ModelPackage.eINSTANCE.getApplicationElementProperty(), ModelPackage.eINSTANCE.getApplicationElement_Properties() );
		setGeneratedBy(fieldValue, by);
		return fieldValue;
	}

	/**
	 * Convenience method that sets isGenerated and generatedBy to the
	 * appropriate values.
	 * 
	 * @param fieldValue
	 * @param by
	 */
	public void setGeneratedBy(GeneratedElement element,
			GeneratesElements by) throws InferenceException {
		setValue(element, ModelPackage.eINSTANCE.getGeneratedElement_GeneratedBy(), by);
		setValue(element, ModelPackage.eINSTANCE.getGeneratedElement_IsGenerated(), true);
	}
	
	/**
	 * Sets the "generatedRule" property of a GeneratedElement.
	 * 
	 * @param element
	 * @param ruleName
	 * @throws InferenceException
	 */
	public void setGeneratedRule(GeneratedElement element, String ruleName) throws InferenceException {
		setValue(element, ModelPackage.eINSTANCE.getGeneratedElement_GeneratedRule(), ruleName);
	}

	public DomainStore generatedDomainStore(GeneratesElements by, InternetApplication container) throws InferenceException {
		DomainStore ds = createDomainStore(container);
		setGeneratedBy(ds, by);
		return ds;
	}

	public Session generatedSession(GeneratesElements by, InternetApplication container) throws InferenceException {
		Session session = createSession(container);
		setGeneratedBy(session, by);
		return session;
	}

	public DomainStore createDomainStore(InternetApplication container) throws InferenceException {
		DomainStore ds = (DomainStore) createElement( container, ModelPackage.eINSTANCE.getDomainStore(), ModelPackage.eINSTANCE.getInternetApplication_DomainStores() );
		return ds;
	}
	
	public Session createSession(InternetApplication container) throws InferenceException {
		Session session = (Session) createElement( container, ScopesPackage.eINSTANCE.getSession(), ModelPackage.eINSTANCE.getInternetApplication_Sessions() );
		return session;
	}

	public EventTrigger generatedEventTrigger(GeneratesElements by, ContainsEventTriggers container) throws InferenceException {
		EventTrigger event = createEventTrigger(container);
		setGeneratedBy(event, by);
		return event;
	}
	
	public CompositeOperation generatedCompositeOperation(GeneratesElements by, ContainsOperations container) throws InferenceException {
		CompositeOperation operation = createCompositeOperation(container);
		setGeneratedBy(operation, by);
		return operation;
	}
	
	public Parameter generatedParameter(GeneratesElements by, Operation container) throws InferenceException {
		Parameter parameter = (Parameter) createElement( container, ModelPackage.eINSTANCE.getParameter(), ModelPackage.eINSTANCE.getOperation_Parameters() );
		setGeneratedBy(parameter, by);
		return parameter;
	}	
	
	public Parameter generatedParameter(GeneratesElements by, CompositeCondition container) throws InferenceException {
		Parameter parameter = (Parameter) createElement( container, ModelPackage.eINSTANCE.getParameter(), ModelPackage.eINSTANCE.getCompositeCondition_Parameters() );
		setGeneratedBy(parameter, by);
		return parameter;
	}

	public ChainedOperation generatedChainedOperation(GeneratesElements by, ContainsOperations container) throws InferenceException {
		ChainedOperation operation = (ChainedOperation) createElement( container, ModelPackage.eINSTANCE.getChainedOperation(), ModelPackage.eINSTANCE.getContainsOperations_Operations() );
		setGeneratedBy(operation, by);
		return operation;
	}

	public DecisionOperation generatedDecisionOperation(GeneratesElements by, ContainsOperations container) throws InferenceException {
		DecisionOperation operation = (DecisionOperation) createElement( container, OperationsPackage.eINSTANCE.getDecisionOperation(), ModelPackage.eINSTANCE.getContainsOperations_Operations() );
		setGeneratedBy(operation, by);
		return operation;
	}
	
	public StaticValue generatedStaticValue(GeneratesElements by, CompositeOperation container) throws InferenceException {
		StaticValue value = (StaticValue) createElement( container, ModelPackage.eINSTANCE.getStaticValue(), ModelPackage.eINSTANCE.getCompositeOperation_Values() );
		setGeneratedBy(value, by);
		return value;
	}
	
	public StartNode generatedStartNode(GeneratesElements by, CompositeOperation container) throws InferenceException {
		StartNode node = (StartNode) createElement( container, OperationsPackage.eINSTANCE.getStartNode(), ModelPackage.eINSTANCE.getCompositeOperation_Nodes() );
		setGeneratedBy(node, by);
		return node;
	}

	public CancelNode generatedCancelNode(GeneratesElements by, CompositeOperation container) throws InferenceException {
		CancelNode node = (CancelNode) createElement( container, OperationsPackage.eINSTANCE.getCancelNode(), ModelPackage.eINSTANCE.getCompositeOperation_Nodes() );
		setGeneratedBy(node, by);
		return node;
	}

	public FinishNode generatedFinishNode(GeneratesElements by, CompositeOperation container) throws InferenceException {
		FinishNode node = (FinishNode) createElement( container, OperationsPackage.eINSTANCE.getFinishNode(), ModelPackage.eINSTANCE.getCompositeOperation_Nodes() );
		setGeneratedBy(node, by);
		return node;
	}

	public StartNode generatedStartNode(GeneratesElements by, CompositeCondition container) throws InferenceException {
		StartNode node = (StartNode) createElement( container, OperationsPackage.eINSTANCE.getStartNode(), ModelPackage.eINSTANCE.getCompositeCondition_Nodes() );
		setGeneratedBy(node, by);
		return node;
	}

	public CancelNode generatedCancelNode(GeneratesElements by, CompositeCondition container) throws InferenceException {
		CancelNode node = (CancelNode) createElement( container, OperationsPackage.eINSTANCE.getCancelNode(), ModelPackage.eINSTANCE.getCompositeCondition_Nodes() );
		setGeneratedBy(node, by);
		return node;
	}

	public FinishNode generatedFinishNode(GeneratesElements by, CompositeCondition container) throws InferenceException {
		FinishNode node = (FinishNode) createElement( container, OperationsPackage.eINSTANCE.getFinishNode(), ModelPackage.eINSTANCE.getCompositeCondition_Nodes() );
		setGeneratedBy(node, by);
		return node;
	}

	public DataFlowEdge generatedDataFlowEdge(GeneratesElements by, CompositeOperation container) throws InferenceException {
		DataFlowEdge edge = (DataFlowEdge) createElement( container, ModelPackage.eINSTANCE.getDataFlowEdge(), ModelPackage.eINSTANCE.getCompositeOperation_DataEdges() );
		setGeneratedBy(edge, by);
		return edge;
	}

	public ExecutionEdge generatedExecutionEdge(GeneratesElements by, CompositeOperation container) throws InferenceException {
		ExecutionEdge edge = (ExecutionEdge) createElement( container, ModelPackage.eINSTANCE.getExecutionEdge(), ModelPackage.eINSTANCE.getCompositeOperation_ExecutionEdges() );
		setGeneratedBy(edge, by);
		return edge;
	}

	public DataFlowEdge generatedDataFlowEdge(GeneratesElements by, CompositeCondition container) throws InferenceException {
		DataFlowEdge edge = (DataFlowEdge) createElement( container, ModelPackage.eINSTANCE.getDataFlowEdge(), ModelPackage.eINSTANCE.getCompositeCondition_DataEdges() );
		setGeneratedBy(edge, by);
		return edge;
	}

	public ExecutionEdge generatedExecutionEdge(GeneratesElements by, CompositeCondition container) throws InferenceException {
		ExecutionEdge edge = (ExecutionEdge) createElement( container, ModelPackage.eINSTANCE.getExecutionEdge(), ModelPackage.eINSTANCE.getCompositeCondition_ExecutionEdges() );
		setGeneratedBy(edge, by);
		return edge;
	}
	
	public RunInstanceWire generatedRunInstanceWire(GeneratesElements by, ContainsWires container, WireEdgesSource source, WireEdgeDestination target) throws InferenceException {
		RunInstanceWire wire = (RunInstanceWire) createRelationship(container, WiresPackage.eINSTANCE.getRunInstanceWire(), source, target, ModelPackage.eINSTANCE.getContainsWires_Wires(), ModelPackage.eINSTANCE.getWireEdge_From(), ModelPackage.eINSTANCE.getWireEdge_To());
		setGeneratedBy(wire, by);
		return wire;
	}

	public ParameterWire generatedParameterWire(GeneratesElements by, ContainsWires container, WireEdgesSource source, WireEdgeDestination target) throws InferenceException {
		ParameterWire wire = (ParameterWire) createRelationship(container, WiresPackage.eINSTANCE.getParameterWire(), source, target, ModelPackage.eINSTANCE.getContainsWires_Wires(), ModelPackage.eINSTANCE.getWireEdge_From(), ModelPackage.eINSTANCE.getWireEdge_To());
		setGeneratedBy(wire, by);
		return wire;
	}
	
	public SyncWire generatedSyncWire(GeneratesElements by, ContainsWires container, WireEdgesSource source, WireEdgeDestination target) throws InferenceException {
		SyncWire wire = createSyncWire(container, source, target);
		setGeneratedBy(wire, by);
		return wire;
	}

	public SetWire generatedSetWire(GeneratesElements by, ContainsWires container, WireEdgesSource source, WireEdgeDestination target) throws InferenceException {
		SetWire wire = (SetWire) createRelationship(container, WiresPackage.eINSTANCE.getSetWire(), source, target, ModelPackage.eINSTANCE.getContainsWires_Wires(), ModelPackage.eINSTANCE.getWireEdge_From(), ModelPackage.eINSTANCE.getWireEdge_To());
		setGeneratedBy(wire, by);
		return wire;
	}
	
	public NavigateWire generatedNavigateWire(GeneratesElements by, ContainsWires container, WireEdgesSource source, WireEdgeDestination target) throws InferenceException {
		NavigateWire wire = (NavigateWire) createRelationship(container, WiresPackage.eINSTANCE.getNavigateWire(), source, target, ModelPackage.eINSTANCE.getContainsWires_Wires(), ModelPackage.eINSTANCE.getWireEdge_From(), ModelPackage.eINSTANCE.getWireEdge_To());
		setGeneratedBy(wire, by);
		return wire;
	}

	public Page generatedPage(GeneratesElements by, ApplicationElementContainer container) throws InferenceException {
		Page page = createPage(container);
		setGeneratedBy(page, by);
		return page;
	}

	public Page generatedPage(GeneratesElements by, InternetApplication container) throws InferenceException {
		Page page = createPage(container);
		setGeneratedBy(page, by);
		return page;
	}

	public Session generatedSession(InternetApplication by, InternetApplication container) throws InferenceException {
		Session session = (Session) createElement( container, ScopesPackage.eINSTANCE.getSession(), ModelPackage.eINSTANCE.getInternetApplication_Sessions() );
		setGeneratedBy(session, by);
		return session;
	}

	public InputForm generatedInputForm(GeneratesElements by, ApplicationElementContainer container) throws InferenceException {
		InputForm form = (InputForm) createElement( container, VisualPackage.eINSTANCE.getInputForm(), ModelPackage.eINSTANCE.getApplicationElementContainer_Children() );
		setGeneratedBy(form, by);
		return form;
	}

	public InputTextField generatedInputTextField(GeneratesElements by, ApplicationElementContainer container) throws InferenceException {
		InputTextField field = (InputTextField) createElement( container, VisualPackage.eINSTANCE.getInputTextField(), ModelPackage.eINSTANCE.getApplicationElementContainer_Children() );
		setGeneratedBy(field, by);
		return field;
	}
	
	public Button generatedButton(GeneratesElements by, ApplicationElementContainer container) throws InferenceException {
		Button button = (Button) createElement( container, VisualPackage.eINSTANCE.getButton(), ModelPackage.eINSTANCE.getApplicationElementContainer_Children() );
		setGeneratedBy(button, by);
		return button;
	}
	
	public CompositeCondition generatedCompositeCondition(GeneratesElements by, ContainsConditions container) throws InferenceException {
		CompositeCondition object = (CompositeCondition) createElement( container, ModelPackage.eINSTANCE.getCompositeCondition(), ModelPackage.eINSTANCE.getContainsConditions_Conditions() );
		setGeneratedBy(object, by);
		return object;
	}

	public DecisionCondition generatedDecisionCondition(GeneratesElements by, ContainsConditions container) throws InferenceException {
		DecisionCondition object = (DecisionCondition) createElement( container, OperationsPackage.eINSTANCE.getDecisionCondition(), ModelPackage.eINSTANCE.getContainsConditions_Conditions() );
		setGeneratedBy(object, by);
		return object;
	}

	public ConditionWire generatedConditionWire(GeneratesElements by, ContainsWires container, WireEdgesSource source, WireEdgeDestination target) throws InferenceException {
		ConditionWire wire = (ConditionWire) createRelationship(container, WiresPackage.eINSTANCE.getConditionWire(), source, target, ModelPackage.eINSTANCE.getContainsWires_Wires(), ModelPackage.eINSTANCE.getWireEdge_From(), ModelPackage.eINSTANCE.getWireEdge_To());
		setGeneratedBy(wire, by);
		return wire;
	}

	public Page createPage(InternetApplication container) throws InferenceException {
		Page page = (Page) createElement( container, VisualPackage.eINSTANCE.getPage(), ModelPackage.eINSTANCE.getInternetApplication_Children() );
		return page;
	}
	
	public Page createPage(ApplicationElementContainer container) throws InferenceException {
		Page page = (Page) createElement( container, VisualPackage.eINSTANCE.getPage(), ModelPackage.eINSTANCE.getApplicationElementContainer_Children() );
		return page;
	}

	public SyncWire createSyncWire(ContainsWires container, WireEdgesSource source,
			WireEdgeDestination target) throws InferenceException {
		SyncWire wire = (SyncWire) createRelationship(container, WiresPackage.eINSTANCE.getSyncWire(), source, target, ModelPackage.eINSTANCE.getContainsWires_Wires(), ModelPackage.eINSTANCE.getWireEdge_From(), ModelPackage.eINSTANCE.getWireEdge_To());
		return wire;
	}

	public void setName(NamedElement element, String value) throws InferenceException {
		setValue(element, ModelPackage.eINSTANCE.getNamedElement_Name(), value);
	}

	public CompositeOperation createCompositeOperation(ContainsOperations container) throws InferenceException {
		CompositeOperation operation = (CompositeOperation) createElement( container, ModelPackage.eINSTANCE.getCompositeOperation(), ModelPackage.eINSTANCE.getContainsOperations_Operations() );
		return operation;
	}

	public EventTrigger createEventTrigger(ContainsEventTriggers container) throws InferenceException {
		EventTrigger event = (EventTrigger) createElement( container, ModelPackage.eINSTANCE.getEventTrigger(), ModelPackage.eINSTANCE.getContainsEventTriggers_EventTriggers() );
		return event;
	}

	public DomainObject generatedDomainObject(GeneratesElements by, DomainStore container) throws InferenceException {
		DomainObject object = (DomainObject) createElement( container, ModelPackage.eINSTANCE.getDomainObject(), ModelPackage.eINSTANCE.getDomainStore_Children() );
		setGeneratedBy(object, by);
		return object;
	}

	public DomainAttribute generatedDomainAttribute(GeneratesElements by, DomainObject container) throws InferenceException {
		DomainAttribute object = (DomainAttribute) createElement( container, ModelPackage.eINSTANCE.getDomainAttribute(), ModelPackage.eINSTANCE.getDomainObject_Attributes() );
		setGeneratedBy(object, by);
		return object;
	}

	public DomainAttributeInstance generatedDomainAttributeInstance(GeneratesElements by, DomainObjectInstance container) throws InferenceException {
		DomainAttributeInstance object = (DomainAttributeInstance) createElement( container, ModelPackage.eINSTANCE.getDomainAttributeInstance(), ModelPackage.eINSTANCE.getDomainObjectInstance_Attributes() );
		setGeneratedBy(object, by);
		return object;
	}

}
