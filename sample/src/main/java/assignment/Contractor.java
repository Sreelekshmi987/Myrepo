package assignment;

public class Contractor extends Employee {
	 
	 double bonus;
	
	public Contractor(double baseSalary,double bonus)
	{
	super(baseSalary);
	this.bonus=bonus;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return baseSalary + bonus;
	}

	@Override
	public void display() {

		// TODO Auto-generated method stub
		System.out.println("Base salary: "+baseSalary);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total salary: "+calculateSalary());
		
	}
	

}
