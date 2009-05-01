/**
 * 
 */
package org.openiaml.model.tests.eclipse.migration;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;

/**
 * Tests migrating a very old model version. 
 * 
 * @see #getModel()
 * @author jmwright
 *
 */
public class Migrate0_2SyncPages extends AbstractMigrateTestCase {

	protected DiagramDocumentEditor editor_page = null;
	
	/**
	 * The model is migrated, initialised and loaded in 
	 * {@link #setUp()}.
	 * 
	 * @throws Exception
	 */
	public void testLoadModel() throws Exception {
		// there should be five children (five pages)
		assertEquals("there should be 5 children", 5, editor.getDiagramEditPart().getChildren().size());
		
		// check the contents
		assertHasPage(editor, "page1");
		assertHasPage(editor, "page2");
		assertHasPage(editor, "page3");
		assertHasPage(editor, "page4");
		assertHasPage(editor, "page5");
	}
	
	/**
	 * We should be able to open the sub diagrams without problems.
	 * 
	 * @throws Exception
	 */
	public void testOpenSubdiagramsPage1() throws Exception {
		// open the diagram
		ShapeNodeEditPart page = assertHasPage(editor, "page1");
		assertNotNull(page);

		editor_page = openDiagram(page);
		assertEditorVisual(editor_page);
		
		// it should have two children: two text fields
		assertEquals("there should be 2 children in page 1", 2, editor_page.getDiagramEditPart().getChildren().size());
		assertHasInputTextField(editor_page, "text1");
		assertHasInputTextField(editor_page, "text2");
		
		editor_page.close(false);
		editor_page = null;
		
	}

	public void testOpenSubdiagramsPage2() throws Exception {
		// open the diagram
		ShapeNodeEditPart page = assertHasPage(editor, "page2");
		assertNotNull(page);

		editor_page = openDiagram(page);
		assertEditorVisual(editor_page);
		
		// it should have two children: two text fields
		assertEquals("there should be 4 children in page 1", 4, editor_page.getDiagramEditPart().getChildren().size());
		// two non-shortcuts
		assertHasInputTextField(editor_page, "text1", true, false);
		assertHasInputTextField(editor_page, "text3", true, false);
		// two shortcuts
		assertHasInputTextField(editor_page, "text1", true, true);
		assertHasInputTextField(editor_page, "text3", true, true);
		
		editor_page.close(false);
		editor_page = null;
		
	}
	/**
	 * Close loaded editors.
	 * @throws Exception 
	 */
	public void tearDown() throws Exception {
		if (editor_page != null)
			editor_page.close(false);
		
		super.tearDown();
	}
	
	public String getModel() {
		return "codegen-sync-pages-0_2.iaml";
	}
	
	public String getModelMigrated() {
		return "codegen-sync-pages-0_2-migrated.iaml";
	}

	/*
	 * We don't expect there to be any warnings, so we
	 * don't override {@link #assertStatusOK(IStatus)}.
	 */
	
}
