package week04;

import java.util.Scanner;

public class SeeingDouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = scan.nextLine();
		
		int length = word.length();
	    for (int i = 0 ; i <= length - 1 ; i++) {
	    	System.out.print(word.charAt(i));
	    	for (int j = i ; j <= i ; j++) {
		    	System.out.print(word.charAt(j));
		    	
	    	}
	    }
		
	    scan.close();
	}

}
