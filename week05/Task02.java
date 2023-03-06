package week05;

public class Task02 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int evenCount = 0;
		int oddCount = 0;

		for (int a : nums) {
			if (a % 2 == 0) {
				System.out.println(a + " is an even number!");
				evenCount++;
			} else {
				System.out.println(a + " is an odd number!");
				oddCount++;
			}
		}
		System.out.println("Even Count: " + evenCount);
		System.out.println("Odd Count: " + oddCount);

	}

}
