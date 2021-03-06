/**
 * 
 */
package org.openiaml.model.tests.codegen.model0_4;

import java.util.List;

import org.eclipse.core.resources.IFile;

/**
 * A User which has a role containing both permissions
 * can access a page that requires
 * both permissions.
 * 
 * @author jmwright
 *
 */
public class UserMultiplePermissions extends AbstractUserLoginTestCase {
	
	private final String EMAIL = "both_roles@openiaml.org";
	private final String PASSWORD = "test123";
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		root = loadAndCodegen(UserMultiplePermissions.class);
		initialiseDatabase();
	}
	
	@Override
	protected List<String> getDatabaseInitialisers() {
		List<String> s = super.getDatabaseInitialisers();
		s.add("INSERT INTO User (generated_primary_key, root_user_id, name, email, password) VALUES (66, 66, 'Both Permissions', '" + EMAIL + "', '" + PASSWORD + "')");
		s.add("INSERT INTO iaml_user_root (id, inherited_permission_with_role, permission_1, a_permission, a_different_permission) VALUES (66, 0, 0, 1, 1)");
		return s;
	}
	
	/**
	 * Check the initial state of the application.
	 * 
	 * @throws Exception
	 */
	public void testInitial() throws Exception {
		beginAtSitemapThenPage("Home");
	}

	/**
	 * We cannot access the protected page as a User
	 * because it does not have the appropriate Role.
	 * 
	 * @throws Exception
	 */
	public void testUser() throws Exception {
		IFile sitemap = doStandardLoginAs("user@openiaml.org", "user");
		// we actually expect a problem, because user does not have 'default role' permissions 
		assertProblem();
		
		// if we then try to go to 'target', we likewise will also be prevented		
		gotoSitemapWithProblem(sitemap, "target");
		assertTitleNotSame("target");
		assertProblem();		// who knows where we are?
	}
	
	/**
	 * If we do log in properly, we can access the target page.
	 * 
	 * @throws Exception
	 */
	public void testAccessTarget() throws Exception {
		IFile sitemap = doStandardLoginAs(EMAIL, PASSWORD);
		assertNoProblem();
		
		gotoSitemapThenPage(sitemap, "target");
		assertNoProblem();
	}
	
}
