package week03;

import java.util.Scanner;

public class WierdNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = scan.nextInt();
		
			if (n % 2 != 0) {
				System.out.println("Wierd!");
			} else if (n % 2 == 0 && n >= 2 && n <= 5) {
				System.out.println("Not wierd!");
			} else if (n % 2 == 0 && n >= 6 && n <= 20) {
				System.out.println("Wierd!");
			} else if (n % 2 == 0 && n > 20) {
				System.out.println("Not wierd!");
			}
		scan.close();
	} 

}
