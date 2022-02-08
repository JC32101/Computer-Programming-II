package assignments.assignment1;

public class Person {
    public String name;
    public String address;
    public String phone;
    public String email;
    
    public Person(String n, String a, String p, String e) {
    	name = n;
    	address = a;
    	phone = p;
    	email = e;
    }
    
    public String toString() {
    	return "Class Name: " + getClass() + "\nName: " + name;
    }
}
