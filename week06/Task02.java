package week06;

import java.util.Arrays;

public class Task02 {
		/*
		 * RecplaceAll Task:

		Create a method named replaceAll that passes 
		three parameters: integer array, integer 
		oldElement, integer newElement. 
		The method replaces all the element 
		of the array that matching with the 
		given old element with the given 
		new element, and returns the new array.

		Ex: 
		var arr = {10, 10, 20, 30, 40, 30, 30, 30};

		replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 
		40, 300, 300, 300}
		Create the same functions for double
		 arrays, char arrays, and String arrays
		 */
	public static void main(String[] args) {
		
		int a[] = {10,20,30,30,30};
		System.out.println(Arrays.toString(replaceAllInt(a)));
		
		double b[] = {10.0,20.0,30.0,40.0,30.0,30.0,30.0};
		System.out.println(Arrays.toString(replaceAllDouble(b)));
		
		char c[] = {'a', 'b', 'c', 'c','c','c','c','b','h'};
		System.out.println(Arrays.toString(replaceAllChar(c)));
		
		String d[] = {"Syed", "Ali", "Irfan", "Syed", "Syed", "Syed"};
		System.out.println(Arrays.toString(replaceAllString(d)));
	}
	
	public static int[] replaceAllInt(int[] a) {
		
		int array[] = {10, 10, 20, 30, 40, 30, 30, 30};
		int oldElement = 30;
		int newElement = 300;
		
		
			for (int i = 0; i < array.length; i++) {
				if (array[i] == oldElement) {
					array[i] = newElement;
				}
			}
			
			return array;
		
	}
	
	public static double[] replaceAllDouble(double[] a) {
		
		double array[] = {10.0,20.0,30.0,40.0,30.0,30.0,30.0};
		double oldElement = 30.0;
		double newElement = 300.0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == oldElement) {
				array[i] = newElement;
			}
		}
		
		return array;
		
	}
	
		public static char[] replaceAllChar(char[] a) {
			
			char[] array = {'a', 'b', 'c', 'c','c','c','c','b','h' };
			char oldElement = 'c';
			char newElement = 'x';
			for (int i = 0; i < array.length; i++) {
				
				if (array[i] == oldElement) {
					array[i] = newElement;
				}
			}
			
			return array;
			
		}
	
		public static String[] replaceAllString(String[] a) {
			
			String array[] = {"Syed", "Ali", "Irfan", "Syed", "Syed", "Syed"};
			String oldElement = "Syed";
			String newElement = "Bokhari";
			
			for (int i = 0; i < array.length; i++) {
				
				if (array[i].equalsIgnoreCase(oldElement)) {
					array[i] = array[i].replaceAll(oldElement, newElement);
				}
			} return array;
			
		}
	
	
	
}
