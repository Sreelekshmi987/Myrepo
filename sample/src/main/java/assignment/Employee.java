package assignment;

public abstract class Employee {
	
	double baseSalary;
	
	public Employee(double baseSalary)
	{
	this.baseSalary=baseSalary;	
	}
	
public abstract double calculateSalary();
public  abstract void display();


}
