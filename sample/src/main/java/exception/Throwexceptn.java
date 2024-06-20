package exception;

public class Throwexceptn {
public static void main(String args[])

{
int age=13;
  if(age>18)
  {
  System.out.println("Eligible for voting");	
}
else
{
	throw new ArithmeticException("Invalid age");
}
}
	}

