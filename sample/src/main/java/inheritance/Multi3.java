package inheritance;

public class Multi3 extends Multi2 {
public void display3()
{
System.out.println("This is parent C");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multi3 obj=new Multi3();
obj.display1();
obj.display2();
obj.display3();
	}

}
