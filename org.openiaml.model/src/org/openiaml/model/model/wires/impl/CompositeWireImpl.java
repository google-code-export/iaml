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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openiaml.model.model.Action;
import org.openiaml.model.model.ApplicationElement;
import org.openiaml.model.model.Condition;
import org.openiaml.model.model.ContainsConditions;
import org.openiaml.model.model.ContainsWires;
import org.openiaml.model.model.EventTrigger;
import org.openiaml.model.model.GeneratedElement;
import org.openiaml.model.model.GeneratesElements;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.NamedElement;
import org.openiaml.model.model.Operation;
import org.openiaml.model.model.Parameter;
import org.openiaml.model.model.Property;
import org.openiaml.model.model.StaticValue;
import org.openiaml.model.model.Wire;
import org.openiaml.model.model.impl.WireImpl;
import org.openiaml.model.model.wires.CompositeWire;
import org.openiaml.model.model.wires.ConditionEdge;
import org.openiaml.model.model.wires.ConstraintEdge;
import org.openiaml.model.model.wires.ExtendsEdge;
import org.openiaml.model.model.wires.ParameterEdge;
import org.openiaml.model.model.wires.ProvidesEdge;
import org.openiaml.model.model.wires.RequiresEdge;
import org.openiaml.model.model.wires.WiresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Wire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getParameterEdges <em>Parameter Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getExtendsEdges <em>Extends Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getRequiresEdges <em>Requires Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getProvidesEdges <em>Provides Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getConstraintEdges <em>Constraint Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getConditionEdges <em>Condition Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getGeneratedElements <em>Generated Elements</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#isOverridden <em>Overridden</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getEventTriggers <em>Event Triggers</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.openiaml.model.model.wires.impl.CompositeWireImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeWireImpl extends WireImpl implements CompositeWire {
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
	 * The cached value of the '{@link #getWires() <em>Wires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWires()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> wires;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getParameterEdges() <em>Parameter Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterEdge> parameterEdges;

	/**
	 * The cached value of the '{@link #getExtendsEdges() <em>Extends Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendsEdge> extendsEdges;

	/**
	 * The cached value of the '{@link #getRequiresEdges() <em>Requires Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiresEdge> requiresEdges;

	/**
	 * The cached value of the '{@link #getProvidesEdges() <em>Provides Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesEdge> providesEdges;

	/**
	 * The cached value of the '{@link #getConstraintEdges() <em>Constraint Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintEdge> constraintEdges;

	/**
	 * The cached value of the '{@link #getConditionEdges() <em>Condition Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionEdge> conditionEdges;

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
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationElement> children;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getEventTriggers() <em>Event Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<EventTrigger> eventTriggers;

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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeWireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.COMPOSITE_WIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.COMPOSITE_WIRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList<Wire>(Wire.class, this, WiresPackage.COMPOSITE_WIRE__WIRES);
		}
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, WiresPackage.COMPOSITE_WIRE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterEdge> getParameterEdges() {
		if (parameterEdges == null) {
			parameterEdges = new EObjectContainmentEList<ParameterEdge>(ParameterEdge.class, this, WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES);
		}
		return parameterEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendsEdge> getExtendsEdges() {
		if (extendsEdges == null) {
			extendsEdges = new EObjectContainmentEList<ExtendsEdge>(ExtendsEdge.class, this, WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES);
		}
		return extendsEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiresEdge> getRequiresEdges() {
		if (requiresEdges == null) {
			requiresEdges = new EObjectContainmentEList<RequiresEdge>(RequiresEdge.class, this, WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES);
		}
		return requiresEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidesEdge> getProvidesEdges() {
		if (providesEdges == null) {
			providesEdges = new EObjectContainmentEList<ProvidesEdge>(ProvidesEdge.class, this, WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES);
		}
		return providesEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintEdge> getConstraintEdges() {
		if (constraintEdges == null) {
			constraintEdges = new EObjectContainmentEList<ConstraintEdge>(ConstraintEdge.class, this, WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES);
		}
		return constraintEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionEdge> getConditionEdges() {
		if (conditionEdges == null) {
			conditionEdges = new EObjectContainmentEList<ConditionEdge>(ConditionEdge.class, this, WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES);
		}
		return conditionEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedElement> getGeneratedElements() {
		if (generatedElements == null) {
			generatedElements = new EObjectWithInverseResolvingEList.ManyInverse<GeneratedElement>(GeneratedElement.class, this, WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS, ModelPackage.GENERATED_ELEMENT__GENERATED_BY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.COMPOSITE_WIRE__OVERRIDDEN, oldOverridden, overridden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, WiresPackage.COMPOSITE_WIRE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ApplicationElement>(ApplicationElement.class, this, WiresPackage.COMPOSITE_WIRE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, WiresPackage.COMPOSITE_WIRE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, WiresPackage.COMPOSITE_WIRE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventTrigger> getEventTriggers() {
		if (eventTriggers == null) {
			eventTriggers = new EObjectContainmentEList<EventTrigger>(EventTrigger.class, this, WiresPackage.COMPOSITE_WIRE__EVENT_TRIGGERS);
		}
		return eventTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, WiresPackage.COMPOSITE_WIRE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<StaticValue>(StaticValue.class, this, WiresPackage.COMPOSITE_WIRE__VALUES);
		}
		return values;
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
			case WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratedElements()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.COMPOSITE_WIRE__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES:
				return ((InternalEList<?>)getParameterEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES:
				return ((InternalEList<?>)getExtendsEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES:
				return ((InternalEList<?>)getRequiresEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES:
				return ((InternalEList<?>)getProvidesEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES:
				return ((InternalEList<?>)getConstraintEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES:
				return ((InternalEList<?>)getConditionEdges()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS:
				return ((InternalEList<?>)getGeneratedElements()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__EVENT_TRIGGERS:
				return ((InternalEList<?>)getEventTriggers()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case WiresPackage.COMPOSITE_WIRE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.COMPOSITE_WIRE__NAME:
				return getName();
			case WiresPackage.COMPOSITE_WIRE__WIRES:
				return getWires();
			case WiresPackage.COMPOSITE_WIRE__ACTIONS:
				return getActions();
			case WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES:
				return getParameterEdges();
			case WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES:
				return getExtendsEdges();
			case WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES:
				return getRequiresEdges();
			case WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES:
				return getProvidesEdges();
			case WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES:
				return getConstraintEdges();
			case WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES:
				return getConditionEdges();
			case WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS:
				return getGeneratedElements();
			case WiresPackage.COMPOSITE_WIRE__OVERRIDDEN:
				return isOverridden();
			case WiresPackage.COMPOSITE_WIRE__CONDITIONS:
				return getConditions();
			case WiresPackage.COMPOSITE_WIRE__CHILDREN:
				return getChildren();
			case WiresPackage.COMPOSITE_WIRE__PROPERTIES:
				return getProperties();
			case WiresPackage.COMPOSITE_WIRE__OPERATIONS:
				return getOperations();
			case WiresPackage.COMPOSITE_WIRE__EVENT_TRIGGERS:
				return getEventTriggers();
			case WiresPackage.COMPOSITE_WIRE__PARAMETERS:
				return getParameters();
			case WiresPackage.COMPOSITE_WIRE__VALUES:
				return getValues();
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
			case WiresPackage.COMPOSITE_WIRE__NAME:
				setName((String)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES:
				getParameterEdges().clear();
				getParameterEdges().addAll((Collection<? extends ParameterEdge>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES:
				getExtendsEdges().clear();
				getExtendsEdges().addAll((Collection<? extends ExtendsEdge>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES:
				getRequiresEdges().clear();
				getRequiresEdges().addAll((Collection<? extends RequiresEdge>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES:
				getProvidesEdges().clear();
				getProvidesEdges().addAll((Collection<? extends ProvidesEdge>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES:
				getConstraintEdges().clear();
				getConstraintEdges().addAll((Collection<? extends ConstraintEdge>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES:
				getConditionEdges().clear();
				getConditionEdges().addAll((Collection<? extends ConditionEdge>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				getGeneratedElements().addAll((Collection<? extends GeneratedElement>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__OVERRIDDEN:
				setOverridden((Boolean)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ApplicationElement>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__EVENT_TRIGGERS:
				getEventTriggers().clear();
				getEventTriggers().addAll((Collection<? extends EventTrigger>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case WiresPackage.COMPOSITE_WIRE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends StaticValue>)newValue);
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
			case WiresPackage.COMPOSITE_WIRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WiresPackage.COMPOSITE_WIRE__WIRES:
				getWires().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__ACTIONS:
				getActions().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES:
				getParameterEdges().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES:
				getExtendsEdges().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES:
				getRequiresEdges().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES:
				getProvidesEdges().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES:
				getConstraintEdges().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES:
				getConditionEdges().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__OVERRIDDEN:
				setOverridden(OVERRIDDEN_EDEFAULT);
				return;
			case WiresPackage.COMPOSITE_WIRE__CONDITIONS:
				getConditions().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__CHILDREN:
				getChildren().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__PROPERTIES:
				getProperties().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__OPERATIONS:
				getOperations().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__EVENT_TRIGGERS:
				getEventTriggers().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__PARAMETERS:
				getParameters().clear();
				return;
			case WiresPackage.COMPOSITE_WIRE__VALUES:
				getValues().clear();
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
			case WiresPackage.COMPOSITE_WIRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WiresPackage.COMPOSITE_WIRE__WIRES:
				return wires != null && !wires.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES:
				return parameterEdges != null && !parameterEdges.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES:
				return extendsEdges != null && !extendsEdges.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES:
				return requiresEdges != null && !requiresEdges.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES:
				return providesEdges != null && !providesEdges.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES:
				return constraintEdges != null && !constraintEdges.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES:
				return conditionEdges != null && !conditionEdges.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS:
				return generatedElements != null && !generatedElements.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__OVERRIDDEN:
				return overridden != OVERRIDDEN_EDEFAULT;
			case WiresPackage.COMPOSITE_WIRE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__CHILDREN:
				return children != null && !children.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__EVENT_TRIGGERS:
				return eventTriggers != null && !eventTriggers.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WiresPackage.COMPOSITE_WIRE__VALUES:
				return values != null && !values.isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case WiresPackage.COMPOSITE_WIRE__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (derivedFeatureID) {
				case WiresPackage.COMPOSITE_WIRE__WIRES: return ModelPackage.CONTAINS_WIRES__WIRES;
				case WiresPackage.COMPOSITE_WIRE__ACTIONS: return ModelPackage.CONTAINS_WIRES__ACTIONS;
				case WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES: return ModelPackage.CONTAINS_WIRES__PARAMETER_EDGES;
				case WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES: return ModelPackage.CONTAINS_WIRES__EXTENDS_EDGES;
				case WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES: return ModelPackage.CONTAINS_WIRES__REQUIRES_EDGES;
				case WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES: return ModelPackage.CONTAINS_WIRES__PROVIDES_EDGES;
				case WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES: return ModelPackage.CONTAINS_WIRES__CONSTRAINT_EDGES;
				case WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES: return ModelPackage.CONTAINS_WIRES__CONDITION_EDGES;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (derivedFeatureID) {
				case WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS: return ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS;
				case WiresPackage.COMPOSITE_WIRE__OVERRIDDEN: return ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == ContainsConditions.class) {
			switch (derivedFeatureID) {
				case WiresPackage.COMPOSITE_WIRE__CONDITIONS: return ModelPackage.CONTAINS_CONDITIONS__CONDITIONS;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMED_ELEMENT__NAME: return WiresPackage.COMPOSITE_WIRE__NAME;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_WIRES__WIRES: return WiresPackage.COMPOSITE_WIRE__WIRES;
				case ModelPackage.CONTAINS_WIRES__ACTIONS: return WiresPackage.COMPOSITE_WIRE__ACTIONS;
				case ModelPackage.CONTAINS_WIRES__PARAMETER_EDGES: return WiresPackage.COMPOSITE_WIRE__PARAMETER_EDGES;
				case ModelPackage.CONTAINS_WIRES__EXTENDS_EDGES: return WiresPackage.COMPOSITE_WIRE__EXTENDS_EDGES;
				case ModelPackage.CONTAINS_WIRES__REQUIRES_EDGES: return WiresPackage.COMPOSITE_WIRE__REQUIRES_EDGES;
				case ModelPackage.CONTAINS_WIRES__PROVIDES_EDGES: return WiresPackage.COMPOSITE_WIRE__PROVIDES_EDGES;
				case ModelPackage.CONTAINS_WIRES__CONSTRAINT_EDGES: return WiresPackage.COMPOSITE_WIRE__CONSTRAINT_EDGES;
				case ModelPackage.CONTAINS_WIRES__CONDITION_EDGES: return WiresPackage.COMPOSITE_WIRE__CONDITION_EDGES;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (baseFeatureID) {
				case ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS: return WiresPackage.COMPOSITE_WIRE__GENERATED_ELEMENTS;
				case ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN: return WiresPackage.COMPOSITE_WIRE__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == ContainsConditions.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_CONDITIONS__CONDITIONS: return WiresPackage.COMPOSITE_WIRE__CONDITIONS;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", overridden: ");
		result.append(overridden);
		result.append(')');
		return result.toString();
	}

} //CompositeWireImpl