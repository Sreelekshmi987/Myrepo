package collection;

import java.util.ArrayList;
import java.util.List;

public class GetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();
		 obj.add("Red");
		 obj.add("Green");
		 obj.add("Red");
		 obj.add("Blue");
		 obj.add("Red");
		 String a=obj.get(1);
		 System.out.println(a);
	}

}
