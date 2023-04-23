package week06;

import java.util.ArrayList;

public class Task10 {
		/*
		 * write a program that can remove the digits 
		 * and letters from an array list of characters
		 *  Arraylist ==>
		input:
		[1,3,a,&,d,4,2,1,d,4,0,6,7,7,f,d,w,r,3,4,!,@]
    
		output: 
		&,!,@
		 */
	public static char[] removeChar(ArrayList<Character> arr) {

		for (int i = arr.size() - 1; i >= 0; i--) {
			if (arr.get(i) >= 97 && arr.get(i) <= 122) {
				arr.remove(i);
			} else if (arr.get(i) >= 65 && arr.get(i) <= 90) {
				arr.remove(i);
			} else if (arr.get(i) >= 48 && arr.get(i) <= 57) {
				arr.remove(i);
			}
		}
		char newArray[] = new char[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			newArray[i] = arr.get(i);
		}return newArray;
	}

	public static void main(String[] args) {
		ArrayList<Character> arr = new ArrayList<Character>();
		arr.add('a');
		arr.add('1');
		arr.add('$');
		System.out.println(removeChar(arr));
	}

}
