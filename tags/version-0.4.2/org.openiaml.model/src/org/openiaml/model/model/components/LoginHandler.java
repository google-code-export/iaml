/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.components;

import org.openiaml.model.model.ApplicationElementContainer;
import org.openiaml.model.model.GeneratesElements;
import org.openiaml.model.model.scopes.Session;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When placed into a {@link Page} or {@link Session}, enforces that users need to login via this LoginHandler first. Also supports logout.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openiaml.model.model.components.LoginHandler#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openiaml.model.model.components.ComponentsPackage#getLoginHandler()
 * @model
 * @generated
 */
public interface LoginHandler extends ApplicationElementContainer, GeneratesElements {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openiaml.model.model.components.LoginHandlerTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openiaml.model.model.components.LoginHandlerTypes
	 * @see #setType(LoginHandlerTypes)
	 * @see org.openiaml.model.model.components.ComponentsPackage#getLoginHandler_Type()
	 * @model required="true"
	 * @generated
	 */
	LoginHandlerTypes getType();

	/**
	 * Sets the value of the '{@link org.openiaml.model.model.components.LoginHandler#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openiaml.model.model.components.LoginHandlerTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(LoginHandlerTypes value);
} // LoginHandler