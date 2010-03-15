/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model;

import org.eclipse.emf.common.util.EList;
import org.openiaml.model.model.components.LoginHandler;
import org.openiaml.model.model.domain.AbstractDomainStore;
import org.openiaml.model.model.scopes.Session;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internet Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openiaml.model.model.InternetApplication#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openiaml.model.model.InternetApplication#getChildren <em>Children</em>}</li>
 *   <li>{@link org.openiaml.model.model.InternetApplication#getDomainStores <em>Domain Stores</em>}</li>
 *   <li>{@link org.openiaml.model.model.InternetApplication#getRuntimeUrl <em>Runtime Url</em>}</li>
 *   <li>{@link org.openiaml.model.model.InternetApplication#getSessions <em>Sessions</em>}</li>
 *   <li>{@link org.openiaml.model.model.InternetApplication#getLoginHandlers <em>Login Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openiaml.model.model.ModelPackage#getInternetApplication()
 * @model annotation="http://openiaml.org/comment comment='we cannot have InternetApplications inside of other ElementContainers, thus we don\'t define it as an ApplicationElement' comment2='but why can we have it as an ActivityEdgeSource? I don\'t think there are any examples of InternetApplication wire --> something else; all the wires are from objects INSIDE the IA' editor='org.openiaml.model.diagram'"
 * @generated
 */
public interface InternetApplication extends ContainsOperations, ContainsEventTriggers, NamedElement, ContainsWires, GeneratesElements, Scope {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.openiaml.model.model.ApplicationElementProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.openiaml.model.model.ModelPackage#getInternetApplication_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationElementProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.openiaml.model.model.ApplicationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.openiaml.model.model.ModelPackage#getInternetApplication_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Domain Stores</b></em>' containment reference list.
	 * The list contents are of type {@link org.openiaml.model.model.domain.AbstractDomainStore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Stores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Stores</em>' containment reference list.
	 * @see org.openiaml.model.model.ModelPackage#getInternetApplication_DomainStores()
	 * @model containment="true"
	 *        annotation="http://openiaml.org/comment comment='not sure if this is necessary anymore... because now objects are stored as part of their scopes' changed='0.2 to extend the abstract counterpart'"
	 * @generated
	 */
	EList<AbstractDomainStore> getDomainStores();

	/**
	 * Returns the value of the '<em><b>Runtime Url</b></em>' attribute.
	 * The default value is <code>"http://localhost:8080/output/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Url</em>' attribute.
	 * @see #setRuntimeUrl(String)
	 * @see org.openiaml.model.model.ModelPackage#getInternetApplication_RuntimeUrl()
	 * @model default="http://localhost:8080/output/"
	 * @generated
	 */
	String getRuntimeUrl();

	/**
	 * Sets the value of the '{@link org.openiaml.model.model.InternetApplication#getRuntimeUrl <em>Runtime Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Url</em>' attribute.
	 * @see #getRuntimeUrl()
	 * @generated
	 */
	void setRuntimeUrl(String value);

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openiaml.model.model.scopes.Session}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' containment reference list.
	 * @see org.openiaml.model.model.ModelPackage#getInternetApplication_Sessions()
	 * @model containment="true"
	 *        annotation="http://openiaml.org/comment added='0.2'"
	 * @generated
	 */
	EList<Session> getSessions();

	/**
	 * Returns the value of the '<em><b>Login Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openiaml.model.model.components.LoginHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Handlers</em>' containment reference list.
	 * @see org.openiaml.model.model.ModelPackage#getInternetApplication_LoginHandlers()
	 * @model containment="true"
	 *        annotation="http://openiaml.org/comment added='0.2'"
	 * @generated
	 */
	EList<LoginHandler> getLoginHandlers();

} // InternetApplication