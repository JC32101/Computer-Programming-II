package classlab.week7;

public class DivisonByZero {
	
	public void a() {
		b();
	}
	
	public void b() {
		c();
	}
	
	public void c() {
		
	}
	
	public static void main(String [] args) {
		int x = 1;
		int y = 0;
		int[] a = new int[10];

		try {
			System.out.println("line before errorous line in try");
			System.out.println(a[11]);
			System.out.println(10/a[9]);
			System.out.println("hello");
			System.out.println("line after errorous line in try");

		}
		catch(ArithmeticException e) {
			System.out.println("error message");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("another error message");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("unknown handled error");
			System.out.println(e.getMessage());
		}
		
		System.out.println("line outside try-catch");		
	}

}
