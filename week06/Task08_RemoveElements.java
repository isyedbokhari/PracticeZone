package week06;

import java.util.Arrays;
		/*
		 * Create a class named RemoveElements:

		Create a method that passes two 
		parametetrs: an integer array 
		and an integer index. the method 
		removes the element at the given
		 index of the array and returns the new array

		Ex: int[]
		arr = {10,20,30,40} removeElement(arr, 2) ==> 
		{10, 20, 40}
		
		Create a method that passes 
		two parametetrs: a double array and an
		 integer index. the method removes 
		 the element at the given index of 
		 the array and returns the new array

		Create a method that passes two 
		parametetrs: a char array and an 
		integer index. the method removes
		 the element at the given index of 
		 the array and returns the new array

		Create a method that passes two parametetrs:
		 a String array and an integer index. 
		 the method removes the element at the 
		 given index of the array and returns 
		 the new array
		 */
public class Task08_RemoveElements {

	public static int[] removeInt(int arr[], int n) {
		
		if (n < 0 || n > arr.length) {
			System.out.println("Index is out of bounds!");
		}
		int newArr[] = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i != n) {
			    newArr[j++] = arr[i];
					
				}
		}return newArr;
	
	}
	
	public static double[] removeDouble(double arr[], int n) {
		if (n < 0 || n > arr.length) {
			System.out.println("Index is out of bounds!");
		}
		double newArr[] = new double[arr.length - 1];
		for (int i = 0 , j = 0; i < arr.length; i++) {
			if (i != n) {
				newArr[j++] = arr[i];
			}
		} return newArr;
	}
	
	public static char[] removeChar(char arr[], int n) {
		if (n < 0 || n > arr.length) {
			System.out.println("Index is out of bounds!");
		}
		char newArr[] = new char[arr.length - 1];
		for (int i = 0 , j = 0; i < arr.length; i++) {
			if (i != n) {
				newArr[j++] = arr[i];
			}
		}return newArr;
	}
	
	public static String[] removeString(String arr[], int n) {
		if (n < 0 || n > arr.length) {
			System.out.println("Index is out of bounds!");
		}
		
		String newArr[] = new String[arr.length - 1];
		for (int i = 0 , j = 0; i < arr.length; i++) {
			if (i != n) {
				newArr[j++] = arr[i];
			}
		}return newArr;
	}
	public static void main(String[] args) {
		
		
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(removeInt(arr, 3)));
		double arr2[] = {10.0, 20.0, 30.0, 40.0, 50.0};
		System.out.println(Arrays.toString(removeDouble(arr2, 3)));
		char arr3[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		System.out.println(Arrays.toString(removeChar(arr3, 3)));
		String arr4[] = {"Syed", "Irfan", "Shafkat", "Lil Uzi", "John Summit"};
		System.out.println(Arrays.toString(removeString(arr4, 3)));
	}

}
