package assignments.assignment1;

public class Staff extends Employee{
    public String title;
    
    public Staff(String name, String add, String p, String e,String office, double salary, String date, String t) {
    	super(name, add, p, e, office, salary, date);
    	title = t;
    }
}
