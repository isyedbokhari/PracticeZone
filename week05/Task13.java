package week05;

public class Task13 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6};
		
		int combined[] = new int [arr1.length + arr2.length];
		
		int index = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			combined[index] = arr1[i];
			index++;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			combined[index] = arr2[i];
			index++;
		}
		
		System.out.println("The combined array is: ");
		for (int i = 0; i < combined.length; i++) {
			System.out.print(combined[i] + " ");
		}
		
	}

}
