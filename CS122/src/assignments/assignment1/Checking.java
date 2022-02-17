package assignments.assignment1;

public class Checking extends Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Checking() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	public Checking(int id, double b) {
		super(id, b);
	}
	
	public void setID(int id) {
		this.id = id;
	}
	public void setBalance(double b) {
		balance = b;
	}
	public void setAnnualInterestRate(double a) {
		annualInterestRate = a;
	}
	
	public int getID() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void deposit(int value) {
		balance += value;
	}
	
	public void withdraw(int value) {
		balance -= value;
	}
}
