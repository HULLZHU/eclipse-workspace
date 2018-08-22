
public class TestGCD {

	public static void main(String[] args) {
		System.out.println(gcd(27,12));

	}

		
	private static long gcd(long numerator, long denominator) {
		long gcd = 1;
		long min = numerator;
		if ( denominator < numerator)
			min = denominator;
		for ( int i = 2; i <= min ; i ++  ) {
			if ( numerator%i == 0 && denominator % i == 0 )
				gcd = i;
		}
		return gcd;
	}
}
