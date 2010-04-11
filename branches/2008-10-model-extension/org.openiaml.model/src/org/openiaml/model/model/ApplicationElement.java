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
 * A representation of the model object '<em><b>Application Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openiaml.model.model.ApplicationElement#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openiaml.model.model.ModelPackage#getApplicationElement()
 * @model annotation="http://openiaml.org/comment editor='org.openiaml.model.diagram.element'"
 * @generated
 */
public interface ApplicationElement extends ContainsOperations, NamedElement, ContainsEventTriggers, WireEdgesSource, WireEdgeDestination {
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
	 * @see org.openiaml.model.model.ModelPackage#getApplicationElement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationElementProperty> getProperties();

} // ApplicationElement