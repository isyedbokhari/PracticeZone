package week03;

import java.util.Scanner;

public class NetSalary {

	public static void main(String[] args) {
//		35% for salary of 130K or more
//			30% for salary of 100K to 130k (excluded)
//			25% for salary of 80K to 100K (excluded)
//			20% for salary less than 80K
//        in addition, if the person is married, he/she will pay 5% less tax
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your salary...");
		double salary = scan.nextDouble();
		System.out.println("Are your married?");
		boolean married = scan.nextBoolean();
		double tax;
		
		if (salary >= 130000) {
			tax = salary * 0.35;
		} else if (salary >= 100000 && salary < 130000) {
			tax = salary * 0.3;
		} else if (salary >= 80000 && salary < 100000) {
			tax = salary * 0.25;
		} else {
			tax = salary * 0.2;
		}
		
		if (married) {
			tax = tax * 0.95;
		}
		int netSalary = (int) (salary - tax);
		System.out.println("Your net salary is: $" + netSalary);
		
		scan.close();
	}

}
