package week05;

import java.util.Arrays;

public class Task10 {
		/*
		 * Write a program that can merge 3 arrays of integers 

			Example:
			Input:
			arr1 = {30, 10, 20}; 
			arr2 = {15, 40, 25, 35}; 
			arr3 = {8, 9, 17, 5, 4, 1} 

			Output:
			{30,10,20,15,40,25,35,8,9,17,5,4,1}
		 */
	public static void main(String[] args) {
		
		int arr1[] = {30, 10, 20}; 
		int arr2[] = {15, 40, 25, 35}; 
		int arr3[] = {8, 9, 17, 5, 4, 1};
		
		
		int combined[] = new int[arr1.length + arr2.length + arr3.length];
		
		int index = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			combined[index] = arr1[i];
			index++;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			combined[index] = arr2[i];
			index++;
		}
		
		for (int i = 0; i < arr3.length; i++) {
			combined[index] = arr3[i];
			index++;
		}
		
		System.out.println("The combined array is: ");
		for (int i = 0; i < combined.length; i++) {
			System.out.print(combined[i] + " ");
		}
		
	}

}
