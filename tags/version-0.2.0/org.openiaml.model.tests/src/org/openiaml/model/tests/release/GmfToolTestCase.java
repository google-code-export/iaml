/**
 * 
 */
package org.openiaml.model.tests.release;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openiaml.model.tests.XmlTestCase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Tests .mf and plugin.xml files of the specified plugins
 * 
 * @author jmwright
 *
 */
public class GmfToolTestCase extends XmlTestCase {

	public static final String XSI_NS = "http://www.w3.org/2001/XMLSchema-instance";

	public static final String GMF_ROOT = "../org.openiaml.model/model/";
	/**
	 * All .gmfgen files in this project.
	 */
	public static final String[] GMFTOOLS = new String[] { 
		GMF_ROOT + "domain_object.gmftool",
		GMF_ROOT + "domain_store.gmftool",
		GMF_ROOT + "element.gmftool",
		GMF_ROOT + "file_domain_object.gmftool",
		GMF_ROOT + "file_domain_store.gmftool",
		GMF_ROOT + "operation.gmftool",
		GMF_ROOT + "root.gmftool",
		GMF_ROOT + "visual.gmftool",
		GMF_ROOT + "wire.gmftool",
	};
	private Map<String,Document> loadedGmftools = new HashMap<String,Document>(); 

	/**
	 * Load up all the .gmfgen's and MANIFEST.MFs from all of our plugins.
	 * 
	 */
	public void setUp() throws Exception {
		super.setUp();
		
		// load all .gmftool's
		for (String gmftool : GMFTOOLS) {
			loadedGmftools.put( gmftool, loadDocument(gmftool) );
		}
	}
	
	/**
	 * Check .gmftools for icons. If the .gmftool does not
	 * specify an icon, one is specified automatically, and the
	 * .gmftool is rewritten.
	 * 
	 * (TODO The other alternative is to build this into a build.xml.)
	 * 
	 * @throws Exception
	 */
	public void testGmfTools() throws Exception {
		for (String file : loadedGmftools.keySet()) {
			boolean changed = false;
			Document doc = loadedGmftools.get(file);
			NodeList nl = xpath(doc, "//palette/tools");
			
			assertEquals("There should be exactly one //tools entry", nl.getLength(), 1);
			Element root = (Element) nl.item(0);
			
			NodeList tools = xpath(root, "tools");
			assertNotSame("There should be at least one subtool entry", tools.getLength(), 0);
			
			for (int i = 0; i < tools.getLength(); i++) {
				String prefix = "[" + file + "#" + i + "] ";
				Element tool = (Element) tools.item(i);
				assertNotNull(prefix, tool);
				Element smallIcon = (Element) xpath(tool, "smallIcon").item(0);
				assertNotNull(prefix, smallIcon);
				Element largeIcon = (Element) xpath(tool, "largeIcon").item(0);
				assertNotNull(prefix, largeIcon);
				String defaultIcon = tool.getAttribute("title") + ".gif";
				
				// has it got an icon defined?
				String smallPath = smallIcon.getAttribute("path");
				if (smallPath == null || smallPath.isEmpty()) {
					// set it
					smallIcon.setAttribute("path", "icons/full/obj16/" + defaultIcon);
					smallIcon.setAttribute("bundle", "org.openiaml.model.edit");
					smallIcon.setAttribute("xsi:type", "gmftool:BundleImage");
					changed = true;
				}
				
				// the icon should exist
				assertFileExists(prefix, new File( "../" + smallIcon.getAttribute("bundle") + "/" + smallIcon.getAttribute("path") ));				

				// has it got an icon defined?
				String largePath = largeIcon.getAttribute("path");
				if (largePath == null || largePath.isEmpty()) {
					// set it
					largeIcon.setAttribute("path", "icons/full/obj32/" + defaultIcon);
					largeIcon.setAttribute("bundle", "org.openiaml.model.edit");
					largeIcon.setAttribute("xsi:type", "gmftool:BundleImage");
					changed = true;
				}
				
				// the icon should exist
				assertFileExists(prefix, new File( "../" + largeIcon.getAttribute("bundle") + "/" + largeIcon.getAttribute("path") ));				

			}
			
			if (changed) {
				System.out.println("Writing backup " + file + "...");
				saveDocument(doc, new File(file + ".backup"));
				
				System.out.println("Writing new " + file + "...");
				saveDocument(doc, new File(file));
			}
		}
	}
	
}