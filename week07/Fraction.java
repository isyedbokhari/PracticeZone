package week07;

public class Fraction {
	private double numerator;
	private double denominator;
	
	public Fraction() {
		
	}
	
	public Fraction(double numerator, double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double getnumerator() {
		return numerator;
	}
	
	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}
	
	public double getDenominator() {
		return denominator;
	}
	
	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	
	public double addNumerator(double numerator) {
		double result = this.numerator + numerator;
		return result;
	}
	
	public double addDenominator(double denominator) {
		double result = this.denominator + denominator;
		return result;
	}
	
	public double multiplyNumerator(double numerator) {
		double result = this.numerator * numerator;
		return result;
	}
	
	public double multiplyDenominator(double denominator) {
		double result = this.denominator * denominator;
		return result;
	}
	
	
	
}
