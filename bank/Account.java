package org.bank;

import java.util.Scanner;
public class Account {
	     
	     Scanner sc =new Scanner(System.in);
	      double amount;
	     
	     public  void initialAmount() {
		 System.out.println("Enter the Intial Amount:");
		 double ini = sc.nextDouble();
	}
	     public void withDraw() {
	     System.out.println("Enter the WithDraw Amount:");
	     double withdrawAmount = sc.nextDouble();
	     amount =amount - withdrawAmount;
	     System.out.println("Amount Balance is:" +amount);
	}
	     public void deposite() {
		 System.out.println("Enter the Deposite Amount:");	
		 double depositeAmount = sc.nextDouble();
		 amount =amount + depositeAmount;
		 System.out.println("Account Balance is:" +amount);
	}
         public void getBalance() {
         System.out.println("Update Balance is:" +amount);
			
    }
}
