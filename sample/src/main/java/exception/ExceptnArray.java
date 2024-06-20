package exception;

public class ExceptnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	
	try	
	{
		int a[]= {2,4,6};
		 System.out.println(a[3]);	
	}
	catch(ArrayIndexOutOfBoundsException b)
	{
		System.out.println("Index out of bounds");
	}
	}

}
