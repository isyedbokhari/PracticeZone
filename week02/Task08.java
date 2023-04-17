package week02;

import java.util.Scanner;

public class Task08 {
		/*
		  	Write a Java Program to print the following 
		  	message. 
			Good Morning 
			5< 12 
			Good Afternoon 
			12 — 17 
			Good Evening 
			17—24 
			
			When do the greetings (Good morning, afternoon, 
			and evening) change? ● Good morning. 
			5:00 AM — 11:59 AM. 
			● Good afternoon. 12:00 PM — 4:59 PM. 
			● Good evening. 5:00 PM — 4:59 AM. 
		 */ 

		
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
