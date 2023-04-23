package week06;

import java.util.ArrayList;
import java.util.Arrays;

public class Task03 {
		/*
		 * Remove all the element that has letter 'J' 
		 * from the list.
		input:
		{"Java", "Python", "JavaScript", "C#", 
		"C++", "Javabean", "IntelliJ"}

		output:
		{"Python", "C#", "C++"}
		 */
	public static String[] removeAllJ(String array[]) {
		ArrayList<String> wordList = new ArrayList<>();
		
			for (int i = 0; i < array.length; i++) {
				if (!array[i].toLowerCase().contains("j")) {
					wordList.add(array[i]);
				}
			}
			String newArray[] = wordList.toArray(new String[wordList.size()]);
			return newArray;
			
	}
	
	public static void main(String[] args) {
		
		
		String array[] = {"Java", "Python", "JavaScript", "C#", "C++", "Javabean", "IntelliJ"};
		
		System.out.println(Arrays.toString(removeAllJ(array)));
		
	}

}
