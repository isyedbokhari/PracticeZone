package week04;

import java.util.Scanner;

public class RepeatSeperator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = scan.nextLine();
		System.out.println("Enter a seperator...");
		String seperator = scan.nextLine();
		System.out.println("How many times you want the word to repeat?");
		
		int count = scan.nextInt();
		for (int i = 1 ; i <= count ; i++) {
			
			if (count == 1) {
				System.out.print(word);
			}
			if (count > 1) {
				System.out.print(word.concat(seperator));
			}
		}
		scan.close();
	}

}
