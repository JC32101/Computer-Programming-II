package assignments.assignment6;

//********************************************************************
//ParenMatch.java
//
//Determines whether or not a string of characters contains
//matching left and right parentheses.
//********************************************************************
import java.util.Stack;
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
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) == '('){
				s.push(i);
			}
			else if(line.charAt(i) == ')'){
				try{
					System.out.println("'(' at index " + s.pop() + " matched with ')' at index " + i);
				}
				catch(Exception e){
					System.out.println("')' at index " + i + " is unmatched");
				}
			}
		}

		//print the results
		while(!s.isEmpty()) {
			System.out.println("'(' at index " + s.pop() + " is unmatched");
		}
	}
}