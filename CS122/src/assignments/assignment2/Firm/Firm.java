package assignments.assignment2.Firm;//********************************************************************
//  Firm.java       Author: Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm{
	
	interface Payable{
	}
	// -----------------------------------------------------------------
	// Creates a staff of employees for a firm and pays them.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Staff personnel = new Staff();

		personnel.payday();
	}
}
