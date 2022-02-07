package classlab.week1;

public class Shape {
	public String name;
	
	public Shape(String n) {
		name = n;
	}
	
	public int area() {
		return 0;
	}
	
	public String toString() {
		return "Name: " + name + "	Area: " + area();
	}
}
