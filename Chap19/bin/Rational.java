
public class Rational extends Number implements Comparable<Rational> {
	private long numerator = 0;
	private long denominator = 0;
	
	public Rational() {
		this(1,1);
	}
	
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator,denominator);
		this.numerator = ((denominator>0)?1:-1)*numerator/gcd;
		this.denominator = Math.abs(denominator)/gcd;
		}
	
	private long gcd(long n, long d) {
		if ( n== 0)
			return 1;
		long n1 =Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for ( int k =1 ; k< n1 && k<n2 ; k++) {
			if (n1%k ==0 &&n2 % k==0) {
				gcd = k;			}
		}
		return gcd;
	}
	
	public long getNumerator() {
		return numerator;
	}
	public long getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational) {
		long n = numerator *secondRational.getDenominator()+denominator*secondRational.getNumerator();
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational subtact(Rational secondRational) {
		long n = numerator *secondRational.getDenominator()-denominator*secondRational.getNumerator();
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational multiply(Rational secondRational) {
		long n = numerator*secondRational.getDenominator();
		long d = denominator*secondRational.getNumerator();
		return new Rational(n,d);
	}
	
	public Rational divide(Rational secondRational) {
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumerator();
		return new Rational(n,d);
	}
	@Override
	public int compareTo(Rational arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return numerator*1.0/denominator;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (int)this.floatValue();
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int)this.doubleValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)this.doubleValue();
	}	
	 
	@Override
	public String toString() {
		if ( denominator == 1) {
			return numerator+"";
		}
		return numerator +"/" + denominator;
	}
	
	@Override 
	public boolean equals(Object other) {
		long result = this.subtact((Rational)(other)).getNumerator();
		if (result == 0)
			return true;
		else
			return false;
	}

}
