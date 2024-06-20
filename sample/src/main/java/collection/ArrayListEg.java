package collection;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> obj1 =new ArrayList<String>();
		 obj1.add("Ant");
		 obj1.add("Car");
		 obj1.add("Apple");
		 
		 ArrayList<String> obj2 =new ArrayList<String>();
		 obj2.add("bnn");
		 obj2.add("Pen");
		 obj2.add("Apple");
		 //System.out.println(obj);
		 
		 obj1.addAll(obj2);
		 System.out.println(obj1);
		 
		 boolean b=obj1.contains("Car");
		 System.out.println(b);
		 
		 System.out.println(obj1.get(2));
		 
		 boolean c=obj1.isEmpty();
		 System.out.println(c);
		 
		 obj1.remove(0);
		 System.out.println(obj1);
		 
		 System.out.println(obj1.size());
		 }

}
