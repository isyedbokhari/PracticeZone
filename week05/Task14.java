package week05;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence...");
		String sentence = scan.nextLine();
		String words[] = sentence.split(" ");
		
		
		int shortestLength = Integer.MAX_VALUE;
		for (String word : words) {
			shortestLength = Math.min(shortestLength, word.length());
		}
		
		int count = 0;
		String shortestWords[] = new String[words.length];
		for (String word : words) {
			if (shortestLength == word.length()) {
				shortestWords[count++] = word;
			}
		}
		
		shortestWords = Arrays.copyOf(shortestWords, count);
		Arrays.sort(shortestWords);
		System.out.println(Arrays.toString(shortestWords));
		
		scan.close();
	}

}
