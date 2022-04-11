package assignments.assignment4;

import java.util.Scanner;

public class StringTooLongExceptionDriver {
	
	public static void main(String[] args) throws StringTooLongException {
		
		StringTooLongException problem = new StringTooLongException();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter either a string or DONE when finished: ");
		String str = scan.nextLine();
		
		while(!str.equals("DONE")) {
			try {
				if(str.length()>20)
					throw problem;
				System.out.print("Enter either a string or DONE when finished: ");
				str = scan.nextLine();
			}
			catch(StringTooLongException e){
				System.out.println(e.getMessage());
				str = scan.nextLine();
			}
		}
	}
}
