package week03;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value");
		int one = scan.nextInt();
		System.out.println("Enter second value");
		int two = scan.nextInt();
		System.out.println("Enter third value");
		int three = scan.nextInt();
		System.out.println("Enter fourth value");
		int four = scan.nextInt();
		System.out.println("Enter fifth value");
		int five = scan.nextInt();

		if (one > two && one > three && one > four && one > five) {
			System.out.println(one + " is the greatest value!");
		}
		else if (two > one && two > three && two > four && two > five) {
			System.out.println(two + " is the greatest value!");
		}
		else if (three > one && three > two && three > four && three > five) {
			System.out.println(three + " is the greatest value!");
		}
		else if (four > one && four > two && four > three && four > five) {
			System.out.println(four + " is the greatest value!");
		}
		else if (five > one && five > two && five > three && five > four) {
			System.out.println(five + " is the greatest value!");
		} scan.close();

	}
}
