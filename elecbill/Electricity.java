package org.elecbill;


import java.util.Scanner;

public class Electricity {
	Scanner sc=new Scanner(System.in);
	public void electricityBill() {
		System.out.println("Enter the 1-User Electricity Bill:");
		int rate1 = sc.nextInt();
		
		if (rate1>=1 && rate1<=100) {
			System.out.println("Bill of 1- User:"+(rate1-100)*0);
			}
		   else if (rate1>101 && rate1<=200) {
	       System.out.println("Bill of 1- User:"+(rate1-100)*1.5);
		}
		   else {
		   System.out.println("Bill of 1- User:"+(rate1=100)*6.6);
		}
	
	      System.out.println("Enter the 2-User Electricity Bill:");
		  int rate2 = sc.nextInt();
		
		  if (rate2>1 && rate2<=100) {
		  System.out.println("Bill of 2- User:"+(rate2-100)*0);
		
		  }else if (rate2>102 && rate2<=200) {
		  System.out.println("Bill of 2- User:"+(rate2-100)*2);
		
		}else if(rate2>200 && rate2<=500) {
			System.out.println("Bill of 2- User:"+(rate2-100)*3);
		}
		else {
			System.out.println(" Bill of 1- User:"+(rate2=100)*6.6);
		}
		  
		System.out.println("Enter the 3-User Electricity Bill:");
			int rate3 = sc.nextInt();
			if (rate3>1 && rate3<=100) {
				System.out.println("Bill of 3- User:"+(rate3-100)*0);
				
           }else if (rate3>101&&rate3<=500) {
        	System.out.println("Bill of 2- User:"+(rate3-100)*3.5);
         
           }else if (rate3>201&&rate3<=500) {
        	System.out.println("Bill of 2- User:"+(rate3-100)*4.6);
		}	
        else {
			System.out.println("Bill of 1- User:"+(rate3-100)*6.6);
		}
	}
			
	public static void main(String[] args) {
		Electricity p=new Electricity();
		p.electricityBill();
		 
	}
		}
		
				
			
