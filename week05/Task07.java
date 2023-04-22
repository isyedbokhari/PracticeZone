package week05;

import java.util.Arrays;

public class Task07 {
		/*
		 * write a program that can move all the zeros to the end of the array 

			Example:
			input:
			array = {10, 0, 5, 0, 1, 0};

			output:
			{10, 5, 1, 0, 0, 0}
		 */
	public static void main(String[] args) {
		
		int[] arr = {10, 0, 5, 0, 1, 0, 40};
	    for (int first = 0; first < arr.length; first++) {
	      if (arr[first] == 0) {
	        for (int second = first+1; second < arr.length; second++) {
	          if (arr[second] != 0) {
	            int temp = arr[first];
	            arr[first] = arr[second];
	            arr[second] = temp;
	            break;
	          }
	        }
	      }
	    }
	    System.out.println(Arrays.toString(arr));
	    
	    
	    // using while loop
	    
	    int arr2[] = {19, 0, 0, 44, 55, 3, 0, 23};
	    
	    int i = 0;
	    int j = 0;
	    
	    while (i < arr2.length) {
	    	if (arr2[i] == 0) {
	    		i++;
	    	} else {
	    		int temp = arr2[i];
	    		arr2[i] = arr2[j];
	    		arr2[j] = temp;
	    		i++;
	    		j++;
	    	}
	    }
	    System.out.println(Arrays.toString(arr2));
	}

}
