package collection;

import java.util.ArrayList;
import java.util.List;

public class IndexEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();
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
