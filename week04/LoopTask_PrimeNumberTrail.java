package week04;

import java.util.Scanner;

public class LoopTask_PrimeNumberTrail {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		for (int i = 2; i < num; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
			
		}scan.close();
	} 

}
