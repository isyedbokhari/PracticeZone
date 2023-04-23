package week06;

import java.util.ArrayList;

public class Task07 {
		/*
		 * Write a program that can find the 
		 * maximum, minimum and average 
		 * number from an arrayList of integers
		 */
	public static int returnLargest(ArrayList<Integer>arr) {
		int max = 0;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		} return max;
		
	}
	
	public static int returnSmallest(ArrayList<Integer>arr) {
		int min = 0;
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		} return min;
	}
	
	public static double returnAverage(ArrayList<Integer>arr) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		double average = (double) sum / arr.size();
		return average;
	} 

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int array[] = {2, 3, 4, 5};
		for (int i = 0; i < array.length; i++) {
			arr.add(array[i]);
		}
		System.out.println(arr);
		System.out.println("Largest: " + returnLargest(arr));
		System.out.println("Smallest: " + returnSmallest(arr));
		System.out.println("Average: " + returnAverage(arr));
		
	}

}
