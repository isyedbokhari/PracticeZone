package week02;

import java.util.Scanner;
		/*
		Write a Java program to convert seconds to hour, minute 
		and seconds. 
		Go to the editor Sample Output: 
		Input seconds: 86399 
		Result: 23:59:59
		*/
public class Task11 {
// I used ChatGPT to understand the math for minutes and seconds...
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of seconds...");
		int numberOfSeconds = scan.nextInt();
		int hour = numberOfSeconds / 3600;
		int mins = (numberOfSeconds % 3600) / 60;
		int secs = numberOfSeconds % 60;
		System.out.println(hour + ":" + mins + ":" + secs);
		scan.close();
	}

}
