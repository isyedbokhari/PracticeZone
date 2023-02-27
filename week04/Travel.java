package week04;

import java.util.Scanner;

public class Travel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a passport?");
		String passport = scan.next();
		System.out.println("What country are you travelling to?");
		String country = scan.next();
		System.out.println("How many bags will you take with yourself?");
		byte bags = scan.nextByte();
		System.out.println("How many poeple will you travel with?");
		short people = scan.nextShort();
		System.out.println("Enter the names of people you'll be travelling with in one line seperated by commas...");
		String names = scan.nextLine();
		names = scan.nextLine();
		
		double cost = 1000;
		double baggageFee = (50 * bags);
		double peopleDiscount = (100 * people);
		if (peopleDiscount > 300) {
			peopleDiscount = 300;
		}
		cost += baggageFee + peopleDiscount;
		
		if (passport.equalsIgnoreCase("yes")) {
			System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + bags + " bags but you are traveling with " + names + " so we are giving a discount. Your total cost is " + cost);
		}
		
		else if (passport.equalsIgnoreCase("no")) {
			double passportRenewal = 200;
			System.out.println("When your passport expired (how many years)?");
			double expiryDate = scan.nextDouble();
			passportRenewal = 200 + expiryDate;
			System.out.println("Will you be travelling next year (Yes or No)?");
			String plan = scan.next();
			
			if (plan.equalsIgnoreCase("yes")) {
				passportRenewal = 200 + expiryDate + 100;
			} else if (plan.equalsIgnoreCase("no")) {
				passportRenewal = 200 + expiryDate - 50;
			}
			double totalCost = cost + passportRenewal;
			System.out.println("Looks like your password has been expired for " + expiryDate + " years, but not to worry we will get it ready for you to travel to " + country + ". Your total cost has come out to " + totalCost);
			
		}
		
		scan.close();
	}

}
