import java.util.*;
public class PE_5_30 {

	public static void main(String[] args) {
		System.out.println(" Please input an amount, the annual interest rate and the number of month");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		double annualIR = input.nextDouble();
		double numberOfMonth = input.nextDouble();
		
		
		double monthIR = (annualIR / 12) ;
		int count = 0;
		double sum = 0;
		while ( count < numberOfMonth) {
			sum = (amount + sum )*(1+monthIR/100);
			count++;
			System.out.println(sum);
		}
	
		
		
		// TODO Auto-generated method stub

	}

}
