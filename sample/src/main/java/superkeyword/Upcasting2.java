package superkeyword;

public class Upcasting2 extends Upcasting1 {
public void display2()
{
System.out.println("Welcome");
super.display1();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Upcasting1 obj=new Upcasting2();
obj.display1();
	}

}
