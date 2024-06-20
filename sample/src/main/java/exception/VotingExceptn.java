package exception;

public class VotingExceptn {
public void display(int age) throws VotingException
{
if(age>18)
{
System.out.println("Eligible for voting");	
}
else
{
throw new VotingException("Invalid age");	
}
}
	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
VotingExceptn obj=new VotingExceptn();
obj.display(15);
	}

}
