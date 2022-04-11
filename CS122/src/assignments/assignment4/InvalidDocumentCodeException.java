package assignments.assignment4;

public class InvalidDocumentCodeException extends Exception{
	
	InvalidDocumentCodeException() {
        super("Document is neither unclassified, confidntial, nor proprietary. Try again: ");       
	}
}
