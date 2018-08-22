
public class TestRationalClass {

	public static void main(String[] args) {
		Rational result = new Rational(0,1);
		for ( int i = 1; i < 100 ; i++ ) {
			result=result.add(new Rational(i,i+1));
			System.out.println(result.toString());
		}
		System.out.println(result.toString());
	}
}
