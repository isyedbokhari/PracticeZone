package week04;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Split or No Split?");
		String split = scan.nextLine();
		System.out.println("Enter the number of poeple...");
		int num = scan.nextInt();
		System.out.println("Enter the check amount...");
		double amount = scan.nextDouble();
		System.out.println("How was the service quality?");
		String quality = scan.next();
		
		
		
		double perPerson = amount / num;
		double tip = 0;
		double tipPerPerson = 0;
		
		if (split.equalsIgnoreCase("yes") && quality.equalsIgnoreCase("poor")) {
			tip = (amount * 0.05) / num ;
		    tipPerPerson = tip / num;
		} else if (split.equalsIgnoreCase("yes") && quality.equalsIgnoreCase("fair")) {
			tip = (amount * 0.10) / num;
			tipPerPerson = tip / num;
		} else if (split.equalsIgnoreCase("yes") && quality.equalsIgnoreCase("good")) {
			tip = (amount * 0.15) / num;
			tipPerPerson = tip / num;
		} else if (split.equalsIgnoreCase("yes") && quality.equalsIgnoreCase("great")) {
			tip = (amount * 0.20) / num;
			tipPerPerson = tip / num;
		} else if (split.equalsIgnoreCase("yes") && quality.equalsIgnoreCase("excellent")) {
			tip = (amount * 0.25) / num;
			tipPerPerson = tip / num;
		} else if (split.equalsIgnoreCase("no") && quality.equalsIgnoreCase("poor")) {
			tip = amount * 0.05;
			tipPerPerson = tip;
		} else if (split.equalsIgnoreCase("no") && quality.equalsIgnoreCase("fair")) {
			tip = amount * 0.10;
			tipPerPerson = tip;
		} else if (split.equalsIgnoreCase("no") && quality.equalsIgnoreCase("good")) {
			tip = amount * 0.15;
			tipPerPerson = tip;
		} else if (split.equalsIgnoreCase("no") && quality.equalsIgnoreCase("great")) {
			tip = amount * 0.20;
			tipPerPerson = tip;
		} else if (split.equalsIgnoreCase("no") && quality.equalsIgnoreCase("excellent")) {
			tip = amount * 0.25;
			tipPerPerson = tip;
		}
		
		System.out.println("Number of poeple entered: " + num); 
		System.out.println("Total to pay: " + amount); 
		System.out.println("Total tip: " + tip );
		System.out.println("Total per person: " + perPerson );
		System.out.println("Tip per person: " + tipPerPerson);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
