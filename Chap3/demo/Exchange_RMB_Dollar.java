package demo;

import java.util.Scanner;

public class Exchange_RMB_Dollar {

	public static void main(String[] args) {
		
		System.out.println(" Input the exchange rate of RMB ");
		
		Scanner input = new Scanner(System.in);
		
		double ex_rate = input.nextDouble();
		
		System.out.println(" Please input the dollar amount");
		
		double dollar_amount = input.nextDouble();
		
		double RMB_amount = dollar_amount * ex_rate ; 
		
		System.out.println("The amount of money in RMB is "+ RMB_amount);
		
		
		

	}

}
