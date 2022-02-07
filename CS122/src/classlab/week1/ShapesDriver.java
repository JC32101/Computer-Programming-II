package classlab.week1;

public class ShapesDriver {
	public static void main(String [] args) {
		Shape s = new Shape("Shape");
		Rectangle r = new Rectangle("Rectanle", 3, 6);
		Square sq = new Square("Square", 4);
		
		System.out.println(s);
		System.out.println(r);
		System.out.println(sq);
	}
}
