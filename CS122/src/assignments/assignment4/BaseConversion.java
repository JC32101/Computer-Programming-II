package assignments.assignment4;

import java.util.Scanner;

public class BaseConversion {
	
	// -----------------------------------------------------------------
	// Recursively converts an integer from base 10 to another base
	// -----------------------------------------------------------------
	
	public static void main (String [] args) {
		int base10Num;
		int base;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.println("Enter an integer: ");
		base10Num = scan.nextInt();
		System.out.print("Enter the base: ");
		base = scan.nextInt();
		
		//Call convert and print the answer
		System.out.println(convert(base10Num, base));
	}
	
	public static String convert(int num, int b) {
		int quotient;  // the quotient when num is divided by base
		int remainder; // the remainder when num is divided by base
		
		quotient = num/b;
		remainder = num%b;
		
		if(quotient == 0) {
			return ("" + remainder);
		}
		else {
			return (convert(quotient, b) + remainder);
		}
	}
}
