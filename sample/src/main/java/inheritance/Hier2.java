package inheritance;

public class Hier2 extends Hier1 {
public void display2()
{
System.out.println("Parent B");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hier2 obj1=new Hier2();
obj1.display1();
obj1.display2();
	}

}
