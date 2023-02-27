package week04;

import java.util.Scanner;

public class EmailTask01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an email...");
		String email = scan.nextLine();
		int underscoreIndex = email.indexOf("_");
		
	    if (underscoreIndex != -1) {
	    	String firstHalf = email.substring(0, underscoreIndex);
			String secondHalf = email.substring(underscoreIndex + 1, email.indexOf("@"));
			String domain = email.substring(email.indexOf("@"));
			System.out.println(secondHalf + "_" + firstHalf + domain);
		} else {
			System.out.println(email);
		}
		scan.close();
	}

}
