package collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();
		 obj.add("Red");
		 obj.add("Green");
		 obj.add("Red");
		 obj.add("Blue");
		 obj.add("Red");
		obj.remove("Blue");
		System.out.println(obj);
	}

}
