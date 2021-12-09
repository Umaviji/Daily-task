package org.empl;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter the value:");
		Employee p=new Employee();
		int monthlysalary1 = sc.nextInt();
		p.setEmpfirstname("Uma");
		System.out.println("Employee name:"+p.getEmpfirstname());
		p.setEmpsalary(monthlysalary1);
		System.out.println("Yearly Employee Salary:"+p.getEmpsalary() *12);
		System.out.println("Yearly Employee Salary after Raise:"+p.getEmpsalary()*1.10*12);
		
	
		System.out.println("Enter the value:");
		 
		Employee p1=new Employee();
		int monthlysalary2 = sc.nextInt();
		p.setEmpfirstname("Murugan");
		System.out.println("Employee name:"+p.getEmpfirstname());
		p.setEmpsalary(monthlysalary2);
		System.out.println("Yearly Employee Salary:"+p.getEmpsalary() *12);
		System.out.println("Yearly Employee Salary after Raise:"+p.getEmpsalary()*1.10*12);
				
		
	}

}
