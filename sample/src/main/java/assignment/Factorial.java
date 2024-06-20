package assignment;

public class Factorial {
int number;
int fact=1; 


public void display1(int number)
{
	
	for(int i=1;i<=number;i++)
	{
this.number=number;
this.fact=fact*i;

}
}
	public void display2()
	{
	
	System.out.println("Factorial of a number is :"+fact);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial obj=new Factorial();
obj.display1(5);
obj.display2();

	}
}
	


