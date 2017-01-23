package week02;

/**
 * 
 * @author Hassan Mian
 *
 */

public class ProcessName
{
	/**
	 * 
	 * @param firstName first name of the person
	 * @param middleName middle name of the person
	 * @param lastName last name of the person
	 */
	
	public ProcessName(String firstName, String middleName, String lastName)
	{
		m_firstName = firstName;
		m_middleName = middleName;
		m_lastName = lastName;	
	}
	
	public String getFirstInitialLast()
	
	{
		String result = "";
		char middleInitial = m_middleName.charAt(0);
		result = String.format("%s %c. %s", m_firstName, middleInitial, m_lastName);
		return result;
	}
	
	public String getDisplayName()
	{
		return m_lastName + ", " + m_firstName;
	}
	
	
	private String m_firstName;
	private String m_middleName;
	private String m_lastName;
	

}
