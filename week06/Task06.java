package week06;

import java.util.ArrayList;
import java.util.Collections;

public class Task06 {
		/*
		 * Write a program that can 
		 * return the nth largest number 
		 * from an arraylist. Constraints: n <= arr.size()
	findNThLargest({ 1, 2, 3, 4, 5, 6, 7, 7 ,8, 8}, 5) ==> 4
	findNThLargest({ 10, 20, 3, 11, 4, 5, 11,}, 2) ==> 11
	findNThLargest({ -3, 0, 11, 4, -5, 11, 0}, 4) ==> -3
		 */
	public static int returnNthLargest(ArrayList<Integer>arr, int n) {
		
		// sorting the array list in descending order
		Collections.sort(arr, Collections.reverseOrder());
		// return the nth largest number
		return arr.get(n - 1);
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(7);
		arr.add(8);
		arr.add(8);
		System.out.println(returnNthLargest(arr, 5));
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(10);
		arr2.add(20);
		arr2.add(3);
		arr2.add(11);
		arr2.add(4);
		arr2.add(5);
		arr2.add(11);
		System.out.println(returnNthLargest(arr2, 2));

		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3.add(-3);
		arr3.add(0);
		arr3.add(11);
		arr3.add(4);
		arr3.add(-5);
		arr3.add(11);
		arr3.add(0);
		System.out.println(returnNthLargest(arr3, 4));
		
	}

}
