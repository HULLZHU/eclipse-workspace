import java.math.BigInteger;

public class LargePrimeNumber {

	public static void main(String[] args) {
			BigInteger largeNumber = new BigInteger(""+Long.MAX_VALUE);
			for ( int count = 0; count < 10;  ) {
				largeNumber.add(BigInteger.ONE);
				if ( isPrime(largeNumber)) {
					count ++ ;
					System.out.println("The prime number : " + largeNumber.toString());
				}
			}
		}

	public static boolean isPrime(BigInteger largeNumber) {
		for (BigInteger i = new BigInteger("2"); i.compareTo(largeNumber.divide(new BigInteger("2")))<=0;) {
			if ( largeNumber.remainder(i).equals(BigInteger.ZERO))
				return false;
		}
		return true;
	}
	

}
