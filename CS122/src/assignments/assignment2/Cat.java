package assignments.assignment2;

public class Cat implements Speaker{

	@Override
	public void speak() {
		System.out.println("Meow!");
	}

	@Override
	public void announce(String str) {
		System.out.println(str + " is a sassy cat.");		
	}

}
