package superkeyword;

public class SuperEg2 extends SuperEg1 {
public void display()
{
	
System.out.println("I am a child class");	
//super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperEg1 obj=new SuperEg2();
obj.display1();
obj.display();
	}

}
