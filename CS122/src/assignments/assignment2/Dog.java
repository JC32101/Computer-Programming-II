package assignments.assignment2;

public class Dog implements Speaker{

	@Override
	public void speak() {
		System.out.println("Woof!");
	}

	@Override
	public void announce(String str) {
		System.out.println(str + " is a good dog.");
	}

}
