package week05;

import java.util.Arrays;

public class Task01 {

	public static void main(String[] args) {
		
		int [] num = new int [100];
		for (int i = 0 ; i < 100; i++) {
			num [i] = 100 - i;
		}
		System.out.println(Arrays.toString(num));
	}

}
