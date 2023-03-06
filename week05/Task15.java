package week05;

public class Task15 {

	public static void main(String[] args) {

		int array[][] = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13 } };
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = array[i].length - 1; j >= 0; j--) {
				System.out.print(array[i][j] + " ");
			}
		}

	}

}
