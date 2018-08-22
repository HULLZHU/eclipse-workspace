package demo;

import java.util.Scanner;

import java.math.*;

public class ComputeLoan {

	public static void main(String[] args) {
		
		
		//提示用户输入贷款金额，年利率和贷款期限（年表示）
		System.out.println("Please input your amount of loan, the annual interest rate and the number of year");
		
		Scanner input = new Scanner(System.in);
		
		double loanAmount=input.nextDouble();
		
		double annualInterestRate=input.nextDouble();
		
		double loanTerm = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate/12 ;
		
		double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/(Math.pow((1+monthlyInterestRate),12))));
		
		double totalPayment = monthlyPayment*loanTerm*12 ; 
		
        System.out.println("The loan amount is"+loanAmount+",and the monthly payment of this amount of loan is "
        		+ monthlyPayment + " and the total payment is" + totalPayment );				

	}

}
