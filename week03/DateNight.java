package week03;

import java.util.Scanner;

public class DateNight {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Rank your and your date's stylishness...");
		int you = scan.nextInt();
		int date = scan.nextInt();
		while (you < 0 || you > 10 || date < 0 || date > 10) {
			System.out.println("Invalid input... Enter a number between 0 and 10");
			you = scan.nextInt();
			date = scan.nextInt();
		}  if (you >= 8 || date >= 8) {
			System.out.println("You guys are definitely getting a table!");
		} else if (you <= 2 || date <= 2) {
			System.out.println("Sorry, but no table for you guys!");
		} else {
			System.out.println("Ahh, you maybe lucky tonight!");
		}   
		scan.close();
		
		
	
	}

}
