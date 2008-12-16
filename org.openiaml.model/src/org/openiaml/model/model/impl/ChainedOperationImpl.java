/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openiaml.model.model.ChainedOperation;
import org.openiaml.model.model.ContainsWires;
import org.openiaml.model.model.ExecutionEdge;
import org.openiaml.model.model.ExecutionEdgesSource;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.ShouldntContainWires;
import org.openiaml.model.model.WireEdge;
import org.openiaml.model.model.WireEdgesSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chained Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.impl.ChainedOperationImpl#getOutExecutions <em>Out Executions</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.ChainedOperationImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.ChainedOperationImpl#getOutEdges <em>Out Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainedOperationImpl extends OperationImpl implements ChainedOperation {
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
	 * The cached value of the '{@link #getWires() <em>Wires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWires()
	 * @generated
	 * @ordered
	 */
	protected EList<WireEdge> wires;
	/**
	 * The cached value of the '{@link #getOutEdges() <em>Out Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<WireEdge> outEdges;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainedOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CHAINED_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionEdge> getOutExecutions() {
		if (outExecutions == null) {
			outExecutions = new EObjectWithInverseResolvingEList<ExecutionEdge>(ExecutionEdge.class, this, ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS, ModelPackage.EXECUTION_EDGE__FROM);
		}
		return outExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireEdge> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList<WireEdge>(WireEdge.class, this, ModelPackage.CHAINED_OPERATION__WIRES);
		}
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireEdge> getOutEdges() {
		if (outEdges == null) {
			outEdges = new EObjectWithInverseResolvingEList<WireEdge>(WireEdge.class, this, ModelPackage.CHAINED_OPERATION__OUT_EDGES, ModelPackage.WIRE_EDGE__FROM);
		}
		return outEdges;
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
			case ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutExecutions()).basicAdd(otherEnd, msgs);
			case ModelPackage.CHAINED_OPERATION__OUT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutEdges()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS:
				return ((InternalEList<?>)getOutExecutions()).basicRemove(otherEnd, msgs);
			case ModelPackage.CHAINED_OPERATION__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case ModelPackage.CHAINED_OPERATION__OUT_EDGES:
				return ((InternalEList<?>)getOutEdges()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS:
				return getOutExecutions();
			case ModelPackage.CHAINED_OPERATION__WIRES:
				return getWires();
			case ModelPackage.CHAINED_OPERATION__OUT_EDGES:
				return getOutEdges();
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
			case ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS:
				getOutExecutions().clear();
				getOutExecutions().addAll((Collection<? extends ExecutionEdge>)newValue);
				return;
			case ModelPackage.CHAINED_OPERATION__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends WireEdge>)newValue);
				return;
			case ModelPackage.CHAINED_OPERATION__OUT_EDGES:
				getOutEdges().clear();
				getOutEdges().addAll((Collection<? extends WireEdge>)newValue);
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
			case ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS:
				getOutExecutions().clear();
				return;
			case ModelPackage.CHAINED_OPERATION__WIRES:
				getWires().clear();
				return;
			case ModelPackage.CHAINED_OPERATION__OUT_EDGES:
				getOutEdges().clear();
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
			case ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS:
				return outExecutions != null && !outExecutions.isEmpty();
			case ModelPackage.CHAINED_OPERATION__WIRES:
				return wires != null && !wires.isEmpty();
			case ModelPackage.CHAINED_OPERATION__OUT_EDGES:
				return outEdges != null && !outEdges.isEmpty();
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
				case ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS: return ModelPackage.EXECUTION_EDGES_SOURCE__OUT_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CHAINED_OPERATION__WIRES: return ModelPackage.CONTAINS_WIRES__WIRES;
				default: return -1;
			}
		}
		if (baseClass == ShouldntContainWires.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WireEdgesSource.class) {
			switch (derivedFeatureID) {
				case ModelPackage.CHAINED_OPERATION__OUT_EDGES: return ModelPackage.WIRE_EDGES_SOURCE__OUT_EDGES;
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
				case ModelPackage.EXECUTION_EDGES_SOURCE__OUT_EXECUTIONS: return ModelPackage.CHAINED_OPERATION__OUT_EXECUTIONS;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_WIRES__WIRES: return ModelPackage.CHAINED_OPERATION__WIRES;
				default: return -1;
			}
		}
		if (baseClass == ShouldntContainWires.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WireEdgesSource.class) {
			switch (baseFeatureID) {
				case ModelPackage.WIRE_EDGES_SOURCE__OUT_EDGES: return ModelPackage.CHAINED_OPERATION__OUT_EDGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ChainedOperationImpl
