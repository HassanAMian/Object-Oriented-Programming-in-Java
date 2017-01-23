package week02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**	
 * 
 * @author Hassan Mian
 *
 */

public class DateFormat
{
	/**
	 * Default Constructor
	 */
	public DateFormat()
	{
		m_formatter = new SimpleDateFormat(m_dateFormat);
	}
	
	public String getCurrentDate()
	{
		Calendar cal = GregorianCalendar.getInstance();
		Date d = cal.getTime();
		return formatDate(d);
	}
	
	public String formatDate(Date d)
	{
		return m_formatter.format(d);
	}
	//Example of class-scoped attributes
	private static String m_dateFormat = "dd MMMM yyyy";
	private static SimpleDateFormat m_formatter;
}
