package assignment;

public class Fulltimeemployee extends Employee{
 int workingHours;
  double paymentperHour;
  
  public Fulltimeemployee(double baseSalary,int workingHours,double paymentperHour )
  {
	  
     super(baseSalary);
	  this.workingHours=workingHours;
	  this.paymentperHour=paymentperHour;
  }
	

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return baseSalary+ (workingHours*paymentperHour);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Base salary: "+baseSalary);
		System.out.println("Working hours: "+workingHours);
		System.out.println("Payment per hour: "+paymentperHour);
		System.out.println("Total Salary: "+calculateSalary());
	}
    public static void main(String args[])
    {
    Contractor obj1=new Contractor(6000,1000);
     Fulltimeemployee obj2=new Fulltimeemployee(6000,8,25);
     obj1.display();
     obj2.display();
     
    }
}
