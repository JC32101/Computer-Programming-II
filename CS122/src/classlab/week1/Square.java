package classlab.week1;

public class Square extends Shape {
	private int side;
	
	public Square(String name, int s) {
		super(name);
		side = s;
	}
	
	public int area() {
		return side*side;
	}
}
