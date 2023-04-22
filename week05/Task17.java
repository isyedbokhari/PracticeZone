package week05;

import java.util.Scanner;

public class Task17 {
		/*
		 * Write a program that can reverse the word of every 
		 * second word of the sentence

		Example:

		input:
		"I love Java so much more than Javascript"

		output:
		"I evol Java os much erom than tpircsavaJ"


		input:
		"find all the palindrome string"

		output:
		"find lla the emordnilap string"


		 */
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence...");
		String sentence = scan.nextLine();
		
		String array[] = sentence.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				sb.append(new StringBuilder(array[i]).reverse().toString());
			} else {
				sb.append((array[i]));
			}
			
			sb.append(" ");
		}
		
		String reversed = sb.toString().trim();
		System.out.println(reversed);
		
		scan.close();
		
		
		
	}

}
