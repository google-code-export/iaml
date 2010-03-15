/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openiaml.model.model.Action;
import org.openiaml.model.model.ActionDestination;
import org.openiaml.model.model.DataFlowEdge;
import org.openiaml.model.model.DataFlowEdgeDestination;
import org.openiaml.model.model.DataFlowEdgesSource;
import org.openiaml.model.model.ExecutionEdge;
import org.openiaml.model.model.ExecutionEdgeDestination;
import org.openiaml.model.model.GeneratedElement;
import org.openiaml.model.model.GeneratesElements;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.NamedElement;
import org.openiaml.model.model.Operation;
import org.openiaml.model.model.Parameter;
import org.openiaml.model.model.Wire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getInWires <em>In Wires</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getGeneratedBy <em>Generated By</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#isIsGenerated <em>Is Generated</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getGeneratedRule <em>Generated Rule</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getInFlows <em>In Flows</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getInExecutions <em>In Executions</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getOutFlows <em>Out Flows</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getInActions <em>In Actions</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperationImpl extends EObjectImpl implements Operation {
	/**
	 * The cached value of the '{@link #getInWires() <em>In Wires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInWires()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> inWires;

	/**
	 * The cached value of the '{@link #getGeneratedBy() <em>Generated By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratesElements> generatedBy;

	/**
	 * The default value of the '{@link #isIsGenerated() <em>Is Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GENERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGenerated() <em>Is Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGenerated()
	 * @generated
	 * @ordered
	 */
	protected boolean isGenerated = IS_GENERATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedRule() <em>Generated Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedRule()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratedRule() <em>Generated Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedRule()
	 * @generated
	 * @ordered
	 */
	protected String generatedRule = GENERATED_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInFlows() <em>In Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowEdge> inFlows;

	/**
	 * The cached value of the '{@link #getInExecutions() <em>In Executions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionEdge> inExecutions;

	/**
	 * The cached value of the '{@link #getOutFlows() <em>Out Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowEdge> outFlows;

	/**
	 * The cached value of the '{@link #getInActions() <em>In Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> inActions;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getInWires() {
		if (inWires == null) {
			inWires = new EObjectWithInverseResolvingEList<Wire>(Wire.class, this, ModelPackage.OPERATION__IN_WIRES, ModelPackage.WIRE__TO);
		}
		return inWires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratesElements> getGeneratedBy() {
		if (generatedBy == null) {
			generatedBy = new EObjectWithInverseResolvingEList.ManyInverse<GeneratesElements>(GeneratesElements.class, this, ModelPackage.OPERATION__GENERATED_BY, ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS);
		}
		return generatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGenerated() {
		return isGenerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGenerated(boolean newIsGenerated) {
		boolean oldIsGenerated = isGenerated;
		isGenerated = newIsGenerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OPERATION__IS_GENERATED, oldIsGenerated, isGenerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OPERATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratedRule() {
		return generatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedRule(String newGeneratedRule) {
		String oldGeneratedRule = generatedRule;
		generatedRule = newGeneratedRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OPERATION__GENERATED_RULE, oldGeneratedRule, generatedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowEdge> getInFlows() {
		if (inFlows == null) {
			inFlows = new EObjectWithInverseResolvingEList<DataFlowEdge>(DataFlowEdge.class, this, ModelPackage.OPERATION__IN_FLOWS, ModelPackage.DATA_FLOW_EDGE__TO);
		}
		return inFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionEdge> getInExecutions() {
		if (inExecutions == null) {
			inExecutions = new EObjectWithInverseResolvingEList<ExecutionEdge>(ExecutionEdge.class, this, ModelPackage.OPERATION__IN_EXECUTIONS, ModelPackage.EXECUTION_EDGE__TO);
		}
		return inExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowEdge> getOutFlows() {
		if (outFlows == null) {
			outFlows = new EObjectWithInverseResolvingEList<DataFlowEdge>(DataFlowEdge.class, this, ModelPackage.OPERATION__OUT_FLOWS, ModelPackage.DATA_FLOW_EDGE__FROM);
		}
		return outFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getInActions() {
		if (inActions == null) {
			inActions = new EObjectWithInverseResolvingEList<Action>(Action.class, this, ModelPackage.OPERATION__IN_ACTIONS, ModelPackage.ACTION__TO);
		}
		return inActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ModelPackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.OPERATION__IN_WIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInWires()).basicAdd(otherEnd, msgs);
			case ModelPackage.OPERATION__GENERATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratedBy()).basicAdd(otherEnd, msgs);
			case ModelPackage.OPERATION__IN_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInFlows()).basicAdd(otherEnd, msgs);
			case ModelPackage.OPERATION__IN_EXECUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInExecutions()).basicAdd(otherEnd, msgs);
			case ModelPackage.OPERATION__OUT_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutFlows()).basicAdd(otherEnd, msgs);
			case ModelPackage.OPERATION__IN_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInActions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.OPERATION__IN_WIRES:
				return ((InternalEList<?>)getInWires()).basicRemove(otherEnd, msgs);
			case ModelPackage.OPERATION__GENERATED_BY:
				return ((InternalEList<?>)getGeneratedBy()).basicRemove(otherEnd, msgs);
			case ModelPackage.OPERATION__IN_FLOWS:
				return ((InternalEList<?>)getInFlows()).basicRemove(otherEnd, msgs);
			case ModelPackage.OPERATION__IN_EXECUTIONS:
				return ((InternalEList<?>)getInExecutions()).basicRemove(otherEnd, msgs);
			case ModelPackage.OPERATION__OUT_FLOWS:
				return ((InternalEList<?>)getOutFlows()).basicRemove(otherEnd, msgs);
			case ModelPackage.OPERATION__IN_ACTIONS:
				return ((InternalEList<?>)getInActions()).basicRemove(otherEnd, msgs);
			case ModelPackage.OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.OPERATION__IN_WIRES:
				return getInWires();
			case ModelPackage.OPERATION__GENERATED_BY:
				return getGeneratedBy();
			case ModelPackage.OPERATION__IS_GENERATED:
				return isIsGenerated();
			case ModelPackage.OPERATION__ID:
				return getId();
			case ModelPackage.OPERATION__GENERATED_RULE:
				return getGeneratedRule();
			case ModelPackage.OPERATION__NAME:
				return getName();
			case ModelPackage.OPERATION__IN_FLOWS:
				return getInFlows();
			case ModelPackage.OPERATION__IN_EXECUTIONS:
				return getInExecutions();
			case ModelPackage.OPERATION__OUT_FLOWS:
				return getOutFlows();
			case ModelPackage.OPERATION__IN_ACTIONS:
				return getInActions();
			case ModelPackage.OPERATION__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.OPERATION__IN_WIRES:
				getInWires().clear();
				getInWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case ModelPackage.OPERATION__GENERATED_BY:
				getGeneratedBy().clear();
				getGeneratedBy().addAll((Collection<? extends GeneratesElements>)newValue);
				return;
			case ModelPackage.OPERATION__IS_GENERATED:
				setIsGenerated((Boolean)newValue);
				return;
			case ModelPackage.OPERATION__ID:
				setId((String)newValue);
				return;
			case ModelPackage.OPERATION__GENERATED_RULE:
				setGeneratedRule((String)newValue);
				return;
			case ModelPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.OPERATION__IN_FLOWS:
				getInFlows().clear();
				getInFlows().addAll((Collection<? extends DataFlowEdge>)newValue);
				return;
			case ModelPackage.OPERATION__IN_EXECUTIONS:
				getInExecutions().clear();
				getInExecutions().addAll((Collection<? extends ExecutionEdge>)newValue);
				return;
			case ModelPackage.OPERATION__OUT_FLOWS:
				getOutFlows().clear();
				getOutFlows().addAll((Collection<? extends DataFlowEdge>)newValue);
				return;
			case ModelPackage.OPERATION__IN_ACTIONS:
				getInActions().clear();
				getInActions().addAll((Collection<? extends Action>)newValue);
				return;
			case ModelPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.OPERATION__IN_WIRES:
				getInWires().clear();
				return;
			case ModelPackage.OPERATION__GENERATED_BY:
				getGeneratedBy().clear();
				return;
			case ModelPackage.OPERATION__IS_GENERATED:
				setIsGenerated(IS_GENERATED_EDEFAULT);
				return;
			case ModelPackage.OPERATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.OPERATION__GENERATED_RULE:
				setGeneratedRule(GENERATED_RULE_EDEFAULT);
				return;
			case ModelPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.OPERATION__IN_FLOWS:
				getInFlows().clear();
				return;
			case ModelPackage.OPERATION__IN_EXECUTIONS:
				getInExecutions().clear();
				return;
			case ModelPackage.OPERATION__OUT_FLOWS:
				getOutFlows().clear();
				return;
			case ModelPackage.OPERATION__IN_ACTIONS:
				getInActions().clear();
				return;
			case ModelPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.OPERATION__IN_WIRES:
				return inWires != null && !inWires.isEmpty();
			case ModelPackage.OPERATION__GENERATED_BY:
				return generatedBy != null && !generatedBy.isEmpty();
			case ModelPackage.OPERATION__IS_GENERATED:
				return isGenerated != IS_GENERATED_EDEFAULT;
			case ModelPackage.OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.OPERATION__GENERATED_RULE:
				return GENERATED_RULE_EDEFAULT == null ? generatedRule != null : !GENERATED_RULE_EDEFAULT.equals(generatedRule);
			case ModelPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.OPERATION__IN_FLOWS:
				return inFlows != null && !inFlows.isEmpty();
			case ModelPackage.OPERATION__IN_EXECUTIONS:
				return inExecutions != null && !inExecutions.isEmpty();
			case ModelPackage.OPERATION__OUT_FLOWS:
				return outFlows != null && !outFlows.isEmpty();
			case ModelPackage.OPERATION__IN_ACTIONS:
				return inActions != null && !inActions.isEmpty();
			case ModelPackage.OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeneratedElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.OPERATION__GENERATED_BY: return ModelPackage.GENERATED_ELEMENT__GENERATED_BY;
				case ModelPackage.OPERATION__IS_GENERATED: return ModelPackage.GENERATED_ELEMENT__IS_GENERATED;
				case ModelPackage.OPERATION__ID: return ModelPackage.GENERATED_ELEMENT__ID;
				case ModelPackage.OPERATION__GENERATED_RULE: return ModelPackage.GENERATED_ELEMENT__GENERATED_RULE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.OPERATION__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == DataFlowEdgeDestination.class) {
			switch (derivedFeatureID) {
				case ModelPackage.OPERATION__IN_FLOWS: return ModelPackage.DATA_FLOW_EDGE_DESTINATION__IN_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExecutionEdgeDestination.class) {
			switch (derivedFeatureID) {
				case ModelPackage.OPERATION__IN_EXECUTIONS: return ModelPackage.EXECUTION_EDGE_DESTINATION__IN_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == DataFlowEdgesSource.class) {
			switch (derivedFeatureID) {
				case ModelPackage.OPERATION__OUT_FLOWS: return ModelPackage.DATA_FLOW_EDGES_SOURCE__OUT_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ActionDestination.class) {
			switch (derivedFeatureID) {
				case ModelPackage.OPERATION__IN_ACTIONS: return ModelPackage.ACTION_DESTINATION__IN_ACTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeneratedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.GENERATED_ELEMENT__GENERATED_BY: return ModelPackage.OPERATION__GENERATED_BY;
				case ModelPackage.GENERATED_ELEMENT__IS_GENERATED: return ModelPackage.OPERATION__IS_GENERATED;
				case ModelPackage.GENERATED_ELEMENT__ID: return ModelPackage.OPERATION__ID;
				case ModelPackage.GENERATED_ELEMENT__GENERATED_RULE: return ModelPackage.OPERATION__GENERATED_RULE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMED_ELEMENT__NAME: return ModelPackage.OPERATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == DataFlowEdgeDestination.class) {
			switch (baseFeatureID) {
				case ModelPackage.DATA_FLOW_EDGE_DESTINATION__IN_FLOWS: return ModelPackage.OPERATION__IN_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExecutionEdgeDestination.class) {
			switch (baseFeatureID) {
				case ModelPackage.EXECUTION_EDGE_DESTINATION__IN_EXECUTIONS: return ModelPackage.OPERATION__IN_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == DataFlowEdgesSource.class) {
			switch (baseFeatureID) {
				case ModelPackage.DATA_FLOW_EDGES_SOURCE__OUT_FLOWS: return ModelPackage.OPERATION__OUT_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ActionDestination.class) {
			switch (baseFeatureID) {
				case ModelPackage.ACTION_DESTINATION__IN_ACTIONS: return ModelPackage.OPERATION__IN_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isGenerated: ");
		result.append(isGenerated);
		result.append(", id: ");
		result.append(id);
		result.append(", generatedRule: ");
		result.append(generatedRule);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationImpl