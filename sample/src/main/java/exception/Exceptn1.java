package exception;

public class Exceptn1 {

public static void main(String args[])
{
	try
	{
	int a=10;
	int b=0;
	int c=a/b;
	//System.out.println("HAI");
  System.out.println(c);	
	}
	catch(ArithmeticException d)
	{
		System.out.println("Exception occured");
	}
	finally
	{
		System.out.println("Program completed");
	}
}
}
