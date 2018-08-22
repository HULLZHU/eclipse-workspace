import java.util.*;
public class PE_08_12 {

	public static void main(String[] args) {
		double[] rates = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets = {
				{0,8350, 33950, 82250, 171550, 372950},//single filer
				{0,16700, 67900, 137050, 20885, 372950},//married jointly or qualifying widower
				{0,8350, 33950, 68525,104425, 186475},//married separately
				{0,11950, 45500, 117450, 190200, 372950}//head of house hold
		};
		Scanner input = new Scanner(System.in);
		System.out.println("In which status you are ?");
		int status = input.nextInt();
		if ( status >3) {
			System.out.println("please enter a valid result.");
			System.exit(0);
		}
		System.out.println("Please enter the income amount.");
		int income = input.nextInt();
		int taxingLevel = 0;
		while ( income > brackets[status][taxingLevel]) {
			taxingLevel ++ ;
			if ( taxingLevel > 5)
				break;
		}
		taxingLevel -=1;
		System.out.println("The taxingLevel is : " + taxingLevel);
		int tax = 0;
		for ( int i = 1; i <= taxingLevel; i++ ) {
			tax += (brackets[status][i]-brackets[status][i-1])*rates[i-1];
		}
		tax += (income - brackets[status][taxingLevel])*rates[taxingLevel];
		System.out.println(tax);
		
		
	}

}
