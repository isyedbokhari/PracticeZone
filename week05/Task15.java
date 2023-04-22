package week05;

public class Task15 {
		/*
		 * Write a program that can reverse a two 
		 * dimensional array (return new array)

		Example:

		input:
		array = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};

		output:
		reverse = {{13,12,11,10,9,8}, {7,6,5,4}, {3,2,1},};
		 */
	public static void main(String[] args) {

		int array[][] = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13 } };
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = array[i].length - 1; j >= 0; j--) {
				System.out.print(array[i][j] + " ");
			}
		}

	}

}
