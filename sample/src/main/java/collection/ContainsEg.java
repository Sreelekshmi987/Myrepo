package collection;

import java.util.ArrayList;
import java.util.List;

public class ContainsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();
		 obj.add("Red");
		 obj.add("Green");
		 obj.add("Red");
		 obj.add("Blue");
		 obj.add("Red");
		 boolean a=obj.contains("Red");
		 System.out.println(a);
	}

}
