import java.util.*;
public class TestLoan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter loan amount");
		double loanAmount = input.nextDouble();
		System.out.println("Please enter loan annually Interest Rate");
		double annualInterestRate = input.nextDouble();
		System.out.println("Please enter number of years.");
		double numberOfYear = input.nextDouble();
		Loan myLoan = new Loan( annualInterestRate, numberOfYear,  loanAmount);
		System.out.println("Monthly Payment: "+myLoan.getMonthlyPayment());
		System.out.println("Annually Payemnt: " + myLoan.getTotalPayment());
		System.out.println("Created Date: " + myLoan.getLoanDate());
		

	}

}
