package week01;

/**
 * Test Harness for the Hello World assignment
 * It instantiates an instance of the student HelloWorld class
 * and calls the public method 
 * * 
 * This type of class is also referred to as a Driver.
 * It has the main method and invokes the other classes in
 * the prescribed business process order.
 * 
 * 
 * @author scottl
 *
 */
public class HelloWorldTest
{
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args)
	{
		// Create an instance of the class
		HelloWorld hello = new HelloWorld();
		
		// Using a java provided library (System) and an attribute (out)
		System.out.println(hello.display());
	}
}
