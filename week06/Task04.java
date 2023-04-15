package week06;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {

	public static String[] returnPalindrome(String array[]) {
		
		ArrayList<String> list = new ArrayList<>();
		
			for (String word : array) {
				String reversed = "";
				for (int i = word.length() -1; i >= 0; i--) {
					reversed += word.charAt(i);
				}
				if (reversed.equalsIgnoreCase(word)) {
					list.add(word);
				}
			}
			
			String palendromes[] = list.toArray(new String[list.size()]);
			return palendromes;
	}

	public static void main(String[] args) {
		
		String array[] = {"Anna", "Racecar", "Level", "Eye", "Java", "Python", "TechCircle"};
		System.out.println(Arrays.toString(returnPalindrome(array)));
		
	}

}
