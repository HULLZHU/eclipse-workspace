
public class TestDecimal {

	public static void main(String[] args) {
		Rational r1 = new Rational(4,10);
		double s1 = 2.8;
		Decimal decimal = new Decimal(s1);
		System.out.println(decimal.toRational());
		System.out.println(r1);
 }

}
