package Encapsulation;

import java.util.Scanner;

public class Encapsulation {
	public int add(int i, int j) {
		return i + j;
	   }
		public int sub(int i, int j) {
			return i-j;
	   }
		public int product(int i, int j) {
			return i*j;
	   }
		public int division(int i, int j) {
			return i/j;
		}

	public static void main(String[] args) {
		EncapsulationTask p =new EncapsulationTask();
		
		Scanner sc =new Scanner(System.in);
		
		Encapsulation u =new Encapsulation();
		
		System.out.println("Enter value:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		p.setI(i);
		p.setJ(j);
		int add = u.add(p.getI(),p.getJ());
		System.out.println("Addition value is:"+add);
		
		System.out.println("Enter value:");
		int i1 = sc.nextInt();
		int j1 = sc.nextInt();
		p.setI(i1);
		p.setJ(j1);
		int sub = u.sub(p.getI(),p.getJ());
		System.out.println("Subtraction value is:"+sub);
		
		System.out.println("Enter value:");
		int i2 = sc.nextInt();
		int j2 = sc.nextInt();
		int product = u.product(p.getI(),p.getJ());
		System.out.println("Product value is"+product);
		

		System.out.println("Enter value:");
		int i3 = sc.nextInt();
		int j3 = sc.nextInt();
		int division = u.division(p.getI(),p.getJ());
		System.out.println("Division value is"+division);
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}
	
}

