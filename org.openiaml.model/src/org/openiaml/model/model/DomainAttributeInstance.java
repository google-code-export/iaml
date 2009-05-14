/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Attribute Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openiaml.model.model.DomainAttributeInstance#isAutosave <em>Autosave</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openiaml.model.model.ModelPackage#getDomainAttributeInstance()
 * @model annotation="http://openiaml.org/comment added='0.3'"
 * @generated
 */
public interface DomainAttributeInstance extends ApplicationElement {

	/**
	 * Returns the value of the '<em><b>Autosave</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autosave</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autosave</em>' attribute.
	 * @see #setAutosave(boolean)
	 * @see org.openiaml.model.model.ModelPackage#getDomainAttributeInstance_Autosave()
	 * @model default="true"
	 *        annotation="http://openiaml.org/comment added='0.3'"
	 * @generated
	 */
	boolean isAutosave();

	/**
	 * Sets the value of the '{@link org.openiaml.model.model.DomainAttributeInstance#isAutosave <em>Autosave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autosave</em>' attribute.
	 * @see #isAutosave()
	 * @generated
	 */
	void setAutosave(boolean value);
} // DomainAttributeInstance
