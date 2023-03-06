package week04;

import java.util.Scanner;

public class MiddleTwo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word of even length...");
		String word = scan.nextLine();
		
		int lengthCheck = word.length() % 2;
		int half = word.length() / 2;
		
		if (lengthCheck == 0) {
			System.out.println(word.substring(half - 1 , half + 1));
		} else {
			System.out.println("Enter a word with even number of alphabets");
		}
		
		scan.close();
		
	}

}
