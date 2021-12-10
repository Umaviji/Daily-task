package org.inheritance;

import java.util.Scanner;

public class ChildClass extends ParentClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ChildClass p=new ChildClass();
		
		System.out.println("Enter value:");
	    int add = p.add(sc.nextInt(),sc.nextInt());
	    System.out.println("Addition:"+add);
	    
	    System.out.println("Enter value:");
	    int sub = p.sub(sc.nextInt(),sc.nextInt());
	    System.out.println("Subtraction:"+sub);
	    
	    System.out.println("Enter value:");
	    int product = p.product(sc.nextInt(),sc.nextInt());
		System.out.println("Product:"+product);
		
	    System.out.println("Enter value:");
        int division = p.division(sc.nextInt(),sc.nextInt());
		System.out.println("division:"+division);
			
	}

}
