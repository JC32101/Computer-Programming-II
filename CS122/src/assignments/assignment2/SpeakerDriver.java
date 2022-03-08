package assignments.assignment2;

import java.util.Scanner;

public class SpeakerDriver {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a dog name: ");
		String dogName = scan.nextLine();
		
		System.out.println("Enter a cat name: ");
		String catName = scan.nextLine();

		System.out.println("Enter your name: ");
		String yourName = scan.nextLine();

		Speaker s;
		s = new Dog();
		s.speak();
		s.announce(dogName);
		
		s = new Cat();
		s.speak();
		s.announce(catName);
		
		s = new Human();
		s.speak();
		s.announce(yourName);
	}
}
