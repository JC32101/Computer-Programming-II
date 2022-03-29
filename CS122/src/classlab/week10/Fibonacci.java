package classlab.week10;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		System.out.println(fib(num));
		System.out.println(isPalindrome("abcba"));
	}
	
	public static int fib(int num) {		
		if(num == 0 || num == 1) {
			return num;
		}
		else {
			return num + fib(num-1);
		}
	}
	
	public static boolean isPalindrome(String s) {
	      if (s.length() <= 1) // Base case
	        return true;
	      else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
	        return false;
	      else
	        return isPalindrome(s.substring(1, s.length() - 1));   
	    }
}
