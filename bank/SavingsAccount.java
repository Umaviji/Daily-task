package org.bank;

import java.util.Scanner;

public  class SavingsAccount extends Account{
      double rateofInterest;
      Scanner sc=new Scanner(System.in);
     
      public void calculateInterest() {
    	  
    	  rateofInterest = amount * 0.07;
    	  System.out.println("Rate of Interest to the Account:" + rateofInterest);
    	  
    	  amount=amount +rateofInterest;
    	  System.out.println("Add the interest to the Account:" +amount);
}
    	  public static void main(String[] args) {
    		  
		  SavingsAccount p=new SavingsAccount();
		  
		  p.initialAmount();
		  p.calculateInterest();
		  p.withDraw();
		  p.deposite();
			
		}

	

}
