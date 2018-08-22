import java.math.*;
public class LargeFactorial {

	public static void main(String[] args) {
		System.out.println("The factorial of 50 is "+ factorial(50));
	}

	private static BigInteger factorial(int upperLimit) {
		BigInteger result = new BigInteger("1");
		for ( int i = 1 ; i<= upperLimit ; i ++) {
			result = result.multiply(new BigInteger(i+""));
		}
		return result;
	}

}
