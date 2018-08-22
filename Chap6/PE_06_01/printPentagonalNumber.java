package PE_06_01;

public class printPentagonalNumber {
	public static void printPentagonalNumber( int numberOfPentagonal , int numberOfPentagonalPerline ) {
		int num = 1;
		while ( num <= numberOfPentagonal ) {
			if (num%numberOfPentagonalPerline == 0 ) {
				System.out.println("   "+PentagonalNumber.PentagonalNumber(num));
			}
			else 
				System.out.print("   "+ PentagonalNumber.PentagonalNumber(num));
			num ++;
		}
	}
	
	

}
