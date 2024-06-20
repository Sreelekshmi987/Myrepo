package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		  obj.add("Blue");
		  obj.add("Green");
		  obj.add("Pink");
		   
		  Iterator<String>obj1=obj.iterator();
		  while(obj1.hasNext())
		  {
		System.out.println(obj1.next());
		  }
	}

}
