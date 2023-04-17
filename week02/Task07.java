package week02;

import java.util.Scanner;

public class Task07 {
		/*
		 * Write a Java Program that prints the day of 
		 * the week. 
			Note: Your input must be between 1 to 7: 
			Example: 
			Input: 1
			output: Monday 
			Input: 7 
			output: Sunday 
		 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for the day of the week...");
		int day = scan.nextInt();
		if (day == 1) {
			System.out.println("Happy Monday!");
		} else if (day == 2) {
			System.out.println("Happy Tuesday!");
		} else if (day == 3) {
			System.out.println("Happy Wednesday!");
		} else if (day == 4) {
			System.out.println("Happy Thursday!");
		} else if (day == 5) {
			System.out.println("Happy Friday!");
		} else if (day == 6) {
			System.out.println("Happy Saturday!");
		} else if (day == 7) {
			System.out.println("Happy Sunday!");
		} else {
			System.out.println("Invalid number -- The number must be from 1 to 7 ONLY!");
		}
		scan.close();
	    
	}


}
