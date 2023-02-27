package week03;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		boolean isPrime = true;
		for (int check = 2; check < num; check++) {
			if (num % check == 0) {
				isPrime = false;
				break;
			}
		}
		  if (isPrime) {
			System.out.println("Its a prime number!");
		} else {
			System.out.println("Its not a prime number!");
			scan.close();
		}
	}

}
