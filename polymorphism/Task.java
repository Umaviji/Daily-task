package org.polymorphism;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Overloading p=new Overloading();
	
	System.out.println("Enter value:");
	p.addition(sc.nextInt(),sc.nextInt());
	
	System.out.println("Enter value:");
	p.subtraction(sc.nextInt(), sc.nextDouble());
	
	System.out.println("Enter value:");
	p.product(sc.nextInt(),sc.nextFloat());
	
	System.out.println("Enter value:");
	p.division(sc.nextFloat(), sc.nextInt());
}

}
