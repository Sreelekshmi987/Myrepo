package assignment;

public class Divisible2 extends Divisible1 {
public void display()
{
int d=super.add();
if(d%10==0)
{
System.out.println("Divisible by 10");
}
else 
{
System.out.println("Not divisible by 10");	
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Divisible2 obj=new Divisible2();
obj.display();
	}

}
