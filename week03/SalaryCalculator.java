package week03;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Hourly Rate...");
		int hourlyRate = scan.nextInt();
		System.out.println("Enter Weekly Hours...");
		int weeklyHours = scan.nextInt();
		System.out.println("Enter State Tax Rate...");
		double stateTaxRate = scan.nextInt();
		System.out.println("Enter Federal Tax Rate...");
		double federalTaxRate = scan.nextInt();
		
	    int salaryBeforeTax = hourlyRate * weeklyHours * 52;
	    double sTax =  salaryBeforeTax * (stateTaxRate / 100);
	    double fTax = salaryBeforeTax * (federalTaxRate / 100);
	    double totalTax = sTax + fTax;
	    double salaryAfterTax = salaryBeforeTax - totalTax;
	    
	    System.out.println("Gross pay is: $" + salaryBeforeTax);
	    System.out.println("Federal tax is: $" + fTax);
	    System.out.println("State tax is: $" + sTax);
	    System.out.println("Total tax is: $" + totalTax);
	    System.out.println("Net income is: $" + salaryAfterTax);
	    scan.close();
	}

}
