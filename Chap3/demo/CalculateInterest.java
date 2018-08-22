package demo;

import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {
		
		System.out.print("Enter the balance and annual percentage interest rate");
		
		Scanner input= new Scanner(System.in);
		
		double balance=input.nextDouble();
		
		double interestRate=input.nextDouble();
		
		double interest=balance*interestRate/1200.0;
		
		System.out.println("The interest amount is"+ interest);
				
		// TODO Auto-generated method stub

	}

}
