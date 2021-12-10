package org.emp;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee p=new Employee();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter email id:");
     	String email = sc.nextLine();	
     	p.setEmployee_email(email);
     	System.out.println("Employee email is:"+p.getEmployee_email());
     	
     	System.out.println("Enter name:");
     	String name = sc.nextLine();
     	p.setEmployee_name(name);
     	System.out.println("Employee name is:"+p.getEmployee_name());
     	
     	System.out.println("Enter phoneno:");
     	long phoneno = sc.nextLong();
	    p.setEmployee_phoneno(phoneno);
	    System.out.println("Employee phone no is:"+p.getEmployee_phoneno());
	    
	    System.out.println("Enter id:");
	    int id = sc.nextInt();
	    p.setEmployee_id(id);
	    System.out.println("Employee id is:"+p.getEmployee_id());
	    
	}

}
