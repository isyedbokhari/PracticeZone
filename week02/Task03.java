package week02;

import java.util.Scanner;

public class Task03 {
		/*
		 * Write a program that takes two integers as input 
		 * and prints "The numbers are  equal" if they are 
		 * equal, "The first number is greater" if the first 
		 * number is  greater, and "The second number is 
		 * greater" if the second number is greater. 
		 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number...");
		int a = scan.nextInt();
		System.out.println("Enter second number...");
		int b = scan.nextInt();
		if (a == b) {
			System.out.println("Both numbers are equal.");
		} else if (a < b) {
			System.out.println("The second number is greater.");
		} else {
			System.out.println("The first number is greater.");
		} scan.close();
		
		
	}

}
