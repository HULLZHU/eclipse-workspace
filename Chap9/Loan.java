import java.util.*;
public class Loan {
	//data fields
	private double annualInterestRate;
	private double numberOfYear;
	private double loanAmount;
	private Date loanDate = new Date();
	//construct
	public Loan(){
		
	};
	
	public Loan ( double annualInterestRate,double numberOfYear, double loanAmount){
		this.annualInterestRate = annualInterestRate;
		this.numberOfYear = numberOfYear;
		this.loanAmount = loanAmount;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public double getLoanAmount() {
		return this.loanAmount;
	}
	
	public Date getLoanDate() {
		return loanDate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate/12;
		double monthlyPayment = loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYear*12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		return this.getMonthlyPayment()*12*this.numberOfYear;
	}
	

}
