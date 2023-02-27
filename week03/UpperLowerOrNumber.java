package week03;

import java.util.Scanner;

public class UpperLowerOrNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number or a character...");
		char a = scan.next().charAt(0);
		
		if (Character.isLowerCase(a)) {
			System.out.println("Its in lowercase!");
		} else if (Character.isUpperCase(a)) {
			System.out.println("Its in uppercase!");
		} else if (Character.isDigit(a)) {
			System.out.println("Its a digit!");
		} else {
			System.out.println("This input cannot be computed!");
		} scan.close();

	}

}
