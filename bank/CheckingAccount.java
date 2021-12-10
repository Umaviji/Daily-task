package org.bank;

import java.util.Scanner;

public class CheckingAccount extends SavingsAccount {
			Scanner sc=new Scanner(System.in);
			
			public void deductfees() {
				
				System.out.println("Enter withDraw Amount:");
				double i=sc.nextDouble();
				double withdrawal =i;
				if (i <=50000) {
					System.out.println("Dont Deduct Fee:");
					
					amount= amount - i;
				} 
				else {
                  i=i * 5 / 10000;
                  System.out.println("Deduct fees is:"  +i);
                  amount= amount - i - withdrawal;
                  
				}
			}
		public static void main(String[] args) {
			CheckingAccount p= new CheckingAccount();
			p.initialAmount();
			p.deductfees();
			p.getBalance();
		
	
			
			
		}
	

}
