package assignments.assignment4;

public class StringTooLongException extends Exception{
	
	StringTooLongException() {
        super("String has more than 20 characters. Try again: ");       
	}
}
