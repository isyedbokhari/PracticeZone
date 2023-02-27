package week04;

import java.util.Scanner;

public class EmailTask02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your email...");
		String email = scan.nextLine();
		String firstName = email.substring(0, email.indexOf('_'));
		firstName = firstName.substring(0 , 1).toUpperCase().concat(firstName.substring(1));
		System.out.println("First Name: " + firstName);
		String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
		lastName = lastName.substring(0 , 1).toUpperCase().concat(lastName.substring(1));
		System.out.println("Last Name: " + lastName);
		String domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
		System.out.println("Domain: " + domain);
		System.out.println();
		scan.close();
	}

}
