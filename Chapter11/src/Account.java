import java.util.*;
public class Account {
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected Date dateCreated;
	//construct with default value
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		balance =0;
	}
	
	public int getID(){
		return id;
	}
	
	public void setID(int newID) {
		id = newID;
	}
	
	public void setBalance( double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate( double AnnualinterestRate) {
		annualInterestRate = AnnualinterestRate; 
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return balance*annualInterestRate/12;
	}
	
	public void withDraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String getCreatedDate() {
		return dateCreated.toString();
	}
	
	
	

}
