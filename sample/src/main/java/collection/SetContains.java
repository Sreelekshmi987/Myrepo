package collection;

import java.util.HashSet;
import java.util.Set;

public class SetContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String>obj=new HashSet<String>();
		    obj.add("Black");
		    obj.add("Red");
		    obj.add("Pink");
		    System.out.println(obj);
		    
		    String a="Yellow";
		    System.out.println(obj.contains(a));
	}

}
