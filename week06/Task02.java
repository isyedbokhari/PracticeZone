package week06;

import java.util.Arrays;

public class Task02 {

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
