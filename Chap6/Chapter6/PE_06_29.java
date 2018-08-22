package Chapter6;

public class PE_06_29 {

	public static void main(String[] args) {
		int i = 2;
		while ( i < 1000 ) {
			if (isPrime(i)&&isPrime(i-2)) {
				System.out.println(i + "  "+(i-2));
			}
			i++;
		}
	}
	
	public static boolean isPrime( int num ) {
		int divisor = 2;
		while ( divisor <= num/2 ) {
			if ( num % divisor == 0)
				return false;
			divisor ++;
		}
		return true;
	}

}
