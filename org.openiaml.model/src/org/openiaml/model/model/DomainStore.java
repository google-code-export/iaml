/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openiaml.model.model.DomainStore#getChildren <em>Children</em>}</li>
 *   <li>{@link org.openiaml.model.model.DomainStore#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openiaml.model.model.DomainStore#getDomainStoreWires <em>Domain Store Wires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openiaml.model.model.ModelPackage#getDomainStore()
 * @model annotation="http://openiaml.org/comment comment='stores database objects' editor='org.openiaml.model.diagram.domain_store'"
 * @generated
 */
public interface DomainStore extends ContainsOperations, ContainsEventTriggers, NamedElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.openiaml.model.model.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.openiaml.model.model.ModelPackage#getDomainStore_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObject> getChildren();

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
	 * @see org.openiaml.model.model.ModelPackage#getDomainStore_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationElementProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Domain Store Wires</b></em>' containment reference list.
	 * The list contents are of type {@link org.openiaml.model.model.WireEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Store Wires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Store Wires</em>' containment reference list.
	 * @see org.openiaml.model.model.ModelPackage#getDomainStore_DomainStoreWires()
	 * @model containment="true"
	 * @generated
	 */
	EList<WireEdge> getDomainStoreWires();

} // DomainStore
