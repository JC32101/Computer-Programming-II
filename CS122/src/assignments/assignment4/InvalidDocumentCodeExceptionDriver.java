package assignments.assignment4;

import java.util.Scanner;

public class InvalidDocumentCodeExceptionDriver {
	
	public static void main(String[] args) throws InvalidDocumentCodeException {
		
		InvalidDocumentCodeException problem = new InvalidDocumentCodeException();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the document code or DONE when finished: ");
		String str = scan.nextLine();
		
		while(!str.equals("DONE")) {
			try {
				if(str.charAt(0) != 'U' && str.charAt(0) != 'C' && str.charAt(0) != 'P')
					throw problem;
				System.out.print("Enter the document code or DONE when finished: ");
				str = scan.nextLine();
			}
			catch(InvalidDocumentCodeException e){
				System.out.println(e.getMessage());
				str = scan.nextLine();
			}
		}
	}
}
