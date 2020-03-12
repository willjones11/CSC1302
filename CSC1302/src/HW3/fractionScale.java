/*
 *William Floyd Jones 
 *2/21/20
 *HW3 Program 2 Part 1
 *This program takes a user inputed fraction and scale factor to give the user the final product
 * 
 */
 package HW3;
 
import java.util.*;
public class fractionScale {
	public static void main(String[] args) {
		System.out.println("This program performs the scaling operations on the fraction.");
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a Fraction: ");
		String frac = console.nextLine();
		Scanner console1 = new Scanner(frac).useDelimiter("/");
		int n = console1.nextInt();
		int d = console1.nextInt();
		Fraction f = new Fraction(n,d);
		System.out.print("Scale up or down? Enter 1 for up and 0 for down: ");
		int scale = console.nextInt();
		Boolean bool = true;
		if(scale == 0) {
			bool = false;
		}
		System.out.print("Enter a Scale Factor: ");
		int factor = console.nextInt();
		f.scale(factor,bool);
		System.out.println("Scaled Fraction is " + f.getNumerator() + "/" + f.getDenominator());
		
	}
}	


