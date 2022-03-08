package assignments.assignment2;

public class Human implements Speaker{

	@Override
	public void speak() {
		System.out.println("Hello!");		
	}

	@Override
	public void announce(String str) {
		System.out.println(str + " is a stunning person.");
	}

}
