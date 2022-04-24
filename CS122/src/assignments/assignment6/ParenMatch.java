package assignments.assignment6;

//********************************************************************
//ParenMatch.java
//
//Determines whether or not a string of characters contains
//matching left and right parentheses.
//********************************************************************

import java.util.*;
import java.util.Scanner;

public class ParenMatch {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nParenthesis Matching");
		System.out.print("Enter a parenthesized expression: ");
		line = scan.nextLine();
		
		//loop to process the line one character at a time
		int length = line.length();
		for(int i = 0; i < length; i++) {
			char c = line.charAt(i);
			
			if(c == '(')
				s.push(i);
			else if(c == ')') {
				try {
					int num = s.pop()+1;
					System.out.println("'(' at index " + (i+i) + " matched with ')' at index " + num);
				}
				catch(Expression e) {
					System.out.println("'(' at index " + (i+i) + " is unmatched");
				}
			}
		}
		
		//print the results
		while(!s.isEmpty()) {
			System.out.println("'(' at index " + (s.pop()+1) + " is unmatched");
		}
	}
}