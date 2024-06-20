package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new LinkedList<String>();
		 obj.add("Red");
		 obj.add("Green");
		 obj.add("Red");
		 obj.add("Blue");
		 obj.add("Red");
		 boolean a=obj.contains("Blue");
		 System.out.println(a);
	}

}
