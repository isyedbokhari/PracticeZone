package week02;

import java.util.Scanner;

public class Task04 {
		/*
		 * Write a program that takes a letter grade as
		 *  input (A, B, C, D, or F) and prints  whether 
		 *  the grade is passing or failing. A grade of 
		 *  A, B, or C is considered  passing, and a grade 
		 *  of D or F is considered failing. 
		 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your letter grade...");
		String grade = scan.nextLine();
		if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
			System.out.println("You've PASSED!");
		} else if (grade.equals("D")|| grade.equals("F")) {
			System.out.println("You've FAILED!");
		} else {
			System.out.println("Invalid grade!");
		} scan.close();
	}

}
