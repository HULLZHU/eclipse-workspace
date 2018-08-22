import java.util.*;
public class PE_5_21_FinanceComprehensive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input loan amount and number of years");
		int loanAmount = input.nextInt();
		double timePeriod = input.nextDouble();
		double InterestRate=0.05;
		double InterestRateInPercentage = InterestRate * 100;//**
		double monthlyInterestRate= InterestRate / 12;
		double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-1/(Math.pow(1+monthlyInterestRate, timePeriod*12)));
		double totalPayment = 12 * timePeriod * monthlyPayment;
		System.out.println("  Loan Amount :" + loanAmount);
		System.out.println(" Number of Years: " + (int)timePeriod );
		System.out.println(" Interest Rate        Monthly Payment         Total Payment");
		
		while (InterestRate<= 0.08)
		{
			System.out.printf("     %.3f", InterestRateInPercentage);
			System.out.print("%");
			System.out.printf("               %.2f                  %.2f", monthlyPayment, totalPayment);
			System.out.println("");
		    InterestRate =InterestRate+(0.125/100);
		    monthlyInterestRate= InterestRate / 12;
		    monthlyPayment = (loanAmount*monthlyInterestRate)/(1-1/(Math.pow(1+monthlyInterestRate, timePeriod*12)));
		    InterestRateInPercentage = InterestRate * 100;
		    totalPayment = 12 * timePeriod * monthlyPayment;
		}
		
		// TODO Auto-generated method stub

	}

}
