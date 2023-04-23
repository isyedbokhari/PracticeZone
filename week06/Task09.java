package week06;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09 {
		/*
		 * write a program that find the unique 
		 * names from an arraylist of string

		input:
		[Liam,Olivia,Emma,Sophia,James,Henry,
		Olivia,Emma,Sophia,James,Henry]

		output =
		[Liam,Olivia,Emma,Sophia,James,Henry]
		 */
	public static String[] returnUnique(String arr[]) {
		ArrayList<String> wordList = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (!wordList.contains(word)) {
				wordList.add(word);

			}
		}

		String uniqueWords[] = wordList.toArray(new String[wordList.size()]);
		return uniqueWords;
	}

	public static void main(String[] args) {
		String words[] = { "Liam", "Olivia", "Emma", "Sophia", "James", "Henry", "Olivia", "Emma", "Sophia", "James",
				"Henry" };
		System.out.println(Arrays.toString(returnUnique(words)));

	}

}
