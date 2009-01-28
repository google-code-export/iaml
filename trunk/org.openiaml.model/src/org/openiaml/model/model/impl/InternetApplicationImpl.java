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
import org.openiaml.model.model.ApplicationElement;
import org.openiaml.model.model.ApplicationElementProperty;
import org.openiaml.model.model.ContainsEventTriggers;
import org.openiaml.model.model.ContainsWires;
import org.openiaml.model.model.DerivedView;
import org.openiaml.model.model.DomainObject;
import org.openiaml.model.model.DomainObjectInstance;
import org.openiaml.model.model.DomainStore;
import org.openiaml.model.model.EventTrigger;
import org.openiaml.model.model.GeneratedElement;
import org.openiaml.model.model.GeneratesElements;
import org.openiaml.model.model.InternetApplication;
import org.openiaml.model.model.ModelPackage;
import org.openiaml.model.model.NamedElement;
import org.openiaml.model.model.Operation;
import org.openiaml.model.model.Scope;
import org.openiaml.model.model.WireEdge;
import org.openiaml.model.model.components.LoginHandler;
import org.openiaml.model.model.domain.FileDomainStore;
import org.openiaml.model.model.scopes.Session;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internet Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getEventTriggers <em>Event Triggers</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getGeneratedBy <em>Generated By</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#isIsGenerated <em>Is Generated</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getGeneratedElements <em>Generated Elements</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#isOverridden <em>Overridden</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getDomainObjects <em>Domain Objects</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getDomainViews <em>Domain Views</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getDomainInstances <em>Domain Instances</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getDomainStores <em>Domain Stores</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getRuntimeUrl <em>Runtime Url</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getLoginHandlers <em>Login Handlers</em>}</li>
 *   <li>{@link org.openiaml.model.model.impl.InternetApplicationImpl#getFileDomainStores <em>File Domain Stores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternetApplicationImpl extends EObjectImpl implements InternetApplication {
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
	 * The cached value of the '{@link #getGeneratedBy() <em>Generated By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedBy()
	 * @generated
	 * @ordered
	 */
	protected GeneratesElements generatedBy;

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
	protected EList<WireEdge> wires;

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
	 * The cached value of the '{@link #getDomainObjects() <em>Domain Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainObjects;

	/**
	 * The cached value of the '{@link #getDomainViews() <em>Domain Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainViews()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivedView> domainViews;

	/**
	 * The cached value of the '{@link #getDomainInstances() <em>Domain Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectInstance> domainInstances;

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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationElement> children;

	/**
	 * The cached value of the '{@link #getDomainStores() <em>Domain Stores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainStores()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainStore> domainStores;

	/**
	 * The default value of the '{@link #getRuntimeUrl() <em>Runtime Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_URL_EDEFAULT = "http://localhost:8080/output/";

	/**
	 * The cached value of the '{@link #getRuntimeUrl() <em>Runtime Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeUrl()
	 * @generated
	 * @ordered
	 */
	protected String runtimeUrl = RUNTIME_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSessions() <em>Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessions;

	/**
	 * The cached value of the '{@link #getLoginHandlers() <em>Login Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<LoginHandler> loginHandlers;

	/**
	 * The cached value of the '{@link #getFileDomainStores() <em>File Domain Stores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDomainStores()
	 * @generated
	 * @ordered
	 */
	protected EList<FileDomainStore> fileDomainStores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternetApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INTERNET_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, ModelPackage.INTERNET_APPLICATION__OPERATIONS);
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
			eventTriggers = new EObjectContainmentEList<EventTrigger>(EventTrigger.class, this, ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS);
		}
		return eventTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratesElements getGeneratedBy() {
		if (generatedBy != null && generatedBy.eIsProxy()) {
			InternalEObject oldGeneratedBy = (InternalEObject)generatedBy;
			generatedBy = (GeneratesElements)eResolveProxy(oldGeneratedBy);
			if (generatedBy != oldGeneratedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.INTERNET_APPLICATION__GENERATED_BY, oldGeneratedBy, generatedBy));
			}
		}
		return generatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratesElements basicGetGeneratedBy() {
		return generatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedBy(GeneratesElements newGeneratedBy, NotificationChain msgs) {
		GeneratesElements oldGeneratedBy = generatedBy;
		generatedBy = newGeneratedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INTERNET_APPLICATION__GENERATED_BY, oldGeneratedBy, newGeneratedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedBy(GeneratesElements newGeneratedBy) {
		if (newGeneratedBy != generatedBy) {
			NotificationChain msgs = null;
			if (generatedBy != null)
				msgs = ((InternalEObject)generatedBy).eInverseRemove(this, ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS, GeneratesElements.class, msgs);
			if (newGeneratedBy != null)
				msgs = ((InternalEObject)newGeneratedBy).eInverseAdd(this, ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS, GeneratesElements.class, msgs);
			msgs = basicSetGeneratedBy(newGeneratedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERNET_APPLICATION__GENERATED_BY, newGeneratedBy, newGeneratedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERNET_APPLICATION__IS_GENERATED, oldIsGenerated, isGenerated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERNET_APPLICATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERNET_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireEdge> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList<WireEdge>(WireEdge.class, this, ModelPackage.INTERNET_APPLICATION__WIRES);
		}
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedElement> getGeneratedElements() {
		if (generatedElements == null) {
			generatedElements = new EObjectWithInverseResolvingEList<GeneratedElement>(GeneratedElement.class, this, ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS, ModelPackage.GENERATED_ELEMENT__GENERATED_BY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERNET_APPLICATION__OVERRIDDEN, oldOverridden, overridden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObject> getDomainObjects() {
		if (domainObjects == null) {
			domainObjects = new EObjectContainmentEList<DomainObject>(DomainObject.class, this, ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS);
		}
		return domainObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivedView> getDomainViews() {
		if (domainViews == null) {
			domainViews = new EObjectContainmentEList<DerivedView>(DerivedView.class, this, ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS);
		}
		return domainViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObjectInstance> getDomainInstances() {
		if (domainInstances == null) {
			domainInstances = new EObjectContainmentEList<DomainObjectInstance>(DomainObjectInstance.class, this, ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES);
		}
		return domainInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationElementProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ApplicationElementProperty>(ApplicationElementProperty.class, this, ModelPackage.INTERNET_APPLICATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ApplicationElement>(ApplicationElement.class, this, ModelPackage.INTERNET_APPLICATION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainStore> getDomainStores() {
		if (domainStores == null) {
			domainStores = new EObjectContainmentEList<DomainStore>(DomainStore.class, this, ModelPackage.INTERNET_APPLICATION__DOMAIN_STORES);
		}
		return domainStores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntimeUrl() {
		return runtimeUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeUrl(String newRuntimeUrl) {
		String oldRuntimeUrl = runtimeUrl;
		runtimeUrl = newRuntimeUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERNET_APPLICATION__RUNTIME_URL, oldRuntimeUrl, runtimeUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessions() {
		if (sessions == null) {
			sessions = new EObjectContainmentEList<Session>(Session.class, this, ModelPackage.INTERNET_APPLICATION__SESSIONS);
		}
		return sessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoginHandler> getLoginHandlers() {
		if (loginHandlers == null) {
			loginHandlers = new EObjectContainmentEList<LoginHandler>(LoginHandler.class, this, ModelPackage.INTERNET_APPLICATION__LOGIN_HANDLERS);
		}
		return loginHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileDomainStore> getFileDomainStores() {
		if (fileDomainStores == null) {
			fileDomainStores = new EObjectContainmentEList<FileDomainStore>(FileDomainStore.class, this, ModelPackage.INTERNET_APPLICATION__FILE_DOMAIN_STORES);
		}
		return fileDomainStores;
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
			case ModelPackage.INTERNET_APPLICATION__GENERATED_BY:
				if (generatedBy != null)
					msgs = ((InternalEObject)generatedBy).eInverseRemove(this, ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS, GeneratesElements.class, msgs);
				return basicSetGeneratedBy((GeneratesElements)otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS:
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
			case ModelPackage.INTERNET_APPLICATION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS:
				return ((InternalEList<?>)getEventTriggers()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__GENERATED_BY:
				return basicSetGeneratedBy(null, msgs);
			case ModelPackage.INTERNET_APPLICATION__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS:
				return ((InternalEList<?>)getGeneratedElements()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS:
				return ((InternalEList<?>)getDomainObjects()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS:
				return ((InternalEList<?>)getDomainViews()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES:
				return ((InternalEList<?>)getDomainInstances()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_STORES:
				return ((InternalEList<?>)getDomainStores()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__SESSIONS:
				return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__LOGIN_HANDLERS:
				return ((InternalEList<?>)getLoginHandlers()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERNET_APPLICATION__FILE_DOMAIN_STORES:
				return ((InternalEList<?>)getFileDomainStores()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.INTERNET_APPLICATION__OPERATIONS:
				return getOperations();
			case ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS:
				return getEventTriggers();
			case ModelPackage.INTERNET_APPLICATION__GENERATED_BY:
				if (resolve) return getGeneratedBy();
				return basicGetGeneratedBy();
			case ModelPackage.INTERNET_APPLICATION__IS_GENERATED:
				return isIsGenerated() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.INTERNET_APPLICATION__ID:
				return getId();
			case ModelPackage.INTERNET_APPLICATION__NAME:
				return getName();
			case ModelPackage.INTERNET_APPLICATION__WIRES:
				return getWires();
			case ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS:
				return getGeneratedElements();
			case ModelPackage.INTERNET_APPLICATION__OVERRIDDEN:
				return isOverridden() ? Boolean.TRUE : Boolean.FALSE;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS:
				return getDomainObjects();
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS:
				return getDomainViews();
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES:
				return getDomainInstances();
			case ModelPackage.INTERNET_APPLICATION__PROPERTIES:
				return getProperties();
			case ModelPackage.INTERNET_APPLICATION__CHILDREN:
				return getChildren();
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_STORES:
				return getDomainStores();
			case ModelPackage.INTERNET_APPLICATION__RUNTIME_URL:
				return getRuntimeUrl();
			case ModelPackage.INTERNET_APPLICATION__SESSIONS:
				return getSessions();
			case ModelPackage.INTERNET_APPLICATION__LOGIN_HANDLERS:
				return getLoginHandlers();
			case ModelPackage.INTERNET_APPLICATION__FILE_DOMAIN_STORES:
				return getFileDomainStores();
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
			case ModelPackage.INTERNET_APPLICATION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS:
				getEventTriggers().clear();
				getEventTriggers().addAll((Collection<? extends EventTrigger>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__GENERATED_BY:
				setGeneratedBy((GeneratesElements)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__IS_GENERATED:
				setIsGenerated(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.INTERNET_APPLICATION__ID:
				setId((String)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends WireEdge>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				getGeneratedElements().addAll((Collection<? extends GeneratedElement>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__OVERRIDDEN:
				setOverridden(((Boolean)newValue).booleanValue());
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				getDomainObjects().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS:
				getDomainViews().clear();
				getDomainViews().addAll((Collection<? extends DerivedView>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES:
				getDomainInstances().clear();
				getDomainInstances().addAll((Collection<? extends DomainObjectInstance>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends ApplicationElementProperty>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ApplicationElement>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_STORES:
				getDomainStores().clear();
				getDomainStores().addAll((Collection<? extends DomainStore>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__RUNTIME_URL:
				setRuntimeUrl((String)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__SESSIONS:
				getSessions().clear();
				getSessions().addAll((Collection<? extends Session>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__LOGIN_HANDLERS:
				getLoginHandlers().clear();
				getLoginHandlers().addAll((Collection<? extends LoginHandler>)newValue);
				return;
			case ModelPackage.INTERNET_APPLICATION__FILE_DOMAIN_STORES:
				getFileDomainStores().clear();
				getFileDomainStores().addAll((Collection<? extends FileDomainStore>)newValue);
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
			case ModelPackage.INTERNET_APPLICATION__OPERATIONS:
				getOperations().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS:
				getEventTriggers().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__GENERATED_BY:
				setGeneratedBy((GeneratesElements)null);
				return;
			case ModelPackage.INTERNET_APPLICATION__IS_GENERATED:
				setIsGenerated(IS_GENERATED_EDEFAULT);
				return;
			case ModelPackage.INTERNET_APPLICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.INTERNET_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.INTERNET_APPLICATION__WIRES:
				getWires().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS:
				getGeneratedElements().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__OVERRIDDEN:
				setOverridden(OVERRIDDEN_EDEFAULT);
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS:
				getDomainViews().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES:
				getDomainInstances().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__CHILDREN:
				getChildren().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_STORES:
				getDomainStores().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__RUNTIME_URL:
				setRuntimeUrl(RUNTIME_URL_EDEFAULT);
				return;
			case ModelPackage.INTERNET_APPLICATION__SESSIONS:
				getSessions().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__LOGIN_HANDLERS:
				getLoginHandlers().clear();
				return;
			case ModelPackage.INTERNET_APPLICATION__FILE_DOMAIN_STORES:
				getFileDomainStores().clear();
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
			case ModelPackage.INTERNET_APPLICATION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS:
				return eventTriggers != null && !eventTriggers.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__GENERATED_BY:
				return generatedBy != null;
			case ModelPackage.INTERNET_APPLICATION__IS_GENERATED:
				return isGenerated != IS_GENERATED_EDEFAULT;
			case ModelPackage.INTERNET_APPLICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.INTERNET_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.INTERNET_APPLICATION__WIRES:
				return wires != null && !wires.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS:
				return generatedElements != null && !generatedElements.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__OVERRIDDEN:
				return overridden != OVERRIDDEN_EDEFAULT;
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS:
				return domainObjects != null && !domainObjects.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS:
				return domainViews != null && !domainViews.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES:
				return domainInstances != null && !domainInstances.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__CHILDREN:
				return children != null && !children.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__DOMAIN_STORES:
				return domainStores != null && !domainStores.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__RUNTIME_URL:
				return RUNTIME_URL_EDEFAULT == null ? runtimeUrl != null : !RUNTIME_URL_EDEFAULT.equals(runtimeUrl);
			case ModelPackage.INTERNET_APPLICATION__SESSIONS:
				return sessions != null && !sessions.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__LOGIN_HANDLERS:
				return loginHandlers != null && !loginHandlers.isEmpty();
			case ModelPackage.INTERNET_APPLICATION__FILE_DOMAIN_STORES:
				return fileDomainStores != null && !fileDomainStores.isEmpty();
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
		if (baseClass == ContainsEventTriggers.class) {
			switch (derivedFeatureID) {
				case ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS: return ModelPackage.CONTAINS_EVENT_TRIGGERS__EVENT_TRIGGERS;
				default: return -1;
			}
		}
		if (baseClass == GeneratedElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.INTERNET_APPLICATION__GENERATED_BY: return ModelPackage.GENERATED_ELEMENT__GENERATED_BY;
				case ModelPackage.INTERNET_APPLICATION__IS_GENERATED: return ModelPackage.GENERATED_ELEMENT__IS_GENERATED;
				case ModelPackage.INTERNET_APPLICATION__ID: return ModelPackage.GENERATED_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.INTERNET_APPLICATION__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (derivedFeatureID) {
				case ModelPackage.INTERNET_APPLICATION__WIRES: return ModelPackage.CONTAINS_WIRES__WIRES;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (derivedFeatureID) {
				case ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS: return ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS;
				case ModelPackage.INTERNET_APPLICATION__OVERRIDDEN: return ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == Scope.class) {
			switch (derivedFeatureID) {
				case ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS: return ModelPackage.SCOPE__DOMAIN_OBJECTS;
				case ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS: return ModelPackage.SCOPE__DOMAIN_VIEWS;
				case ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES: return ModelPackage.SCOPE__DOMAIN_INSTANCES;
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
		if (baseClass == ContainsEventTriggers.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_EVENT_TRIGGERS__EVENT_TRIGGERS: return ModelPackage.INTERNET_APPLICATION__EVENT_TRIGGERS;
				default: return -1;
			}
		}
		if (baseClass == GeneratedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.GENERATED_ELEMENT__GENERATED_BY: return ModelPackage.INTERNET_APPLICATION__GENERATED_BY;
				case ModelPackage.GENERATED_ELEMENT__IS_GENERATED: return ModelPackage.INTERNET_APPLICATION__IS_GENERATED;
				case ModelPackage.GENERATED_ELEMENT__ID: return ModelPackage.INTERNET_APPLICATION__ID;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMED_ELEMENT__NAME: return ModelPackage.INTERNET_APPLICATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == ContainsWires.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONTAINS_WIRES__WIRES: return ModelPackage.INTERNET_APPLICATION__WIRES;
				default: return -1;
			}
		}
		if (baseClass == GeneratesElements.class) {
			switch (baseFeatureID) {
				case ModelPackage.GENERATES_ELEMENTS__GENERATED_ELEMENTS: return ModelPackage.INTERNET_APPLICATION__GENERATED_ELEMENTS;
				case ModelPackage.GENERATES_ELEMENTS__OVERRIDDEN: return ModelPackage.INTERNET_APPLICATION__OVERRIDDEN;
				default: return -1;
			}
		}
		if (baseClass == Scope.class) {
			switch (baseFeatureID) {
				case ModelPackage.SCOPE__DOMAIN_OBJECTS: return ModelPackage.INTERNET_APPLICATION__DOMAIN_OBJECTS;
				case ModelPackage.SCOPE__DOMAIN_VIEWS: return ModelPackage.INTERNET_APPLICATION__DOMAIN_VIEWS;
				case ModelPackage.SCOPE__DOMAIN_INSTANCES: return ModelPackage.INTERNET_APPLICATION__DOMAIN_INSTANCES;
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
		result.append(", name: ");
		result.append(name);
		result.append(", overridden: ");
		result.append(overridden);
		result.append(", runtimeUrl: ");
		result.append(runtimeUrl);
		result.append(')');
		return result.toString();
	}

} //InternetApplicationImpl
