/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openiaml.model.model.operations;

import org.openiaml.model.model.ActivityNode;
import org.openiaml.model.model.DataFlowEdgeDestination;
import org.openiaml.model.model.DataFlowEdgesSource;
import org.openiaml.model.model.ExecutionEdgeDestination;
import org.openiaml.model.model.ExecutionEdgesSource;
import org.openiaml.model.model.NamedElement;
import org.openiaml.model.model.WireEdgesSource;
import org.openiaml.model.model.wires.RunInstanceWire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A virtual {@link Operation} call; the outgoing {@link RunInstanceWire} will be executed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openiaml.model.model.operations.OperationsPackage#getOperationCallNode()
 * @model annotation="http://openiaml.org/comment comment='added in 0.4'"
 * @generated
 */
public interface OperationCallNode extends ActivityNode, ExecutionEdgesSource, ExecutionEdgeDestination, DataFlowEdgeDestination, DataFlowEdgesSource, WireEdgesSource, NamedElement {
} // OperationCallNode