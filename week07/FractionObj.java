package week07;

public class FractionObj {

	public static void main(String[] args) {
		Fraction first = new Fraction(1, 2);
		Fraction second = new Fraction(3, 4);
		double addNumerator = second.addNumerator(1);
		double addDenominator = first.addDenominator(4);
		double multiplyNumerator = second.multiplyNumerator(1);
		double multiplyDenominator = first.multiplyDenominator(4);
		
		System.out.println("Addition: " + addNumerator + "/" + addDenominator);
		System.out.println("Multiplication: " + multiplyNumerator + "/" + multiplyDenominator);
	}

}
