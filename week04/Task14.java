package week04;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
//		Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
//
//        input:
//            firstName = "tecHCIrcle"
//            lastName = "SCHOOL";
//
//        output:
//            Techcircle School
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name...");
		String firstName = scan.nextLine();
		System.out.println("Enter last name...");
		String lastName = scan.nextLine();
		firstName = firstName.substring(0 , 1).toUpperCase() + firstName.substring(1).toLowerCase();
		System.out.println(firstName);
		lastName = lastName.substring(0 , 1).toUpperCase() + lastName.substring(1).toLowerCase();
		System.out.println(lastName);
		scan.close();
		
		
		
	}

}
