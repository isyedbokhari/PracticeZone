package week02;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the hour...");
		int hour = scan.nextInt();
		if (hour >= 5 && hour <= 12) {
			System.out.println("Good Morning!");
		} else if (hour > 12 && hour <= 17) {
			System.out.println("Good Afternoon!");
		} else if (hour > 17 && hour <= 24) {
				System.out.println("Good Evening!");
		} else {
			System.out.println("Invalid entry!");
		} scan.close();
		
		

	
	}

}
