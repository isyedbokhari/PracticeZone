package week03;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 4 digit number...");
		int a = scan.nextInt();
		int firstDigit = a / 1000;
		int secondDigit = (a % 1000) / 100;
		int thirdDigit = (a % 100) / 10;
		int lastDigit = a % 10;
		if (firstDigit + secondDigit == thirdDigit + lastDigit) {
			System.out.println("Yay, its a lucky number!");
		} else {
		System.out.println("Better luck next time!");
		}scan.close();
	} 

}
