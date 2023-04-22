package week05;

import java.util.Arrays;

public class Task19 {
	/*Given name array. find all the palindrome string 
	 * then put into a new array.

		input:
		{"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", 
		"Yasin", "Bob", "Inna", "Eve"};

		output:
		{"Anna", "Nalan", "Hannah", "Emma", "Bob", "Eve"}

	 */
	public static void main(String[] args) {
		
		String name[] = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", 
				         "Ciris", "Yasin", "Bob", "Inna", "Eve"};
		String palindromes[] = new String[name.length];
		int count = 0;
		
		for (String a : name) {
			String reversedString = new StringBuilder(a).reverse().toString();
			if (reversedString.equalsIgnoreCase(a)) {
				palindromes[count] = a;
				count++;
			}
		}
		palindromes = Arrays.copyOf(palindromes, count);
		System.out.println(Arrays.toString(palindromes));
		
	}

}
