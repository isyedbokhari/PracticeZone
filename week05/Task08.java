package week05;

public class Task08 {
		/*
		 * Write a program that can print out the common 
		 * elements from two integer array 

			Example:
			input:
			arr1: {1,2,3,4,5} 
			arr2: {4,5,6,7,8}

			output:
			4 5
		 */
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {4,5,6,7,8};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}
	}

}
