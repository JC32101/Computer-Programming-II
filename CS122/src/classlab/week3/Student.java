package classlab.week3;

public class Student extends Person{
	public String major;

	public Student(String name, int age, String city, String m) {
		super(name, age, city);
		major = m;
	}
	
	public String printName() {
		return super.name;
	}
	protected int printAge() {
		return super.getAge();
	}
}
