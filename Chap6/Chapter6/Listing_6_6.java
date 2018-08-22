package Chapter6;
import java.util.*;
public class Listing_6_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter first integr");
		int n1 = input.nextInt();
		System.out.println("Enter second integer");
		int n2 = input.nextInt();
		
		System.out.println("The greatest common divisor for "+n1 + " and "+ n2 +" is "+gcd(n1,n2) );
		// TODO Auto-generated method stub
	}
	public static int gcd( int n1, int n2 ) {
		int gcd = 1;
		int k = 2;
		
		while ( k <= n1 && k <= n2 ) {
			if ( n1 % k == 0 && n2%k == 0)
				gcd = k;
			k++;
		}
		return gcd;
	}

}
