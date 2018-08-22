package Chapter6;
import java.util.*;
public class Listing_6_7_selfpractice {
	
	public static void main(String[] args) {
		System.out.println("Please input an integer to determine the number of prime numbers output and the number of primes"
				+ " per line");
		Scanner input = new Scanner(System.in);
		int NumberOfPrime = input.nextInt();
		int NumberOfPrimePerLine = input.nextInt();
		System.out.println("The first " + NumberOfPrime+" prime numbers are ") ;
		PrintPrimeNumber(NumberOfPrime, NumberOfPrimePerLine);
	}
	
	public static void PrintPrimeNumber(int NumberOfPrime, int NumberOfPrimePerLine) {
		int countOfPrime = 0;
		int num = 2;
		
		while (countOfPrime < NumberOfPrime ) {
			if (isPrime(num)) {
				countOfPrime ++ ;
				if ( countOfPrime%NumberOfPrimePerLine == 0 ) {
					System.out.printf("%-5s\n",num);
				}
				else {
					System.out.printf("%-5s", num);
				}
			}
			num ++;
		}
	}
		

	
	public static boolean isPrime( int number) {
		for ( int divisor = 2; divisor <=number/2;divisor++) {
			if ( number % divisor == 0) {
				return false;
			}
		}
		return true;
		
		

}
}
