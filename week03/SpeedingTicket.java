package week03;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name...");
		String firstName = scan.nextLine();
		System.out.println("Enter last name...");
		String lastName = scan.nextLine();
		System.out.println("Enter age...");
		int age = scan.nextInt();
		System.out.println("Enter speed linit...");
		int limit = scan.nextInt();
		System.out.println("Enter actual speed...");
		int speed = scan.nextInt();
		System.out.println("Is this a construction zone (Y/N)...");
		char zone = scan.next().charAt(0);
		boolean isConstructionZone = zone == 'Y';
		int excessSpeed = speed - limit;
		int fine = 0;
		
		if (speed < limit + 5) {
			fine = 0;
		} else if (excessSpeed <= 20 && !isConstructionZone) {
			fine = (excessSpeed + 4) / 5 * 30;
		} else if (excessSpeed <= 20 && isConstructionZone) {
			fine = (excessSpeed + 4) / 5 * 60;
		} else if (excessSpeed > 20 && !isConstructionZone) {
			fine = (excessSpeed + 4) / 5 * 50;
		} else if (excessSpeed > 20 && isConstructionZone) {
			fine = (excessSpeed + 4) / 5 * 100;
		} 
		if (age < 21 && excessSpeed > 20) {
				fine += 300; 
			}
	    scan.close();
			
	    System.out.println("=======REPORT=======");
	    System.out.println("Driver Name: " + firstName + " " + lastName);
	    System.out.println("Age: " + age + " years old");
	    System.out.println("Speed Limit: " + limit + "mph");
	    System.out.println("Current Speed: " + speed + "mph");
	    System.out.println("Construction Zone: " + isConstructionZone);
	    System.out.println("Your fine is: " + "$" + fine);
	    System.out.println("=======END=======");
			
	}
}
