package collection;


import java.util.LinkedList;
import java.util.List;

public class LinkedlistIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new LinkedList<String>();
		 obj.add("Red");
		 obj.add("Green");
		 obj.add("Red");
		 obj.add("Blue");
		 obj.add("Red");
		 int a=obj.indexOf("Red");
		 System.out.println(a);
		 int b=obj.lastIndexOf("Red");
		 System.out.println(b);
	}

}
