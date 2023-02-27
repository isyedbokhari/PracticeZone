package week03;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		int sum = 0;
		int digits;
		while (num != 0) {
			digits = num % 10;
			sum+=digits;
			num /=10;
		}
		System.out.println("The sum of digits is: " + sum);
		scan.close();
	}

}
