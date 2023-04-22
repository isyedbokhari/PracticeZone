package week05;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
		/*
		 * Write a program that will find out the shortest 
		 * words in the given string str. If there are few
    words that are evenly short, print them all. 
    Use the split method in order to split the str
    string variable and create an array of strings.
     Print array with Arrays.toString() method. Sort
    array before printing.

	Example:
	input: 
	olive, fish, pursuit, old, warning, python, java, coffee, cat, ray 

	output: 
	cat, old, ray
	*/
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
