package week02;

import java.util.Scanner;

public class Task10 {
		/*
		    Write a Java program and compute the sum of the 
		    digits of an integer.  
		    Input Data: 
			Input an integer: 25 
			Expected Output 
			The sum of the digits is: 7 
		*/
	public static void main(String[] args) {
		// I used ChatGPT to explain this code to me...
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		int sum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
			}
		System.out.println("The sum of the digits is: " + sum);
		scan.close();
	
	}
	

}
