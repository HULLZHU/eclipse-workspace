package Chapter6;
import java.util.*;
public class Listing_6_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input number of primes and primes per line");
		
		int numberOfPrimes = input.nextInt();
		int PrimesPerLine = input.nextInt();
		printPrimeNumber(numberOfPrimes, PrimesPerLine);
		// TODO Auto-generated method stub
	}
	
	public static void printPrimeNumber( int numberOfPrimes, int PrimesPerLine) {
		int count = 0;
		int number = 2;
		
		while ( count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
			if ( count%PrimesPerLine == 0) {
				System.out.printf("%-5s\n", number);
			}
			else
				System.out.printf("%-5s", number);
			}
			number++;
		}
		
		
		}
	
	
	
  public static boolean isPrime(int number) {
	for ( int divisor = 2; divisor <=number/2;divisor++) {
		if ( number % divisor == 0) {
			return false;
		}
	}
	
	  return true;
  }
    }
