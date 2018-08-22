package Chapter6;
import java.util.*;
public class PE_06_07 {
	public static void main(String[] args) {
		System.out.println("Please input the amount invested and annual interest rate.");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		double interestRate = input.nextDouble();
        System.out.println("How many years do you want to invest");
        int year = input.nextInt();
		printTitle(amount,interestRate);
		printBody ( amount, interestRate, year);
		// TODO Auto-generated method stub

	}
	
	public static void printTitle( double amount, double interestRate) {
		System.out.println("The amount invested :"+ amount);
		System.out.println("Annual interest rate: " + interestRate);
		System.out.println(" Year          Future Value");
	}
	
	public static void printBody( double amount, double interestRate, int year) {
		int count = 1;
		while ( count <= year ) {
			System.out.print(count + "           ");
			System.out.printf("%.2f\n",amount*Math.pow(1+interestRate/100, count));
			count ++;
		}
	}

}
