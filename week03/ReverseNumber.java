package week03;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		 * create an array that has the numbers 100 to 1
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		int reversed = 0;
		while (num != 0) {
			int digits = num % 10;
			reversed = reversed * 10 + digits;
			num /= 10;
		}
		System.out.println("The reversed number is: " + reversed);
		scan.close();
	}

}
