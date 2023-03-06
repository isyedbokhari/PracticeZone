package week05;

import java.util.Arrays;
import java.util.Random;

public class Task18 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int nums = random.nextInt(101);
		int numsArray[] = new int[nums];
		
		for (int i = 0; i < numsArray.length; i++) {
			numsArray[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(numsArray));
		
		int evenCount = 0;
		int oddCount = 0;
		int divisible3 = 0;
		int divisible5 = 0;
		for (int a : numsArray) {
			  if (a % 2 == 0) {
				evenCount++;
			} if (a % 2 != 0) {
				oddCount++;
			} if (a % 3 == 0) {
				divisible3++;
			} if (a % 5 == 0) {
				divisible5++;
			}
		}
		
		System.out.println("Even Count: " + evenCount);
		System.out.println("Odd Count: " + oddCount);
		System.out.println("Divisible by 3: " + divisible3);
		System.out.println("Divisible by 5: " + divisible5);

	}

}
