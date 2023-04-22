package week05;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
		/*
		 * Write a program to check if two string are Anagram 
		checkAnagram("acdb","dbca") -> true
		checkAnagram("room", "doom") -> false
		 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word...");
		String x = scan.nextLine();
		System.out.println("Enter second word...");
		String y = scan.nextLine();
		
		x = x.toLowerCase();
		y = y.toLowerCase();
		
		x = x.replace(" ", "");
		y = y.replace(" ", "");
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);;
		
		Boolean result = Arrays.equals(a, b);
		
		if (result == true) {
			System.out.println("These are anagrams!");
		} else {
			System.out.println("These are not anagrams!");
		}
		
		scan.close();
		
		
	}

}
