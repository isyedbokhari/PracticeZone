package week01;

public class Task07 {

	public static void main(String[] args) {
		// Write a program to swap two numbers without using a temporary variable.
		
		int x= 10;
		int y = 20;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println();
		
		x = x + y; // 30
		y = x - y; // 10
		x = x - y; // 20
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
