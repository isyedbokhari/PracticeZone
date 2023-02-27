package week03;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		int fac = 1;
		for (int trail = num; trail > 0 ; trail--) {
			fac = trail*fac;
		}
		System.out.println(fac);
		scan.close();
	}

}
