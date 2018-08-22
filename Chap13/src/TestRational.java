
public class TestRational {

	public static void main(String[] args) {
		Rational r1 = new Rational(4,2);
		Rational r2= new Rational(2,3);
		System.out.println(r1.add(r2).toString());
		System.out.println(r1.subtract(r2).toString());
		System.out.println(r1.multiply(r2).toString());
		System.out.println(r1.divide(r2).toString());
		Rational r3= new Rational(-2,6);
		System.out.println(r3.getNumerator());
		System.out.println(r3.getDenominator());
		System.out.println(r3.intValue());
		System.out.println(r3.doubleValue());
		Rational r4 = new Rational(1,2);
		Rational r5 = new Rational(1,-2);
		System.out.println(r4.add(r5));
		
	
	}

}
