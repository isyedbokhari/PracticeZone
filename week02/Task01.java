package week02;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scan.nextInt();
		if (age < 18) {
			System.out.println("You're a minor.");
		} else {
			System.out.println("You're an adult.");
			scan.close();
		}
	}

}
