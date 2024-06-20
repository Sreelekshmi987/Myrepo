package assignment;
public class Reverse {
int number;
int reverse;
int lastdigit;

public Reverse(int number)
{
	
	while(number>0)
	{
this.number=number;
this.lastdigit=number%10;
this.reverse=reverse*10+lastdigit;
number=number/10;
	}
	
}
public Reverse()
{
	this(567);
System.out.println("Reverse of a number is:"+this.reverse );

}
public static void main(String args[]) {
		// TODO Auto-generated method stub
Reverse obj=new Reverse();
	}

}
