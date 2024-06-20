package assignment;

import java.util.Scanner;

public class InheritanceEg1 {
	public void display()
	{
	 Scanner obj=new Scanner(System.in);
	 System.out.println("basic pay:");
	 int basicpay=obj.nextInt();
	 
	 System.out.println("hra :");
	 int hra=obj.nextInt();
	 
	 System.out.println("pf:");
	 int pf=obj.nextInt();
	 
	 System.out.println("deduction:");
	 int deduction=obj.nextInt();
	 
	 System.out.println("bonus");
	 int bonus=obj.nextInt();
	 
	 int num=basicpay+hra-pf-deduction+bonus;
	 System.out.println("Total Salary by hand is:"+num);

	}
	}


