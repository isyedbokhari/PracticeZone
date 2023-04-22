package week05;

import java.util.Scanner;

public class Task09 {
		/*
		 * AverageNumber:
    1. Ask the user how many numbers user want to enter 
    2. get all the inputs from the user and store them into an array 
    3. Iterate the array & return the average number

*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you wanna enter bro...");
		System.out.println("Come onnnn be quick I gotta be at John Summit's show!!!");
		int numElements = scan.nextInt();
		
		int newArray[] = new int [numElements];
		for (int i = 0; i < newArray.length; i++) {
			System.out.println("Alright gotcha, enter number " + (i+1) + ":");
			newArray[i] = scan.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < newArray.length; i++) {
			sum += newArray[i];
		}
		double average = sum / numElements;
		
		System.out.println("The numbers are: ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		
		System.out.println();
		System.out.println("And their average is: " + average);
		
		scan.close();
	}

}
