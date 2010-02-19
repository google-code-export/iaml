/**
 * 
 */
package org.openiaml.model.tests.eclipse;

import org.eclipse.core.resources.IFile;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.openiaml.model.tests.EclipseTestCaseHelper;

/**
 * Emulate right click > initialise diagram.
 * 
 * @author jmwright
 *
 */
public class InitializeDiagramTestCase extends EclipseTestCaseHelper {

	/**
	 * Tests loading the model file with the editor.
	 * 
	 * @throws Exception
	 */
	public void testLoadModel() throws Exception {
		// copy our local file into the project
		IFile targetModel = project.getFile("shortcuts-root.iaml");
		copyFileIntoWorkspace("src/org/openiaml/model/tests/eclipse/shortcuts-root.iaml",
				targetModel);
		
		IFile targetDiagram = project.getFile("shortcuts-root.iaml_diagram");
		assertFalse("the target diagram should not exist yet", targetDiagram.exists());

		// initialise the model
		initializeModelFile(targetModel, targetDiagram);
		
		assertTrue("the target diagram should have been created", targetDiagram.exists());
		
		// load up the editor
		DiagramDocumentEditor editor = (DiagramDocumentEditor) loadDiagramFile(targetDiagram);
		assertEditorRoot(editor);

		// there should be four children
		assertEditorHasChildren(4, editor);

		// check the contents
		ShapeNodeEditPart page = assertHasPage(editor, "page");
		assertHasEventTrigger(editor, "et");
		assertHasOperation(editor, "op");

		// open the domain store
		DiagramDocumentEditor editor_visual = openDiagram(page);

		assertEditorVisual(editor_visual);

		// close editors
		((DiagramDocumentEditor) editor_visual).close(false);
		((DiagramDocumentEditor) editor).close(false);
	
	}
	
}