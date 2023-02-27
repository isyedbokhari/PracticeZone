package week03;

import java.util.Scanner;

public class CampusTime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time...");
		int time = scan.nextInt();
		
		while (time <= 0 || time > 24) {
			System.out.println("Invalid input!");
			time = scan.nextInt();
			
		}
		if (time > 8) {
			System.out.println("Open!");
		} else if (time < 8 || time >23) {
			System.out.println("Closed!");
		} scan.close();
	}

}
