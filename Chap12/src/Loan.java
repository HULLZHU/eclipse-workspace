import java.util.Date;

public class Loan {
	private double annualInterestRate;
	private double numberOfYears;
	private double loanAmount;
	private Date loanDate = new Date();
	
	public Loan(double newIR, double newYearNumber, double newAmount) {
		setAnnualInterestRate(newIR);
		setNumberOfYears(newYearNumber);	
		setLoanAmount(newAmount);
		}
	
	public Loan() {
		this(0.06,5,10000);
	}

	public void setLoanAmount(double newAmount) {
		if (newAmount < 0)
			throw new IllegalArgumentException("The loan amount should be >= 0");
		loanAmount = newAmount;
	}

	public void setNumberOfYears(double newYearNumber) {
		if (newYearNumber<=0) 
			throw new IllegalArgumentException("The number of Year should be > 0");
		numberOfYears = newYearNumber;
		
	}

	public void setAnnualInterestRate(double newIR) {
		if ( newIR < 0)
			throw new IllegalArgumentException("The annual InterestRate should be >= 0");
		annualInterestRate = newIR;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public double getNumberOfYears() {
		return numberOfYears;
	}
	public String getDateCreated() {
		return loanDate.toString();
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double getAnnuallyInterestAmount() {
		return loanAmount*annualInterestRate;
	}
	public double getMonthlyInterestAmount() {
		return this.getAnnuallyInterestAmount()/12;
	}
	public double getTotalInterestAmount() {
		return this.getAnnuallyInterestAmount()*numberOfYears;
	}
	
	public static void main(String args[]) {
		Loan demo = new Loan(0.06,3,10000);
		System.out.println("Total IR amount: " + demo.getTotalInterestAmount());
	}
}
