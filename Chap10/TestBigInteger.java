import java.math.*;
public class TestBigInteger {

	public static void main(String[] args) {
		BigInteger bigNum = new BigInteger("10000000000000000000");
		for ( int i = 0 ; i < 50; ) {
			bigNum = bigNum.add(new BigInteger("1"));
			if ( bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) && bigNum.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
				System.out.println(bigNum.toString());
				i ++;
			}
		}
		

	}

}
