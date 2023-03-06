package week05;

import java.util.Scanner;

public class Task17 {

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
