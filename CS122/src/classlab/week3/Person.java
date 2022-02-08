package classlab.week3;

public abstract class Person {
	public String name;
	private int age;
	protected String city;
	
	public Person(String n, int a, String c) {
		name = n;
		age = a;
		city = c;
	}
	
	public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
	
	public abstract String printName();
	protected abstract int printAge();
//	public static printObjValue();
	
}
