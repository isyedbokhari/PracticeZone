package week05;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * write a program that can count how many
		 *  palindromes in an array of string 
		Example:
			input:
			{"anna", "level", "Java"}; 
			output:
			2 
		 */
		String words[] = { "Anna", "Level", "Java" };
		int count = 0;
		int count2 = 0;
		// using for each loop
		for (String word : words) {
			String reverse = "";
			
			for (int i = word.length() - 1; i >= 0; i--) {
				reverse += word.charAt(i);
			}

			if (reverse.equalsIgnoreCase(word)) {
				System.out.println(word + " is palindrome");
				count++;
				
			} else {
				System.out.println(word + " is not palindrome");
			}
			
		}
		System.out.println();
		System.out.println("Palindrome Count: " + count);
		System.out.println("=============");

		// using for loop

		for (int j = 0; j <= words.length -1; j++) {

			String str = words[j];
			String reversed = "";
			
			for (int k = str.length() - 1; k >= 0; k--) {
				reversed += str.charAt(k);

			}
			if (reversed.equalsIgnoreCase(str)) {
				System.out.println(reversed + " is palindrome");
				count2 ++;
			} else {
				System.out.println(reversed + " is not palindrome");
				
			
			}
		}
		System.out.println();
		System.out.println("Palindrome Count: " + count2);
	}

}
