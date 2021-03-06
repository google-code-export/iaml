/**
 * 
 */
package org.openiaml.model.tests.codegen.model0_2;

import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.openiaml.model.tests.CodegenTestCase;

/**
 * A really simple test case, checking that text field values
 * persist over page reloads. 
 * 
 * @author jmwright
 *
 */
public class ReloadPage extends CodegenTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		root = loadAndCodegen(ReloadPage.class);
	}
	
	public void testServerReload() throws Exception {
		// go to sitemap
		IFile sitemap = beginAtSitemapThenPage("container");
		
		String testString = "value " + new Date().toString();
		{
			String targetId = getLabelIDForText("target");
			assertLabeledFieldNotEquals(targetId, testString);
			setLabeledFormElementField(targetId, testString);
		}
		
		// reload
		gotoSitemapThenPage(sitemap, "container");
		
		// the value should remain there
		{
			String targetId = getLabelIDForText("target");
			assertLabeledFieldEquals(targetId, testString);
		}

		// reload
		gotoSitemapThenPage(sitemap, "container");
		
		// the value should remain there
		{
			String targetId = getLabelIDForText("target");
			assertLabeledFieldEquals(targetId, testString);
		}

	}

}
