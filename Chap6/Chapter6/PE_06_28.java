package Chapter6;
import java.util.*;
public class PE_06_28 {

	public static void main(String[] args) {
		System.out.println("How many Mersenne prime do you want?");
		Scanner input = new Scanner(System.in);
		int numOfMersennePrime = input.nextInt();
		int count =0;
		int i=2;
		while ( count <= numOfMersennePrime) {
			if ( isPrime(i)&& isMersenne(i)) {
				System.out.print(" "+i);
				count ++;
				if (count %10==0)
					System.out.println("");
			}
			i++;
		}
	}
	
	public static boolean isPrime( int i ) {
		int divisor = 2;
		while ( divisor <= i/2 ) {
			if ( i % divisor == 0)
				return false;
			divisor ++;
		}
		return true;	
	}
	
	public static boolean isMersenne(int i) {
		int temp = i +1;
		int count = 0;
		while ( temp % 2 ==0 ) {
			temp = temp /2;
			count++;
		}
		
		if (temp == 1)
		{   
		if (count <= 31 )
			return true;
		else
			return false;
		}
		else 
			return false;
	}

}
