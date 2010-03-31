/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generated Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GeneratedElement may have been created manually, or initialised through model completion {@model GeneratesElements by another element}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openiaml.model.model.GeneratedElement#getGeneratedBy <em>Generated By</em>}</li>
 *   <li>{@link org.openiaml.model.model.GeneratedElement#isIsGenerated <em>Is Generated</em>}</li>
 *   <li>{@link org.openiaml.model.model.GeneratedElement#getId <em>Id</em>}</li>
 *   <li>{@link org.openiaml.model.model.GeneratedElement#getGeneratedRule <em>Generated Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openiaml.model.model.ModelPackage#getGeneratedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GeneratedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Generated By</b></em>' reference list.
	 * The list contents are of type {@link org.openiaml.model.model.GeneratesElements}.
	 * It is bidirectional and its opposite is '{@link org.openiaml.model.model.GeneratesElements#getGeneratedElements <em>Generated Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of {@model GeneratesElements elements} that generated this element; conversely, {@model GeneratesElements#overridden overriding} the source will prevent {@model GeneratedElement this element} from being created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generated By</em>' reference list.
	 * @see org.openiaml.model.model.ModelPackage#getGeneratedElement_GeneratedBy()
	 * @see org.openiaml.model.model.GeneratesElements#getGeneratedElements
	 * @model opposite="generatedElements"
	 *        annotation="http://openiaml.org/comment changed='0.4 from 0..1 to 0..*'"
	 * @generated
	 */
	EList<GeneratesElements> getGeneratedBy();

	/**
	 * Returns the value of the '<em><b>Is Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Generated</em>' attribute.
	 * @see #setIsGenerated(boolean)
	 * @see org.openiaml.model.model.ModelPackage#getGeneratedElement_IsGenerated()
	 * @model
	 * @generated
	 */
	boolean isIsGenerated();

	/**
	 * Sets the value of the '{@link org.openiaml.model.model.GeneratedElement#isIsGenerated <em>Is Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Generated</em>' attribute.
	 * @see #isIsGenerated()
	 * @generated
	 */
	void setIsGenerated(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this model element. Should be globally unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openiaml.model.model.ModelPackage#getGeneratedElement_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openiaml.model.model.GeneratedElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Generated Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Rule</em>' attribute.
	 * @see #setGeneratedRule(String)
	 * @see org.openiaml.model.model.ModelPackage#getGeneratedElement_GeneratedRule()
	 * @model annotation="http://openiaml.org/comment comment='added in 0.2. used to register the source of the rule that created this element'"
	 * @generated
	 */
	String getGeneratedRule();

	/**
	 * Sets the value of the '{@link org.openiaml.model.model.GeneratedElement#getGeneratedRule <em>Generated Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Rule</em>' attribute.
	 * @see #getGeneratedRule()
	 * @generated
	 */
	void setGeneratedRule(String value);

} // GeneratedElement