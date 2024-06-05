package accessmodifier;

public class Modifier {

		// TODO Auto-generated method stub
public void display1()
{
System.out.println("It is a public modifier");	
}
private void display2()
{
System.out.println("It is a private modifier");	
}
protected void display3()
{
System.out.println("It is a protected modifier");	
}
void display4()
{
System.out.println("It is a default modifier");	
}

public static void main(String args[])
{
	Modifier obj=new Modifier();
	obj.display1();
	obj.display2();
	obj.display3();
	obj.display4();
}
}
