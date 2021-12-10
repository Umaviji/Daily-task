package day3.task1;

import java.util.Scanner;

public class BlackThinder {
	double charge;
	Scanner sc = new Scanner(System.in);

	public void ticketCharge() {

		System.out.println("Enter the Number of persons Entered:");
		int persons = sc.nextInt();

		System.out.println("Enter the Age:");
		int Age = sc.nextInt();

		if (Age <= 3) {
			System.out.println("Enter Under the Age charge:" + persons * 0);
			charge = 0 * persons;
		} else if (Age > 3 && Age <= 12) {

			System.out.println("kids ticket charge:" + persons * 70);
			charge = 70 * persons;
		} else if (Age > 13 && Age <= 20) {
			System.out.println("Adult ticket charge:" + persons * 120);
			charge = 120 * persons;
		} else if (Age > 21 && Age <= 54) {
			System.out.println("Citizen ticket charge:" + persons * 200);
			charge = 200 * persons;

		} else if (Age <= 55) {
			System.out.println("senior Citizen ticket charge:" + persons * 150);
			charge = 150 * persons;
		}
		charge = charge + (charge * 0.02);
	}

	public static void main(String[] args) {
		BlackThinder u = new BlackThinder();
		u.ticketCharge();

	}

}
