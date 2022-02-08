package assignments.assignment1;

public class Employee extends Person{
    public String office;
    public double salary;
    public String date;
    
    public Employee(String name, String add, String p, String e, String o, double s, String d) {
    	super(name, add, p, e);
    	office = o;
    	salary = s;
    	date = d;
    }
}