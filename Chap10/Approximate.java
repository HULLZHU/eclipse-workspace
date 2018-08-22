import java.math.*;
public class Approximate {

	public static void main(String[] args) {
		BigDecimal e = new BigDecimal("0");
		BigDecimal one = new BigDecimal("1");
		for( int i = 1; i < 100; i ++ ) {
			e = e.add(one.divide(factorial(i),25,BigDecimal.ROUND_UP));
		}
		System.out.println(e);

	}

	private static BigDecimal factorial(int n) {
		BigDecimal result = new BigDecimal("1");
		for( int i = 1; i < n ; i ++ ) {
			result = result.multiply(new BigDecimal(""+i));
		}
		return result;
		
	}

}
