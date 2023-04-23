package week06;

import java.util.ArrayList;
import java.util.Collections;

public class Task11 {
		/*
		 * Write a program that can sort and Arraylist of 
		 * integer ascending order
*/
	public static ArrayList<Integer> makeAscending(ArrayList<Integer> arr) {
		
		ArrayList<Integer> sortedArray = new ArrayList<Integer>();
		Collections.sort(arr);
		sortedArray.addAll(arr);
		return sortedArray;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int array[] = {1, 12, 14, 5, 72, 313};
		for (int i : array) {
			arr.add(i);
		}
		System.out.println(makeAscending(arr));
		
	}

}
