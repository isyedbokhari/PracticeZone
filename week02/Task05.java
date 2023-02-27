package week02;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("It is an even number.");
		} else {
			System.out.println("It is an odd number.");
		} scan.close();
	}

}
