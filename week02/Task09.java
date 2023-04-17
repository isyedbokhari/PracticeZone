package week02;

public class Task09 {
		/*
		    Create a calculator that can calculate basic
		     operators like addition, subtraction,  
		     multiplication and division.  
			Input: 
			a = 3, b = 4, operator = addition 
			Output = 7; 
			Input: 
			a = 3, b = 4, operator = multiplication 
			Output = 12; 
		*/
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		int addition = a + b;
		int subtraction = a - b;
		int multiplication = a * b;
		int division = a / b;
		
		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
		
	}

}
