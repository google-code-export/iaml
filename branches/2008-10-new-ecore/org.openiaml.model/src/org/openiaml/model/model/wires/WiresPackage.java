/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.wires;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.openiaml.model.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openiaml.model.model.wires.WiresFactory
 * @model kind="package"
 * @generated
 */
public interface WiresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wires";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://openiaml.org/model/wires";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iaml.wires";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiresPackage eINSTANCE = org.openiaml.model.model.wires.impl.WiresPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openiaml.model.model.wires.impl.SingleWireImpl <em>Single Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openiaml.model.model.wires.impl.SingleWireImpl
	 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getSingleWire()
	 * @generated
	 */
	int SINGLE_WIRE = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIRE__FROM = ModelPackage.WIRE_EDGE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIRE__TO = ModelPackage.WIRE_EDGE__TO;

	/**
	 * The number of structural features of the '<em>Single Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIRE_FEATURE_COUNT = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openiaml.model.model.wires.impl.CompositeWireImpl <em>Composite Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openiaml.model.model.wires.impl.CompositeWireImpl
	 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getCompositeWire()
	 * @generated
	 */
	int COMPOSITE_WIRE = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__FROM = ModelPackage.WIRE_EDGE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__TO = ModelPackage.WIRE_EDGE__TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__NAME = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__WIRES = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__CHILDREN = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__PROPERTIES = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__OPERATIONS = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__EVENT_TRIGGERS = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__PARAMETERS = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE__VALUES = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Composite Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIRE_FEATURE_COUNT = ModelPackage.WIRE_EDGE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openiaml.model.model.wires.impl.SyncWireImpl <em>Sync Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openiaml.model.model.wires.impl.SyncWireImpl
	 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getSyncWire()
	 * @generated
	 */
	int SYNC_WIRE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__FROM = COMPOSITE_WIRE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__TO = COMPOSITE_WIRE__TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__NAME = COMPOSITE_WIRE__NAME;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__WIRES = COMPOSITE_WIRE__WIRES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__CHILDREN = COMPOSITE_WIRE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__PROPERTIES = COMPOSITE_WIRE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__OPERATIONS = COMPOSITE_WIRE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Event Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__EVENT_TRIGGERS = COMPOSITE_WIRE__EVENT_TRIGGERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__PARAMETERS = COMPOSITE_WIRE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE__VALUES = COMPOSITE_WIRE__VALUES;

	/**
	 * The number of structural features of the '<em>Sync Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_WIRE_FEATURE_COUNT = COMPOSITE_WIRE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openiaml.model.model.wires.impl.RunInstanceWireImpl <em>Run Instance Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openiaml.model.model.wires.impl.RunInstanceWireImpl
	 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getRunInstanceWire()
	 * @generated
	 */
	int RUN_INSTANCE_WIRE = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__FROM = COMPOSITE_WIRE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__TO = COMPOSITE_WIRE__TO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__NAME = COMPOSITE_WIRE__NAME;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__WIRES = COMPOSITE_WIRE__WIRES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__CHILDREN = COMPOSITE_WIRE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__PROPERTIES = COMPOSITE_WIRE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__OPERATIONS = COMPOSITE_WIRE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Event Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__EVENT_TRIGGERS = COMPOSITE_WIRE__EVENT_TRIGGERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__PARAMETERS = COMPOSITE_WIRE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__VALUES = COMPOSITE_WIRE__VALUES;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE__IN_EDGES = COMPOSITE_WIRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Run Instance Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_INSTANCE_WIRE_FEATURE_COUNT = COMPOSITE_WIRE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openiaml.model.model.wires.impl.ParameterWireImpl <em>Parameter Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openiaml.model.model.wires.impl.ParameterWireImpl
	 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getParameterWire()
	 * @generated
	 */
	int PARAMETER_WIRE = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WIRE__FROM = SINGLE_WIRE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WIRE__TO = SINGLE_WIRE__TO;

	/**
	 * The number of structural features of the '<em>Parameter Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_WIRE_FEATURE_COUNT = SINGLE_WIRE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.openiaml.model.model.wires.SingleWire <em>Single Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Wire</em>'.
	 * @see org.openiaml.model.model.wires.SingleWire
	 * @generated
	 */
	EClass getSingleWire();

	/**
	 * Returns the meta object for class '{@link org.openiaml.model.model.wires.CompositeWire <em>Composite Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Wire</em>'.
	 * @see org.openiaml.model.model.wires.CompositeWire
	 * @generated
	 */
	EClass getCompositeWire();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openiaml.model.model.wires.CompositeWire#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.openiaml.model.model.wires.CompositeWire#getChildren()
	 * @see #getCompositeWire()
	 * @generated
	 */
	EReference getCompositeWire_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openiaml.model.model.wires.CompositeWire#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.openiaml.model.model.wires.CompositeWire#getProperties()
	 * @see #getCompositeWire()
	 * @generated
	 */
	EReference getCompositeWire_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openiaml.model.model.wires.CompositeWire#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.openiaml.model.model.wires.CompositeWire#getOperations()
	 * @see #getCompositeWire()
	 * @generated
	 */
	EReference getCompositeWire_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openiaml.model.model.wires.CompositeWire#getEventTriggers <em>Event Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Triggers</em>'.
	 * @see org.openiaml.model.model.wires.CompositeWire#getEventTriggers()
	 * @see #getCompositeWire()
	 * @generated
	 */
	EReference getCompositeWire_EventTriggers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openiaml.model.model.wires.CompositeWire#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.openiaml.model.model.wires.CompositeWire#getParameters()
	 * @see #getCompositeWire()
	 * @generated
	 */
	EReference getCompositeWire_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openiaml.model.model.wires.CompositeWire#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.openiaml.model.model.wires.CompositeWire#getValues()
	 * @see #getCompositeWire()
	 * @generated
	 */
	EReference getCompositeWire_Values();

	/**
	 * Returns the meta object for class '{@link org.openiaml.model.model.wires.SyncWire <em>Sync Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Wire</em>'.
	 * @see org.openiaml.model.model.wires.SyncWire
	 * @generated
	 */
	EClass getSyncWire();

	/**
	 * Returns the meta object for class '{@link org.openiaml.model.model.wires.RunInstanceWire <em>Run Instance Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Instance Wire</em>'.
	 * @see org.openiaml.model.model.wires.RunInstanceWire
	 * @generated
	 */
	EClass getRunInstanceWire();

	/**
	 * Returns the meta object for class '{@link org.openiaml.model.model.wires.ParameterWire <em>Parameter Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Wire</em>'.
	 * @see org.openiaml.model.model.wires.ParameterWire
	 * @generated
	 */
	EClass getParameterWire();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WiresFactory getWiresFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openiaml.model.model.wires.impl.SingleWireImpl <em>Single Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openiaml.model.model.wires.impl.SingleWireImpl
		 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getSingleWire()
		 * @generated
		 */
		EClass SINGLE_WIRE = eINSTANCE.getSingleWire();

		/**
		 * The meta object literal for the '{@link org.openiaml.model.model.wires.impl.CompositeWireImpl <em>Composite Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openiaml.model.model.wires.impl.CompositeWireImpl
		 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getCompositeWire()
		 * @generated
		 */
		EClass COMPOSITE_WIRE = eINSTANCE.getCompositeWire();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WIRE__CHILDREN = eINSTANCE.getCompositeWire_Children();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WIRE__PROPERTIES = eINSTANCE.getCompositeWire_Properties();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WIRE__OPERATIONS = eINSTANCE.getCompositeWire_Operations();

		/**
		 * The meta object literal for the '<em><b>Event Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WIRE__EVENT_TRIGGERS = eINSTANCE.getCompositeWire_EventTriggers();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WIRE__PARAMETERS = eINSTANCE.getCompositeWire_Parameters();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WIRE__VALUES = eINSTANCE.getCompositeWire_Values();

		/**
		 * The meta object literal for the '{@link org.openiaml.model.model.wires.impl.SyncWireImpl <em>Sync Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openiaml.model.model.wires.impl.SyncWireImpl
		 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getSyncWire()
		 * @generated
		 */
		EClass SYNC_WIRE = eINSTANCE.getSyncWire();

		/**
		 * The meta object literal for the '{@link org.openiaml.model.model.wires.impl.RunInstanceWireImpl <em>Run Instance Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openiaml.model.model.wires.impl.RunInstanceWireImpl
		 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getRunInstanceWire()
		 * @generated
		 */
		EClass RUN_INSTANCE_WIRE = eINSTANCE.getRunInstanceWire();

		/**
		 * The meta object literal for the '{@link org.openiaml.model.model.wires.impl.ParameterWireImpl <em>Parameter Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openiaml.model.model.wires.impl.ParameterWireImpl
		 * @see org.openiaml.model.model.wires.impl.WiresPackageImpl#getParameterWire()
		 * @generated
		 */
		EClass PARAMETER_WIRE = eINSTANCE.getParameterWire();

	}

} //WiresPackage