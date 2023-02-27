package week04;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
//		
//		Task15
//		Write a program to extract digits from a String: input: ab123c4d56efg output:123456
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String...");
		String input = scan.nextLine();
		StringBuilder digits = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			
				char c = input.charAt(i);
			
			if (Character.isDigit(c)) {
				digits.append(c);
			}
		}
		String fresh = digits.toString();
		System.out.print(fresh);
		scan.close();
	}

}
