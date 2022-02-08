package assignments.assignment1;

public class Faculty extends Employee{
    public int hours;
    public String rank;
    
    public Faculty(String name, String add, String p, String e,String office, double salary, String date, int hr, String r) {
    	super(name, add, p, e, office, salary, date);
    	hours = hr;
    	rank = r;
    }
}
