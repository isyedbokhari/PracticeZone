package week04;

import java.util.Scanner;

public class HasBad {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = scan.nextLine();
		
		if (word.startsWith("bad")) {
			System.out.println(word.startsWith("bad"));
		} else if (word.startsWith("bad", 1)) {
			System.out.println(word.startsWith("bad", 1));
		} else {
			System.out.println("Enter a baddd word!");
		}
		
		scan.close();
		
	}

}
