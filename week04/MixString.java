package week04;

import java.util.Scanner;

public class MixString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word...");
		String word1 = scan.nextLine();
		System.out.println("Enter second word...");
		String word2 = scan.nextLine();
		
		
		
		for (int i = 0 ; i <= word1.length() -1 && i <= word2.length() -1 ; i++) {
			
			System.out.print(word1.charAt(i));
			System.out.print(word2.charAt(i));
			
		}
			if (word1.length() < word2.length()) {
				System.out.print(word2.substring(word1.length()));
			} else {
				System.out.print(word1.substring(word2.length()));

			}
		
		scan.close();
		
	}

}
