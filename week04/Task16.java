package week04;

public class Task16 {

	public static void main(String[] args) {
		
//		Task16
//		Write a program to extract distinct character from a string input: abcabcabcabc output:abc
		
		
		
		String input = "abcabcabc";
		String result = "abc";
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (result.indexOf(c) == -1) {
				result = result + input.charAt(i);
			}
		}
		System.out.println(result);
		
	}

}
