package exception;

public class ExceptionNmbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="pen";

try 
{
int b=Integer.parseInt(a);
System.out.println(b);
}
catch(NumberFormatException c)
{
System.out.println("String cannot be converted to integer");	
}

	}

}
