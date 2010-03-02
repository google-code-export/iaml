/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.wires.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openiaml.model.model.ContainsWires;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.ShouldntContainWires;
import org.openiaml.model.model.WireEdge;
import org.openiaml.model.model.WireEdgeDestination;
import org.openiaml.model.model.WireEdgesSource;
import org.openiaml.model.model.wires.RequiresWire;
import org.openiaml.model.model.wires.WiresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires Wire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.wires.impl.RequiresWireImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.RequiresWireImpl#getOutEdges <em>Out Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.RequiresWireImpl#getInEdges <em>In Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiresWireImpl extends SingleWireImpl implements RequiresWire {
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
	 * The cached value of the '{@link #getInEdges() <em>In Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<WireEdge> inEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiresWireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REQUIRES_WIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireEdge> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList<WireEdge>(WireEdge.class, this, WiresPackage.REQUIRES_WIRE__WIRES);
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
			outEdges = new EObjectWithInverseResolvingEList<WireEdge>(WireEdge.class, this, WiresPackage.REQUIRES_WIRE__OUT_EDGES, ModelPackage.WIRE_EDGE__FROM);
		}
		return outEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireEdge> getInEdges() {
		if (inEdges == null) {
			inEdges = new EObjectWithInverseResolvingEList<WireEdge>(WireEdge.class, this, WiresPackage.REQUIRES_WIRE__IN_EDGES, ModelPackage.WIRE_EDGE__TO);
		}
		return inEdges;
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
			case WiresPackage.REQUIRES_WIRE__OUT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutEdges()).basicAdd(otherEnd, msgs);
			case WiresPackage.REQUIRES_WIRE__IN_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInEdges()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REQUIRES_WIRE__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case WiresPackage.REQUIRES_WIRE__OUT_EDGES:
				return ((InternalEList<?>)getOutEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.REQUIRES_WIRE__IN_EDGES:
				return ((InternalEList<?>)getInEdges()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REQUIRES_WIRE__WIRES:
				return getWires();
			case WiresPackage.REQUIRES_WIRE__OUT_EDGES:
				return getOutEdges();
			case WiresPackage.REQUIRES_WIRE__IN_EDGES:
				return getInEdges();
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
			case WiresPackage.REQUIRES_WIRE__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends WireEdge>)newValue);
				return;
			case WiresPackage.REQUIRES_WIRE__OUT_EDGES:
				getOutEdges().clear();
				getOutEdges().addAll((Collection<? extends WireEdge>)newValue);
				return;
			case WiresPackage.REQUIRES_WIRE__IN_EDGES:
				getInEdges().clear();
				getInEdges().addAll((Collection<? extends WireEdge>)newValue);
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
			case WiresPackage.REQUIRES_WIRE__WIRES:
				getWires().clear();
				return;
			case WiresPackage.REQUIRES_WIRE__OUT_EDGES:
				getOutEdges().clear();
				return;
			case WiresPackage.REQUIRES_WIRE__IN_EDGES:
				getInEdges().clear();
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
			case WiresPackage.REQUIRES_WIRE__WIRES:
				return wires != null && !wires.isEmpty();
			case WiresPackage.REQUIRES_WIRE__OUT_EDGES:
				return outEdges != null && !outEdges.isEmpty();
			case WiresPackage.REQUIRES_WIRE__IN_EDGES:
				return inEdges != null && !inEdges.isEmpty();
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
		if (baseClass == ContainsWires.class) {
			switch (derivedFeatureID) {
				case WiresPackage.REQUIRES_WIRE__WIRES: return ModelPackage.CONTAINS_WIRES__WIRES;
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
				case WiresPackage.REQUIRES_WIRE__OUT_EDGES: return ModelPackage.WIRE_EDGES_SOURCE__OUT_EDGES;
				default: return -1;
			}
		}
		if (baseClass == WireEdgeDestination.class) {
			switch (derivedFeatureID) {
				case WiresPackage.REQUIRES_WIRE__IN_EDGES: return ModelPackage.WIRE_EDGE_DESTINATION__IN_EDGES;
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
		if (baseClass == ContainsWires.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_WIRES__WIRES: return WiresPackage.REQUIRES_WIRE__WIRES;
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
				case ModelPackage.WIRE_EDGES_SOURCE__OUT_EDGES: return WiresPackage.REQUIRES_WIRE__OUT_EDGES;
				default: return -1;
			}
		}
		if (baseClass == WireEdgeDestination.class) {
			switch (baseFeatureID) {
				case ModelPackage.WIRE_EDGE_DESTINATION__IN_EDGES: return WiresPackage.REQUIRES_WIRE__IN_EDGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RequiresWireImpl