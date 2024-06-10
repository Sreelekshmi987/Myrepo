package aggregation;

public class AggreEg2 {
int rollno;
String rank;
AggreEg1 add;

public AggreEg2(int rollno,String rank,AggreEg1 add)
{
this.rollno=rollno;
this.rank=rank;
this.add=add;
}
 public void display()
 {
System.out.println(rollno+" "+rank);	
System.out.println(add.name+" "+add.age+" "+add.country);
 }
 public static void main(String args[])
 {
AggreEg1 obj1=new AggreEg1("Sree",20,"India");
AggreEg2 obj2=new AggreEg2(10,"second",obj1);
obj2.display();
 }
	

} 

		
