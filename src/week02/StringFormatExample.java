package week02;

/**
 * Demonstrates using the String format method
 * @author scottl
 *
 */
public class StringFormatExample
{
	/**
	 * Format the strings into one twoFirstCharacter. three
	 * 	<code>
	 * 		Expected output for David Charles Lynn
	 *       David C. Lynn
	 *  </code>
	 * @param one First string
	 * @param two Second string
	 * @param three Third string
	 * @return Formatted string
	 */
	public String formatExampleUsingFormat(String one, String two, String three)
	{
		String result = "";
		
		// Use the String.format method.
		// Uses a formatting string with placeholders to assign the variables
		// into the right slight. 
		// It is order dependent
		
		// get the first character of the second string
		char ch = two.charAt(0); // remember zero-based indexes
		
		// %s => string, %c => character
		result = String.format("%s %c. %s", one, ch, three);
		
		return result;
	}

	/**
	 * Format the strings into one twoFirstCharacter. three
	 * 	<code>
	 * 		Expected output for David Charles Lynn
	 *       David C. Lynn
	 *  </code>
	 * @param one First string
	 * @param two Second string
	 * @param three Third string
	 * @return Formatted string
	 */
	public String formatExampleUsingConcatenation(String one, String two, String three)
	{
		String result = "";
		
		// This example simply concatenates
		
		// get the first character of the second string
		char ch = two.charAt(0); // remember zero-based indexes
		
		result = one + " " + ch + ". " + three;
		
		return result;
	}
}
