package demo;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {

	public static void main(String[] args) {
		
		System.out.println("Please enter the investment amount, annual interest rate and number of years");
		
		Scanner input= new Scanner(System.in);
		
		double investmentAmount=input.nextDouble();
		
		double annualInterestRate=input.nextDouble();
		
		double numberofYears=input.nextDouble();
		
		double monthlyInterestRate=annualInterestRate/12.0;
		
		double futureValue=investmentAmount*( Math.pow(1+monthlyInterestRate,12*numberofYears) );
		
		System.out.print("The future value of investment is"+futureValue);
		// TODO Auto-generated method stub
		

	}

}
