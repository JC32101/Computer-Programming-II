package classSamples.exceptions.Zero;
//********************************************************************
//  Zero.java       Author: Lewis/Loftus
//
//  Demonstrates an uncaught exception.
//********************************************************************

import java.io.FileNotFoundException;

public class Zero {
	// -----------------------------------------------------------------
	// Deliberately divides by zero to produce an exception.
	// -----------------------------------------------------------------
	public static void main(String[] args) throws FileNotFoundException{
		int numerator = 10;
		int denominator = 0;

		System.out.println(numerator / denominator);

		System.out.println("This text will not be printed.");
	}
}
