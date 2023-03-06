package week04;

import java.util.Scanner;

public class SeeColor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String color = scan.nextLine();
		
		if (color.startsWith("red")) {
			System.out.println(color.substring(0 , 3));
		} else if (color.startsWith("blue")) {
			System.out.println(color.substring(0 , 4));
		} else {
			System.out.println();
		}
		
		scan.close();
		
	}

}
