/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.operations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openiaml.model.model.ExecutionEdge;
import org.openiaml.model.model.ExecutionEdgeDestination;
import org.openiaml.model.model.ExecutionEdgesSource;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.impl.ActivityNodeImpl;
import org.openiaml.model.model.operations.DecisionNode;
import org.openiaml.model.model.operations.OperationsPackage;
import org.openiaml.model.model.wires.ConditionEdge;
import org.openiaml.model.model.wires.ConditionEdgeDestination;
import org.openiaml.model.model.wires.WiresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.operations.impl.DecisionNodeImpl#getOutExecutions <em>Out Executions</em>}</li>
 *   <li>{@link org.openiaml.model.model.operations.impl.DecisionNodeImpl#getInExecutions <em>In Executions</em>}</li>
 *   <li>{@link org.openiaml.model.model.operations.impl.DecisionNodeImpl#getInConditionEdges <em>In Condition Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionNodeImpl extends ActivityNodeImpl implements DecisionNode {
	/**
	 * The cached value of the '{@link #getOutExecutions() <em>Out Executions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionEdge> outExecutions;

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
	 * The cached value of the '{@link #getInConditionEdges() <em>In Condition Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInConditionEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionEdge> inConditionEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.DECISION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionEdge> getOutExecutions() {
		if (outExecutions == null) {
			outExecutions = new EObjectWithInverseResolvingEList<ExecutionEdge>(ExecutionEdge.class, this, OperationsPackage.DECISION_NODE__OUT_EXECUTIONS, ModelPackage.EXECUTION_EDGE__FROM);
		}
		return outExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionEdge> getInExecutions() {
		if (inExecutions == null) {
			inExecutions = new EObjectWithInverseResolvingEList<ExecutionEdge>(ExecutionEdge.class, this, OperationsPackage.DECISION_NODE__IN_EXECUTIONS, ModelPackage.EXECUTION_EDGE__TO);
		}
		return inExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionEdge> getInConditionEdges() {
		if (inConditionEdges == null) {
			inConditionEdges = new EObjectWithInverseResolvingEList<ConditionEdge>(ConditionEdge.class, this, OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES, WiresPackage.CONDITION_EDGE__TO);
		}
		return inConditionEdges;
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
			case OperationsPackage.DECISION_NODE__OUT_EXECUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutExecutions()).basicAdd(otherEnd, msgs);
			case OperationsPackage.DECISION_NODE__IN_EXECUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInExecutions()).basicAdd(otherEnd, msgs);
			case OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInConditionEdges()).basicAdd(otherEnd, msgs);
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
			case OperationsPackage.DECISION_NODE__OUT_EXECUTIONS:
				return ((InternalEList<?>)getOutExecutions()).basicRemove(otherEnd, msgs);
			case OperationsPackage.DECISION_NODE__IN_EXECUTIONS:
				return ((InternalEList<?>)getInExecutions()).basicRemove(otherEnd, msgs);
			case OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES:
				return ((InternalEList<?>)getInConditionEdges()).basicRemove(otherEnd, msgs);
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
			case OperationsPackage.DECISION_NODE__OUT_EXECUTIONS:
				return getOutExecutions();
			case OperationsPackage.DECISION_NODE__IN_EXECUTIONS:
				return getInExecutions();
			case OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES:
				return getInConditionEdges();
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
			case OperationsPackage.DECISION_NODE__OUT_EXECUTIONS:
				getOutExecutions().clear();
				getOutExecutions().addAll((Collection<? extends ExecutionEdge>)newValue);
				return;
			case OperationsPackage.DECISION_NODE__IN_EXECUTIONS:
				getInExecutions().clear();
				getInExecutions().addAll((Collection<? extends ExecutionEdge>)newValue);
				return;
			case OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES:
				getInConditionEdges().clear();
				getInConditionEdges().addAll((Collection<? extends ConditionEdge>)newValue);
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
			case OperationsPackage.DECISION_NODE__OUT_EXECUTIONS:
				getOutExecutions().clear();
				return;
			case OperationsPackage.DECISION_NODE__IN_EXECUTIONS:
				getInExecutions().clear();
				return;
			case OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES:
				getInConditionEdges().clear();
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
			case OperationsPackage.DECISION_NODE__OUT_EXECUTIONS:
				return outExecutions != null && !outExecutions.isEmpty();
			case OperationsPackage.DECISION_NODE__IN_EXECUTIONS:
				return inExecutions != null && !inExecutions.isEmpty();
			case OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES:
				return inConditionEdges != null && !inConditionEdges.isEmpty();
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
		if (baseClass == ExecutionEdgesSource.class) {
			switch (derivedFeatureID) {
				case OperationsPackage.DECISION_NODE__OUT_EXECUTIONS: return ModelPackage.EXECUTION_EDGES_SOURCE__OUT_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == ExecutionEdgeDestination.class) {
			switch (derivedFeatureID) {
				case OperationsPackage.DECISION_NODE__IN_EXECUTIONS: return ModelPackage.EXECUTION_EDGE_DESTINATION__IN_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == ConditionEdgeDestination.class) {
			switch (derivedFeatureID) {
				case OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES: return WiresPackage.CONDITION_EDGE_DESTINATION__IN_CONDITION_EDGES;
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
		if (baseClass == ExecutionEdgesSource.class) {
			switch (baseFeatureID) {
				case ModelPackage.EXECUTION_EDGES_SOURCE__OUT_EXECUTIONS: return OperationsPackage.DECISION_NODE__OUT_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == ExecutionEdgeDestination.class) {
			switch (baseFeatureID) {
				case ModelPackage.EXECUTION_EDGE_DESTINATION__IN_EXECUTIONS: return OperationsPackage.DECISION_NODE__IN_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == ConditionEdgeDestination.class) {
			switch (baseFeatureID) {
				case WiresPackage.CONDITION_EDGE_DESTINATION__IN_CONDITION_EDGES: return OperationsPackage.DECISION_NODE__IN_CONDITION_EDGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DecisionNodeImpl
