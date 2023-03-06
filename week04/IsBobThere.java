package week04;

import java.util.Scanner;

public class IsBobThere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = scan.nextLine();
		boolean isBobThere = false;
		for (int i = 0; i <= word.length() -2 ; i++) {
			if (word.charAt(i)==('b') && word.charAt(i + 2) == 'b') {
				isBobThere = true;
			}
		}
		System.out.println(isBobThere);
		scan.close();
		
	}

}
