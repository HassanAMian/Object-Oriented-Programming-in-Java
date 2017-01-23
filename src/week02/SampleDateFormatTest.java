package week02;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class SampleDateFormatTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SampleDateFormat fmt = new SampleDateFormat();
		Calendar cal = GregorianCalendar.getInstance();
		String formattedDate = fmt.formatDate(cal.getTime());
		System.out.println(formattedDate);
	}

}
