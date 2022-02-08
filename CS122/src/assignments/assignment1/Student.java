package assignments.assignment1;

public class Student extends Person{
//    final String status = "";
	public String status;
    
    public Student(String name, String add, String p, String e, String s) {
    	super(name, add, p, e);
    	status = s;
    }
}
