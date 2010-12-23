/**
 * 
 */
package org.openiaml.docs.generation.codegen;


/**
 * @author jmwright
 *
 */
public class LatexCodegenFunctions {
	
	/**
	 * Turn a string like "InputTextField" into "Input Text Field".
	 * 
	 * @param s InputTextField
	 * @return Input Text Field
	 */
	public static String humanise(String s) {		
		StringBuffer buf = new StringBuffer();
		for (char c : s.trim().toCharArray()) {
			if (Character.isUpperCase(c) && buf.length() != 0) {
				buf.append(' ');
			}
			buf.append(c);
		}
		
		return buf.toString();
	}
	
	/**
	 * Turn a string like "InputTextField" into "input-text-field".
	 * 
	 * @param s InputTextField
	 * @return input-text-field
	 */
	public static String latexise(String s) {
		return humanise(s).toLowerCase().replace(' ', '-');
	}
	
}
