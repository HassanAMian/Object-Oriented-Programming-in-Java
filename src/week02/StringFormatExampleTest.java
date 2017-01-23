package week02;

public class StringFormatExampleTest
{

	public static void main(String[] args)
	{
		StringFormatExample example = new StringFormatExample();
		String one = "David";
		String two = "Charles";
		String three = "Lynn";
		
		String result1 = example.formatExampleUsingFormat(one, two, three);
		String result2 = example.formatExampleUsingConcatenation(one, two, three);
		
		// These should be identical
		if( result1.equals(result2))
		{
			System.out.println(String.format("Success!! %s same as %s", result1, result2));
		}
		else
		{
			System.out.println(String.format("Failed format %s different from %s", result1, result2));
		}

	}

}
