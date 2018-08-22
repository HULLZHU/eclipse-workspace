import java.util.*;
public class PE_08_12Self {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter status.");
		int status = input.nextInt();
		System.out.println("Enter income.");
		double income = input.nextDouble();
		if ( status >=0 && status <= 3) {
			System.out.println("The tax amount is: "+computeTax( status, income));
		}
		else 
			System.out.println("Invalid Input ." );
		// TODO Auto-generated method stub

	}

	private static double computeTax(int status, double income) {
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		int[][] brackets = {
				  {8350, 33950, 82250, 171550, 372950},   // Single filer
				  {16700, 67900, 137050, 20885, 372950}, // Married jointly
				  {8350, 33950, 68525, 104425, 186475}, // Married separately
				  {11950, 45500, 117450, 190200, 372950} // Head of household
				};
		double tax = 0;
		if ( income < brackets[status][0]) {
			return tax = income* rates[0];
		}
		else
			tax = rates[0]*brackets[status][0];
		for ( int i = 1 ; i < brackets[status].length; i++) {
			if ( income < brackets[status][i]) {
				tax = tax + (income - brackets[status][i-1])*rates[i];
				return tax;
			}
			else if( income >= brackets[status][i]){
				tax = tax + (brackets[status][i]-brackets[status][i-1])*rates[i];
			}
				
		}
		return  tax += (income - brackets[status][4]) * rates[5];
	}

}
