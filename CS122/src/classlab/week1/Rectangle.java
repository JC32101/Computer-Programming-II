package classlab.week1;

public class Rectangle extends Shape{
	public int side1;
	public int side2;
	
	public Rectangle(String name, int s1, int s2) {
		super(name);
		side1 = s1;
		side2 = s2;
	}
	
	public int area() {
		return side1*side2;
	}
}
