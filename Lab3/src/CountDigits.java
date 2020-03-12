/*
 * William Floyd Jones 
 * jan 30th 2020
 * Lab 3 Question 2
 * CSC 1302
 */
import java.util.*;
public class CountDigits {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int number = console.nextInt();
		System.out.print("There are "+ countDigits(number) + " digits in the number of " + number + ".");
	}
	//Counts the digits in the given number 
	public static int countDigits(int number ) {
		int digit = 0;
		if (number > 0 && number < 9) {
			digit = 1;
		}
		else {
			while ( number != 0) {
	
			number /= 10;
			digit++;
			}
		}
		return digit; 
	}
}
