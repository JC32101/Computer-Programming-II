package assignments.assignment1;

public class UniversityDriver {
	public static void main(String [] args) {
		Student stu = new Student("JC", "One Place Plaza", "123-123-1234", "123@pace.edu", "junior");
		System.out.println(stu.toString());
		
		Employee e = new Employee("JC", "One Place Plaza", "123-123-1234", "123@pace.edu", "Seidenberg", 500000.00, "2/8/22");
		System.out.println(e.toString());
		
		Faculty f = new Faculty("JC", "One Place Plaza", "123-123-1234", "123@pace.edu", "Seidenberg", 500000.00, "2/8/22", 48, "senior");
		System.out.println(f.toString());
		
		Staff sta = new Staff("JC", "One Place Plaza", "123-123-1234", "123@pace.edu", "Seidenberg", 500000.00, "2/8/22", "Assistant Prof");
		System.out.println(sta.toString());
	}
}
