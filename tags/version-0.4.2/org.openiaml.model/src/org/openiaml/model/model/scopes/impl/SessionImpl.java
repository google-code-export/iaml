/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.scopes.impl;

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
import org.openiaml.model.model.ApplicationElement;
import org.openiaml.model.model.ApplicationElementProperty;
import org.openiaml.model.model.CanBeSynced;
import org.openiaml.model.model.Condition;
import org.openiaml.model.model.ContainsConditions;
import org.openiaml.model.model.ContainsEventTriggers;
import org.openiaml.model.model.ContainsOperations;
import org.openiaml.model.model.ContainsScopes;
import org.openiaml.model.model.ContainsWires;
import org.openiaml.model.model.EventTrigger;
import org.openiaml.model.model.GeneratedElement;
import org.openiaml.model.model.GeneratesElements;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.Operation;
import org.openiaml.model.model.QueryParameter;
import org.openiaml.model.model.Scope;
import org.openiaml.model.model.ShouldntContainWires;
import org.openiaml.model.model.StaticValue;
import org.openiaml.model.model.WireEdge;
import org.openiaml.model.model.WireEdgeDestination;
import org.openiaml.model.model.WireEdgesSource;
import org.openiaml.model.model.components.EntryGate;
import org.openiaml.model.model.components.ExitGate;
import org.openiaml.model.model.scopes.ScopesPackage;
import org.openiaml.model.model.scopes.Session;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getGeneratedBy <em>Generated By</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#isIsGenerated <em>Is Generated</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getGeneratedRule <em>Generated Rule</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getGeneratedElements <em>Generated Elements</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#isOverridden <em>Overridden</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getOutEdges <em>Out Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getInEdges <em>In Edges</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getEventTriggers <em>Event Triggers</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getEntryGate <em>Entry Gate</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getExitGate <em>Exit Gate</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.openiaml.model.model.scopes.impl.SessionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionImpl extends EObjectImpl implements Session {
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

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
	 * The cached value of the '{@link #getWires() <em>Wires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWires()
	 * @generated
	 * @ordered
	 */
	protected EList<WireEdge> wires;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> scopes;

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
	 * The cached value of the '{@link #getEventTriggers() <em>Event Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<EventTrigger> eventTriggers;

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
	 * The cached value of the '{@link #getEntryGate() <em>Entry Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryGate()
	 * @generated
	 * @ordered
	 */
	protected EntryGate entryGate;

	/**
	 * The cached value of the '{@link #getExitGate() <em>Exit Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitGate()
	 * @generated
	 * @ordered
	 */
	protected ExitGate exitGate;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationElementProperty> properties;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParameter> parameters;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopesPackage.Literals.SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratesElements> getGeneratedBy() {
		if (generatedBy == null) {
			generatedBy = new EObjectWithInverseResolvingEList.ManyInverse<GeneratesElements>(GeneratesElements.class, this, ScopesPackage.SESSION__GENERATED_BY, ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__IS_GENERATED, oldIsGenerated, isGenerated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__GENERATED_RULE, oldGeneratedRule, generatedRule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireEdge> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList<WireEdge>(WireEdge.class, this, ScopesPackage.SESSION__WIRES);
		}
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryGate getEntryGate() {
		return entryGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryGate(EntryGate newEntryGate, NotificationChain msgs) {
		EntryGate oldEntryGate = entryGate;
		entryGate = newEntryGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__ENTRY_GATE, oldEntryGate, newEntryGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryGate(EntryGate newEntryGate) {
		if (newEntryGate != entryGate) {
			NotificationChain msgs = null;
			if (entryGate != null)
				msgs = ((InternalEObject)entryGate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScopesPackage.SESSION__ENTRY_GATE, null, msgs);
			if (newEntryGate != null)
				msgs = ((InternalEObject)newEntryGate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScopesPackage.SESSION__ENTRY_GATE, null, msgs);
			msgs = basicSetEntryGate(newEntryGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__ENTRY_GATE, newEntryGate, newEntryGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitGate getExitGate() {
		return exitGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitGate(ExitGate newExitGate, NotificationChain msgs) {
		ExitGate oldExitGate = exitGate;
		exitGate = newExitGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__EXIT_GATE, oldExitGate, newExitGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitGate(ExitGate newExitGate) {
		if (newExitGate != exitGate) {
			NotificationChain msgs = null;
			if (exitGate != null)
				msgs = ((InternalEObject)exitGate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScopesPackage.SESSION__EXIT_GATE, null, msgs);
			if (newExitGate != null)
				msgs = ((InternalEObject)newExitGate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScopesPackage.SESSION__EXIT_GATE, null, msgs);
			msgs = basicSetExitGate(newExitGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__EXIT_GATE, newExitGate, newExitGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventTrigger> getEventTriggers() {
		if (eventTriggers == null) {
			eventTriggers = new EObjectContainmentEList<EventTrigger>(EventTrigger.class, this, ScopesPackage.SESSION__EVENT_TRIGGERS);
		}
		return eventTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireEdge> getOutEdges() {
		if (outEdges == null) {
			outEdges = new EObjectWithInverseResolvingEList<WireEdge>(WireEdge.class, this, ScopesPackage.SESSION__OUT_EDGES, ModelPackage.WIRE_EDGE__FROM);
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
			inEdges = new EObjectWithInverseResolvingEList<WireEdge>(WireEdge.class, this, ScopesPackage.SESSION__IN_EDGES, ModelPackage.WIRE_EDGE__TO);
		}
		return inEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, ScopesPackage.SESSION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedElement> getGeneratedElements() {
		if (generatedElements == null) {
			generatedElements = new EObjectWithInverseResolvingEList.ManyInverse<GeneratedElement>(GeneratedElement.class, this, ScopesPackage.SESSION__GENERATED_ELEMENTS, ModelPackage.GENERATED_ELEMENT__GENERATED_BY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScopesPackage.SESSION__OVERRIDDEN, oldOverridden, overridden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationElementProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ApplicationElementProperty>(ApplicationElementProperty.class, this, ScopesPackage.SESSION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<StaticValue>(StaticValue.class, this, ScopesPackage.SESSION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<QueryParameter>(QueryParameter.class, this, ScopesPackage.SESSION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ApplicationElement>(ApplicationElement.class, this, ScopesPackage.SESSION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getScopes() {
		if (scopes == null) {
			scopes = new EObjectContainmentEList<Scope>(Scope.class, this, ScopesPackage.SESSION__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, ScopesPackage.SESSION__OPERATIONS);
		}
		return operations;
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
			case ScopesPackage.SESSION__GENERATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratedBy()).basicAdd(otherEnd, msgs);
			case ScopesPackage.SESSION__GENERATED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratedElements()).basicAdd(otherEnd, msgs);
			case ScopesPackage.SESSION__OUT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutEdges()).basicAdd(otherEnd, msgs);
			case ScopesPackage.SESSION__IN_EDGES:
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
			case ScopesPackage.SESSION__GENERATED_BY:
				return ((InternalEList<?>)getGeneratedBy()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__GENERATED_ELEMENTS:
				return ((InternalEList<?>)getGeneratedElements()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__OUT_EDGES:
				return ((InternalEList<?>)getOutEdges()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__IN_EDGES:
				return ((InternalEList<?>)getInEdges()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__EVENT_TRIGGERS:
				return ((InternalEList<?>)getEventTriggers()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__ENTRY_GATE:
				return basicSetEntryGate(null, msgs);
			case ScopesPackage.SESSION__EXIT_GATE:
				return basicSetExitGate(null, msgs);
			case ScopesPackage.SESSION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ScopesPackage.SESSION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case ScopesPackage.SESSION__GENERATED_BY:
				return getGeneratedBy();
			case ScopesPackage.SESSION__IS_GENERATED:
				return isIsGenerated();
			case ScopesPackage.SESSION__ID:
				return getId();
			case ScopesPackage.SESSION__GENERATED_RULE:
				return getGeneratedRule();
			case ScopesPackage.SESSION__NAME:
				return getName();
			case ScopesPackage.SESSION__OPERATIONS:
				return getOperations();
			case ScopesPackage.SESSION__GENERATED_ELEMENTS:
				return getGeneratedElements();
			case ScopesPackage.SESSION__OVERRIDDEN:
				return isOverridden();
			case ScopesPackage.SESSION__WIRES:
				return getWires();
			case ScopesPackage.SESSION__SCOPES:
				return getScopes();
			case ScopesPackage.SESSION__OUT_EDGES:
				return getOutEdges();
			case ScopesPackage.SESSION__IN_EDGES:
				return getInEdges();
			case ScopesPackage.SESSION__EVENT_TRIGGERS:
				return getEventTriggers();
			case ScopesPackage.SESSION__CONDITIONS:
				return getConditions();
			case ScopesPackage.SESSION__ENTRY_GATE:
				return getEntryGate();
			case ScopesPackage.SESSION__EXIT_GATE:
				return getExitGate();
			case ScopesPackage.SESSION__PROPERTIES:
				return getProperties();
			case ScopesPackage.SESSION__VALUES:
				return getValues();
			case ScopesPackage.SESSION__PARAMETERS:
				return getParameters();
			case ScopesPackage.SESSION__ELEMENTS:
				return getElements();
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
			case ScopesPackage.SESSION__GENERATED_BY:
				getGeneratedBy().clear();
				getGeneratedBy().addAll((Collection<? extends GeneratesElements>)newValue);
				return;
			case ScopesPackage.SESSION__IS_GENERATED:
				setIsGenerated((Boolean)newValue);
				return;
			case ScopesPackage.SESSION__ID:
				setId((String)newValue);
				return;
			case ScopesPackage.SESSION__GENERATED_RULE:
				setGeneratedRule((String)newValue);
				return;
			case ScopesPackage.SESSION__NAME:
				setName((String)newValue);
				return;
			case ScopesPackage.SESSION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case ScopesPackage.SESSION__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				getGeneratedElements().addAll((Collection<? extends GeneratedElement>)newValue);
				return;
			case ScopesPackage.SESSION__OVERRIDDEN:
				setOverridden((Boolean)newValue);
				return;
			case ScopesPackage.SESSION__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends WireEdge>)newValue);
				return;
			case ScopesPackage.SESSION__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends Scope>)newValue);
				return;
			case ScopesPackage.SESSION__OUT_EDGES:
				getOutEdges().clear();
				getOutEdges().addAll((Collection<? extends WireEdge>)newValue);
				return;
			case ScopesPackage.SESSION__IN_EDGES:
				getInEdges().clear();
				getInEdges().addAll((Collection<? extends WireEdge>)newValue);
				return;
			case ScopesPackage.SESSION__EVENT_TRIGGERS:
				getEventTriggers().clear();
				getEventTriggers().addAll((Collection<? extends EventTrigger>)newValue);
				return;
			case ScopesPackage.SESSION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case ScopesPackage.SESSION__ENTRY_GATE:
				setEntryGate((EntryGate)newValue);
				return;
			case ScopesPackage.SESSION__EXIT_GATE:
				setExitGate((ExitGate)newValue);
				return;
			case ScopesPackage.SESSION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends ApplicationElementProperty>)newValue);
				return;
			case ScopesPackage.SESSION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends StaticValue>)newValue);
				return;
			case ScopesPackage.SESSION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends QueryParameter>)newValue);
				return;
			case ScopesPackage.SESSION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ApplicationElement>)newValue);
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
			case ScopesPackage.SESSION__GENERATED_BY:
				getGeneratedBy().clear();
				return;
			case ScopesPackage.SESSION__IS_GENERATED:
				setIsGenerated(IS_GENERATED_EDEFAULT);
				return;
			case ScopesPackage.SESSION__ID:
				setId(ID_EDEFAULT);
				return;
			case ScopesPackage.SESSION__GENERATED_RULE:
				setGeneratedRule(GENERATED_RULE_EDEFAULT);
				return;
			case ScopesPackage.SESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScopesPackage.SESSION__OPERATIONS:
				getOperations().clear();
				return;
			case ScopesPackage.SESSION__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				return;
			case ScopesPackage.SESSION__OVERRIDDEN:
				setOverridden(OVERRIDDEN_EDEFAULT);
				return;
			case ScopesPackage.SESSION__WIRES:
				getWires().clear();
				return;
			case ScopesPackage.SESSION__SCOPES:
				getScopes().clear();
				return;
			case ScopesPackage.SESSION__OUT_EDGES:
				getOutEdges().clear();
				return;
			case ScopesPackage.SESSION__IN_EDGES:
				getInEdges().clear();
				return;
			case ScopesPackage.SESSION__EVENT_TRIGGERS:
				getEventTriggers().clear();
				return;
			case ScopesPackage.SESSION__CONDITIONS:
				getConditions().clear();
				return;
			case ScopesPackage.SESSION__ENTRY_GATE:
				setEntryGate((EntryGate)null);
				return;
			case ScopesPackage.SESSION__EXIT_GATE:
				setExitGate((ExitGate)null);
				return;
			case ScopesPackage.SESSION__PROPERTIES:
				getProperties().clear();
				return;
			case ScopesPackage.SESSION__VALUES:
				getValues().clear();
				return;
			case ScopesPackage.SESSION__PARAMETERS:
				getParameters().clear();
				return;
			case ScopesPackage.SESSION__ELEMENTS:
				getElements().clear();
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
			case ScopesPackage.SESSION__GENERATED_BY:
				return generatedBy != null && !generatedBy.isEmpty();
			case ScopesPackage.SESSION__IS_GENERATED:
				return isGenerated != IS_GENERATED_EDEFAULT;
			case ScopesPackage.SESSION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ScopesPackage.SESSION__GENERATED_RULE:
				return GENERATED_RULE_EDEFAULT == null ? generatedRule != null : !GENERATED_RULE_EDEFAULT.equals(generatedRule);
			case ScopesPackage.SESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScopesPackage.SESSION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ScopesPackage.SESSION__GENERATED_ELEMENTS:
				return generatedElements != null && !generatedElements.isEmpty();
			case ScopesPackage.SESSION__OVERRIDDEN:
				return overridden != OVERRIDDEN_EDEFAULT;
			case ScopesPackage.SESSION__WIRES:
				return wires != null && !wires.isEmpty();
			case ScopesPackage.SESSION__SCOPES:
				return scopes != null && !scopes.isEmpty();
			case ScopesPackage.SESSION__OUT_EDGES:
				return outEdges != null && !outEdges.isEmpty();
			case ScopesPackage.SESSION__IN_EDGES:
				return inEdges != null && !inEdges.isEmpty();
			case ScopesPackage.SESSION__EVENT_TRIGGERS:
				return eventTriggers != null && !eventTriggers.isEmpty();
			case ScopesPackage.SESSION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case ScopesPackage.SESSION__ENTRY_GATE:
				return entryGate != null;
			case ScopesPackage.SESSION__EXIT_GATE:
				return exitGate != null;
			case ScopesPackage.SESSION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ScopesPackage.SESSION__VALUES:
				return values != null && !values.isEmpty();
			case ScopesPackage.SESSION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ScopesPackage.SESSION__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
		if (baseClass == ContainsOperations.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__OPERATIONS: return ModelPackage.CONTAINS_OPERATIONS__OPERATIONS;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__GENERATED_ELEMENTS: return ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS;
				case ScopesPackage.SESSION__OVERRIDDEN: return ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__WIRES: return ModelPackage.CONTAINS_WIRES__WIRES;
				default: return -1;
			}
		}
		if (baseClass == ContainsScopes.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__SCOPES: return ModelPackage.CONTAINS_SCOPES__SCOPES;
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
				case ScopesPackage.SESSION__OUT_EDGES: return ModelPackage.WIRE_EDGES_SOURCE__OUT_EDGES;
				default: return -1;
			}
		}
		if (baseClass == WireEdgeDestination.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__IN_EDGES: return ModelPackage.WIRE_EDGE_DESTINATION__IN_EDGES;
				default: return -1;
			}
		}
		if (baseClass == ContainsEventTriggers.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__EVENT_TRIGGERS: return ModelPackage.CONTAINS_EVENT_TRIGGERS__EVENT_TRIGGERS;
				default: return -1;
			}
		}
		if (baseClass == ContainsConditions.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__CONDITIONS: return ModelPackage.CONTAINS_CONDITIONS__CONDITIONS;
				default: return -1;
			}
		}
		if (baseClass == CanBeSynced.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Scope.class) {
			switch (derivedFeatureID) {
				case ScopesPackage.SESSION__ENTRY_GATE: return ModelPackage.SCOPE__ENTRY_GATE;
				case ScopesPackage.SESSION__EXIT_GATE: return ModelPackage.SCOPE__EXIT_GATE;
				case ScopesPackage.SESSION__PROPERTIES: return ModelPackage.SCOPE__PROPERTIES;
				case ScopesPackage.SESSION__VALUES: return ModelPackage.SCOPE__VALUES;
				case ScopesPackage.SESSION__PARAMETERS: return ModelPackage.SCOPE__PARAMETERS;
				case ScopesPackage.SESSION__ELEMENTS: return ModelPackage.SCOPE__ELEMENTS;
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
		if (baseClass == ContainsOperations.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_OPERATIONS__OPERATIONS: return ScopesPackage.SESSION__OPERATIONS;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (baseFeatureID) {
				case ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS: return ScopesPackage.SESSION__GENERATED_ELEMENTS;
				case ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN: return ScopesPackage.SESSION__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_WIRES__WIRES: return ScopesPackage.SESSION__WIRES;
				default: return -1;
			}
		}
		if (baseClass == ContainsScopes.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_SCOPES__SCOPES: return ScopesPackage.SESSION__SCOPES;
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
				case ModelPackage.WIRE_EDGES_SOURCE__OUT_EDGES: return ScopesPackage.SESSION__OUT_EDGES;
				default: return -1;
			}
		}
		if (baseClass == WireEdgeDestination.class) {
			switch (baseFeatureID) {
				case ModelPackage.WIRE_EDGE_DESTINATION__IN_EDGES: return ScopesPackage.SESSION__IN_EDGES;
				default: return -1;
			}
		}
		if (baseClass == ContainsEventTriggers.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_EVENT_TRIGGERS__EVENT_TRIGGERS: return ScopesPackage.SESSION__EVENT_TRIGGERS;
				default: return -1;
			}
		}
		if (baseClass == ContainsConditions.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_CONDITIONS__CONDITIONS: return ScopesPackage.SESSION__CONDITIONS;
				default: return -1;
			}
		}
		if (baseClass == CanBeSynced.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Scope.class) {
			switch (baseFeatureID) {
				case ModelPackage.SCOPE__ENTRY_GATE: return ScopesPackage.SESSION__ENTRY_GATE;
				case ModelPackage.SCOPE__EXIT_GATE: return ScopesPackage.SESSION__EXIT_GATE;
				case ModelPackage.SCOPE__PROPERTIES: return ScopesPackage.SESSION__PROPERTIES;
				case ModelPackage.SCOPE__VALUES: return ScopesPackage.SESSION__VALUES;
				case ModelPackage.SCOPE__PARAMETERS: return ScopesPackage.SESSION__PARAMETERS;
				case ModelPackage.SCOPE__ELEMENTS: return ScopesPackage.SESSION__ELEMENTS;
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

} //SessionImpl