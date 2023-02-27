package week02;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		if (num > 0) {
			System.out.println("Its a positive number.");
		} else if (num < 0) {
			System.out.println("Its a negative number.");
		} else if (num == 0) {
			System.out.println("Its zero.");
		} scan.close();
	}

}
