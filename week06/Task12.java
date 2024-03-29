package week06;

import java.util.Arrays;

public class Task12 {
		/*
		 * Write a program to get unique character set from 
		 * a string.

		input:
		String str = "aaaaabbbccccdeeeefaab"; 

		output : 
		[a,b,c,d,e,f]
		 */
	public static char[] getUnique(String a) {
		String unique = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (unique.indexOf(c) == -1) {
				unique += c;
			}
		}
		
		char uniqueChar[] = unique.toCharArray();
		return uniqueChar;
	}
	
	public static void main(String[] args) {
		
		
		String str = "aaaaabbbccccdeeeefaab";
		System.out.println(Arrays.toString(getUnique(str)));
		
		
	}

}
