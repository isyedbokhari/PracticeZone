package week05;

public class Task20 {

	public static void main(String[] args) {
		
		int input[] = {1,2,3,4,5,6,7};
		int evenCount = 0;
		int oddCount = 0;
		for (int a : input) {
			if (a % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of Even Integers in the Given Array: " + evenCount);
		System.out.println("Number of Odd Integers in the Given Array: " + oddCount);
		
	}

}
