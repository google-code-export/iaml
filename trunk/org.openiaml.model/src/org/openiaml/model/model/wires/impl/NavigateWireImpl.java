/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.wires.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openiaml.model.model.Action;
import org.openiaml.model.model.ActionDestination;
import org.openiaml.model.model.ActionSource;
import org.openiaml.model.model.GeneratedElement;
import org.openiaml.model.model.GeneratesElements;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.NamedElement;
import org.openiaml.model.model.Wire;
import org.openiaml.model.model.wires.ConditionEdge;
import org.openiaml.model.model.wires.ConditionEdgeDestination;
import org.openiaml.model.model.wires.NavigateWire;
import org.openiaml.model.model.wires.WiresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigate Wire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getInWires <em>In Wires</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getGeneratedBy <em>Generated By</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#isIsGenerated <em>Is Generated</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getGeneratedRule <em>Generated Rule</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getGeneratedElements <em>Generated Elements</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#isOverridden <em>Overridden</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getInConditionEdges <em>In Condition Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.NavigateWireImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigateWireImpl extends EObjectImpl implements NavigateWire {
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
	 * The cached value of the '{@link #getGeneratedElements() <em>Generated Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratedElement> generatedElements;
	/**
	 * The default value of the '{@link #isOverridden() <em>Overridden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverridden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERRIDDEN_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOverridden() <em>Overridden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverridden()
	 * @generated
	 * @ordered
	 */
	protected boolean overridden = OVERRIDDEN_EDEFAULT;

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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected ActionSource from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ActionDestination to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigateWireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.NAVIGATE_WIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getInWires() {
		if (inWires == null) {
			inWires = new EObjectWithInverseResolvingEList<Wire>(Wire.class, this, WiresPackage.NAVIGATE_WIRE__IN_WIRES, ModelPackage.WIRE__TO);
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
			generatedBy = new EObjectWithInverseResolvingEList.ManyInverse<GeneratesElements>(GeneratesElements.class, this, WiresPackage.NAVIGATE_WIRE__GENERATED_BY, ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__IS_GENERATED, oldIsGenerated, isGenerated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__GENERATED_RULE, oldGeneratedRule, generatedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSource getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (ActionSource)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.NAVIGATE_WIRE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSource basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(ActionSource newFrom, NotificationChain msgs) {
		ActionSource oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(ActionSource newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, ModelPackage.ACTION_SOURCE__OUT_ACTIONS, ActionSource.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, ModelPackage.ACTION_SOURCE__OUT_ACTIONS, ActionSource.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDestination getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (ActionDestination)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.NAVIGATE_WIRE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDestination basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(ActionDestination newTo, NotificationChain msgs) {
		ActionDestination oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ActionDestination newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, ModelPackage.ACTION_DESTINATION__IN_ACTIONS, ActionDestination.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, ModelPackage.ACTION_DESTINATION__IN_ACTIONS, ActionDestination.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__TO, newTo, newTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedElement> getGeneratedElements() {
		if (generatedElements == null) {
			generatedElements = new EObjectWithInverseResolvingEList.ManyInverse<GeneratedElement>(GeneratedElement.class, this, WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS, ModelPackage.GENERATED_ELEMENT__GENERATED_BY);
		}
		return generatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverridden() {
		return overridden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverridden(boolean newOverridden) {
		boolean oldOverridden = overridden;
		overridden = newOverridden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.NAVIGATE_WIRE__OVERRIDDEN, oldOverridden, overridden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionEdge> getInConditionEdges() {
		if (inConditionEdges == null) {
			inConditionEdges = new EObjectWithInverseResolvingEList<ConditionEdge>(ConditionEdge.class, this, WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES, WiresPackage.CONDITION_EDGE__TO);
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
			case WiresPackage.NAVIGATE_WIRE__IN_WIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInWires()).basicAdd(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__GENERATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratedBy()).basicAdd(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratedElements()).basicAdd(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInConditionEdges()).basicAdd(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, ModelPackage.ACTION_SOURCE__OUT_ACTIONS, ActionSource.class, msgs);
				return basicSetFrom((ActionSource)otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, ModelPackage.ACTION_DESTINATION__IN_ACTIONS, ActionDestination.class, msgs);
				return basicSetTo((ActionDestination)otherEnd, msgs);
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
			case WiresPackage.NAVIGATE_WIRE__IN_WIRES:
				return ((InternalEList<?>)getInWires()).basicRemove(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__GENERATED_BY:
				return ((InternalEList<?>)getGeneratedBy()).basicRemove(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS:
				return ((InternalEList<?>)getGeneratedElements()).basicRemove(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES:
				return ((InternalEList<?>)getInConditionEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.NAVIGATE_WIRE__FROM:
				return basicSetFrom(null, msgs);
			case WiresPackage.NAVIGATE_WIRE__TO:
				return basicSetTo(null, msgs);
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
			case WiresPackage.NAVIGATE_WIRE__IN_WIRES:
				return getInWires();
			case WiresPackage.NAVIGATE_WIRE__GENERATED_BY:
				return getGeneratedBy();
			case WiresPackage.NAVIGATE_WIRE__IS_GENERATED:
				return isIsGenerated();
			case WiresPackage.NAVIGATE_WIRE__ID:
				return getId();
			case WiresPackage.NAVIGATE_WIRE__GENERATED_RULE:
				return getGeneratedRule();
			case WiresPackage.NAVIGATE_WIRE__NAME:
				return getName();
			case WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS:
				return getGeneratedElements();
			case WiresPackage.NAVIGATE_WIRE__OVERRIDDEN:
				return isOverridden();
			case WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES:
				return getInConditionEdges();
			case WiresPackage.NAVIGATE_WIRE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case WiresPackage.NAVIGATE_WIRE__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case WiresPackage.NAVIGATE_WIRE__IN_WIRES:
				getInWires().clear();
				getInWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__GENERATED_BY:
				getGeneratedBy().clear();
				getGeneratedBy().addAll((Collection<? extends GeneratesElements>)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__IS_GENERATED:
				setIsGenerated((Boolean)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__ID:
				setId((String)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__GENERATED_RULE:
				setGeneratedRule((String)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__NAME:
				setName((String)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				getGeneratedElements().addAll((Collection<? extends GeneratedElement>)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__OVERRIDDEN:
				setOverridden((Boolean)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES:
				getInConditionEdges().clear();
				getInConditionEdges().addAll((Collection<? extends ConditionEdge>)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__FROM:
				setFrom((ActionSource)newValue);
				return;
			case WiresPackage.NAVIGATE_WIRE__TO:
				setTo((ActionDestination)newValue);
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
			case WiresPackage.NAVIGATE_WIRE__IN_WIRES:
				getInWires().clear();
				return;
			case WiresPackage.NAVIGATE_WIRE__GENERATED_BY:
				getGeneratedBy().clear();
				return;
			case WiresPackage.NAVIGATE_WIRE__IS_GENERATED:
				setIsGenerated(IS_GENERATED_EDEFAULT);
				return;
			case WiresPackage.NAVIGATE_WIRE__ID:
				setId(ID_EDEFAULT);
				return;
			case WiresPackage.NAVIGATE_WIRE__GENERATED_RULE:
				setGeneratedRule(GENERATED_RULE_EDEFAULT);
				return;
			case WiresPackage.NAVIGATE_WIRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				return;
			case WiresPackage.NAVIGATE_WIRE__OVERRIDDEN:
				setOverridden(OVERRIDDEN_EDEFAULT);
				return;
			case WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES:
				getInConditionEdges().clear();
				return;
			case WiresPackage.NAVIGATE_WIRE__FROM:
				setFrom((ActionSource)null);
				return;
			case WiresPackage.NAVIGATE_WIRE__TO:
				setTo((ActionDestination)null);
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
			case WiresPackage.NAVIGATE_WIRE__IN_WIRES:
				return inWires != null && !inWires.isEmpty();
			case WiresPackage.NAVIGATE_WIRE__GENERATED_BY:
				return generatedBy != null && !generatedBy.isEmpty();
			case WiresPackage.NAVIGATE_WIRE__IS_GENERATED:
				return isGenerated != IS_GENERATED_EDEFAULT;
			case WiresPackage.NAVIGATE_WIRE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WiresPackage.NAVIGATE_WIRE__GENERATED_RULE:
				return GENERATED_RULE_EDEFAULT == null ? generatedRule != null : !GENERATED_RULE_EDEFAULT.equals(generatedRule);
			case WiresPackage.NAVIGATE_WIRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS:
				return generatedElements != null && !generatedElements.isEmpty();
			case WiresPackage.NAVIGATE_WIRE__OVERRIDDEN:
				return overridden != OVERRIDDEN_EDEFAULT;
			case WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES:
				return inConditionEdges != null && !inConditionEdges.isEmpty();
			case WiresPackage.NAVIGATE_WIRE__FROM:
				return from != null;
			case WiresPackage.NAVIGATE_WIRE__TO:
				return to != null;
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
				case WiresPackage.NAVIGATE_WIRE__GENERATED_BY: return ModelPackage.GENERATED_ELEMENT__GENERATED_BY;
				case WiresPackage.NAVIGATE_WIRE__IS_GENERATED: return ModelPackage.GENERATED_ELEMENT__IS_GENERATED;
				case WiresPackage.NAVIGATE_WIRE__ID: return ModelPackage.GENERATED_ELEMENT__ID;
				case WiresPackage.NAVIGATE_WIRE__GENERATED_RULE: return ModelPackage.GENERATED_ELEMENT__GENERATED_RULE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case WiresPackage.NAVIGATE_WIRE__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (derivedFeatureID) {
				case WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS: return ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS;
				case WiresPackage.NAVIGATE_WIRE__OVERRIDDEN: return ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == ConditionEdgeDestination.class) {
			switch (derivedFeatureID) {
				case WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES: return WiresPackage.CONDITION_EDGE_DESTINATION__IN_CONDITION_EDGES;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (derivedFeatureID) {
				case WiresPackage.NAVIGATE_WIRE__FROM: return ModelPackage.ACTION__FROM;
				case WiresPackage.NAVIGATE_WIRE__TO: return ModelPackage.ACTION__TO;
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
				case ModelPackage.GENERATED_ELEMENT__GENERATED_BY: return WiresPackage.NAVIGATE_WIRE__GENERATED_BY;
				case ModelPackage.GENERATED_ELEMENT__IS_GENERATED: return WiresPackage.NAVIGATE_WIRE__IS_GENERATED;
				case ModelPackage.GENERATED_ELEMENT__ID: return WiresPackage.NAVIGATE_WIRE__ID;
				case ModelPackage.GENERATED_ELEMENT__GENERATED_RULE: return WiresPackage.NAVIGATE_WIRE__GENERATED_RULE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMED_ELEMENT__NAME: return WiresPackage.NAVIGATE_WIRE__NAME;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (baseFeatureID) {
				case ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS: return WiresPackage.NAVIGATE_WIRE__GENERATED_ELEMENTS;
				case ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN: return WiresPackage.NAVIGATE_WIRE__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == ConditionEdgeDestination.class) {
			switch (baseFeatureID) {
				case WiresPackage.CONDITION_EDGE_DESTINATION__IN_CONDITION_EDGES: return WiresPackage.NAVIGATE_WIRE__IN_CONDITION_EDGES;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (baseFeatureID) {
				case ModelPackage.ACTION__FROM: return WiresPackage.NAVIGATE_WIRE__FROM;
				case ModelPackage.ACTION__TO: return WiresPackage.NAVIGATE_WIRE__TO;
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
		result.append(", overridden: ");
		result.append(overridden);
		result.append(')');
		return result.toString();
	}

} //NavigateWireImpl
