/**
 *
 */
package org.openiaml.model.tests.inference.model0_1;

import java.util.List;

import org.jaxen.JaxenException;
import org.openiaml.model.model.ActionEdge;
import org.openiaml.model.model.DomainAttribute;
import org.openiaml.model.model.EventTrigger;
import org.openiaml.model.model.NamedElement;
import org.openiaml.model.model.Operation;
import org.openiaml.model.model.Property;
import org.openiaml.model.model.domain.DomainSchema;
import org.openiaml.model.model.domain.DomainSource;
import org.openiaml.model.model.visual.Frame;
import org.openiaml.model.model.visual.InputForm;
import org.openiaml.model.model.visual.InputTextField;
import org.openiaml.model.model.wires.ParameterEdge;
import org.openiaml.model.model.wires.SyncWire;
import org.openiaml.model.tests.inference.InferenceTestCase;

/**
 * Tests inference of sync wires between a .properties
 * FileDomainStore and an InputForm.
 *
 * @author jmwright
 *
 */
public class SyncWiresProperties extends InferenceTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		root = loadAndInfer(SyncWiresProperties.class);
	}

	public void testInference() throws JaxenException {
		Frame page = assertHasFrame(root, "container");
		InputForm form = assertHasInputForm(page, "target form");
		DomainSchema properties = assertHasDomainSchema(root, "properties");
		DomainSource source = assertHasDomainSource(root, "properties file");

		// there should be exactly three fields here (generated)
		// if there are four fields here, the generated key may have been added as a text field
		List<?> nodes = form.getChildren();
		assertEquals(3, nodes.size());
		InputTextField f1 = (InputTextField) getNodeWithName(nodes, "fruit");
		InputTextField f2 = (InputTextField) getNodeWithName(nodes, "animal");
		InputTextField f3 = (InputTextField) getNodeWithName(nodes, "country");
		assertEquals(f1.getName(), "fruit");
		assertTrue(f1.isIsGenerated());
		assertEquals(f2.getName(), "animal");
		assertTrue(f2.isIsGenerated());
		assertEquals(f3.getName(), "country");
		assertTrue(f3.isIsGenerated());

		// find the sync wire
		SyncWire wire = assertHasSyncWire(page, form, source, "sync properties");
		assertNotGenerated(wire);

		// there should be 4 attributes; one of these will be a primary key
		List<?> nodes2 = properties.getAttributes();
		assertEquals(4, nodes2.size());
		DomainAttribute a1 = (DomainAttribute) getNodeWithName(nodes2, "fruit");
		DomainAttribute a2 = (DomainAttribute) getNodeWithName(nodes2, "animal");
		DomainAttribute a3 = (DomainAttribute) getNodeWithName(nodes2, "country");
		DomainAttribute a4 = (DomainAttribute) getNodeWithName(nodes2, "generated primary key");
		assertEquals(a1.getName(), "fruit");
		assertFalse(a1.isPrimaryKey());
		assertEquals(a2.getName(), "animal");
		assertFalse(a2.isPrimaryKey());
		assertEquals(a3.getName(), "country");
		assertFalse(a3.isPrimaryKey());
		assertEquals(a4.getName(), "generated primary key");
		assertTrue(a4.isPrimaryKey());

		// there should be sync wires between each of these elements
		// (and the directionality does not matter)
		SyncWire sw1 = assertHasSyncWire(form, f1, a1);
		SyncWire sw2 = assertHasSyncWire(form, f2, a2);
		SyncWire sw3 = assertHasSyncWire(form, f3, a3);

		assertTrue(sw1.isIsGenerated());
		assertTrue(sw2.isIsGenerated());
		assertTrue(sw3.isIsGenerated());

		// there should be RunActions on each of these attributes
		// (following from SyncFormDomainObject)

		// fields should have fieldValues
		Property valuea1 = assertHasFieldValue(a1);
		Property valuea2 = assertHasFieldValue(a2);
		Property valuea3 = assertHasFieldValue(a3);

		// test for 'access' events and 'initialize' operations (new)
		EventTrigger access1 = f1.getOnAccess();
		EventTrigger access2 = f2.getOnAccess();
		EventTrigger access3 = f3.getOnAccess();
		Operation op1 = assertHasOperation(f1, "init");
		Operation op2 = assertHasOperation(f2, "init");
		Operation op3 = assertHasOperation(f3, "init");

		// these field values should be parameters to run instance wires
		{
			ActionEdge rw1 = assertHasRunAction(root, access1, op1);
			ActionEdge rw2 = assertHasRunAction(root, access2, op2);
			ActionEdge rw3 = assertHasRunAction(root, access3, op3);

			getParameterEdgeFromTo(root, valuea1, rw1);
			getParameterEdgeFromTo(root, valuea2, rw2);
			getParameterEdgeFromTo(root, valuea3, rw3);
		}

	}
	
	/**
	 * Get a NamedElement with a given name, or fail.
	 *
	 * @param nodes
	 * @param name
	 * @return
	 */
	private NamedElement getNodeWithName(List<?> nodes, String name) {
		for (Object n : nodes) {
			if (n instanceof NamedElement && name.equals(((NamedElement) n).getName()))
				return (NamedElement) n;
		}
		fail("No node found with name '" + name + "'");
		return null;
	}

}