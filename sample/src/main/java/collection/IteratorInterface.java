package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> obj1 =new ArrayList<String>();
		 obj1.add("Ant");
		 obj1.add("Car");
		 obj1.add("Apple");
		 System.out.println(obj1);
		
		 Iterator<String>obj2=obj1.iterator();
		 
		 while(obj2.hasNext())
		 {
			 System.out.println(obj2.next());
		 }
		 obj2.remove();
		 System.out.println(obj1);
	}

}
