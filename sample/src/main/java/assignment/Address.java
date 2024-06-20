package assignment;

public class Address {
String address;
Student add;

public Address(String address,Student add)
{
this.address=address;
this.add=add;
}
public void display()
{
System.out.println(address);
System.out.println(add.name+" "+add.rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student obj1=new Student("Anu",7);
    Address obj2=new Address("Sreekariyam Trivandrum",obj1);
    obj2.display();
	}

}
