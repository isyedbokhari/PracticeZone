package week02;

import java.util.Scanner;

public class Task02 {
		/*
		 * Write a program that takes a user's score as input 
		 * and prints out their letter  grade based on the 
		 * following scale: A = 90-100 B = 80-89 C = 70-79 
		 * D = 60-69 F =  0-59
		 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade...");
		int grade = scan.nextInt();
		if (grade >= 90 && grade <= 100) {
			System.out.println("Your letter grade is 'A'");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("Your letter grade is 'B'");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("Your letter grade is 'C'");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("Your letter grade is 'D");
		} else if (grade >= 0 && grade <= 59) {
			System.out.println("Your letter grade is 'F'");
		} else { 
				System.out.println("Invalid grade!");
		}
		scan.close();
	}

	}
