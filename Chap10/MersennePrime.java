import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {
		BigInteger largeNumber = new BigInteger("2");
		for (int power = 2; power < 10; power ++  ) {
			largeNumber = largeNumber.pow(power);
			if ( LargePrimeNumber.isPrime(largeNumber))
				System.out.println("MersennePrime: " + largeNumber.toString());
		}

	}

}
