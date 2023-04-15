package week06;

import java.util.ArrayList;
import java.util.Collections;

public class Task13 {

	
	public static ArrayList<Integer> sortReverse(ArrayList<Integer> arr) {
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		Collections.sort(arr, Collections.reverseOrder());
		reversed.addAll(arr);
		return reversed;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int array[] = {1, 22, 37, 4, 5, 61, 7, 8, 99, 10};
		for (int i : array) {
			arr.add(i);
		}
		System.out.println(sortReverse(arr));
		
	}

}
