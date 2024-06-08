package superkeyword;

public class Super2 extends Super1 {
	String colour="Red";
	public void display()
	{
		System.out.println(super.colour);
	System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super2 obj=new Super2();
obj.display();
	}

}
