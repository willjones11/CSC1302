package HW3;
/*
 * William Floyd Jones
 * 2/21/20
 * HW3 Program 2 Part 2
 * this class is the work horse for the main class in which it finds the product of the scale factor and original fraction
 */
public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	public Fraction() {
		numerator = 0;
		denominator = 1;
		
	}
	public Fraction(int n) {
		numerator = n;
		denominator = 1;
		
	}
	public Fraction divide(Fraction f) {
		Fraction n = new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
		return n;
	}
	public void scaleup(int n) {
		this.numerator = this.numerator * n;
		
	}
	public void scaledown(int n) {
		this.denominator = this.denominator * n;
	}
	public void scale(int factor, boolean flag ) {
		if (factor == 0 ) {
			System.out.println("Factor can not be 0");
		}
		else {
			if(flag == true) {
				this.scaleup(factor);	
			}
			else {
				this.scaledown(factor);
			}
		}
		
	}
	public int getDenominator() {
		return denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	
	public Fraction add(Fraction f) {
		int num = numerator * f.denominator + f.numerator * denominator;
		int denom = denominator * f.denominator;
		return new Fraction(num, denom);		
	}
}
