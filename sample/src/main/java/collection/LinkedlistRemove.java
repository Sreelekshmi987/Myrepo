package collection;


import java.util.LinkedList;
import java.util.List;

public class LinkedlistRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new LinkedList<String>();
		 obj.add("Red");
		 obj.add("Green");
		 obj.add("Red");
		 obj.add("Blue");
		 obj.add("Red");
		obj.remove("Blue");
		System.out.println(obj);
	}

}
