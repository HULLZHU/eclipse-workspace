import java.math.*;
public class Test_Max_Value {

	public static void main(String[] args) {
		BigInteger maxValue = new BigInteger(Long.MAX_VALUE+"");
		for ( int i = 0; i < 10 ; ) {
			maxValue.add(BigInteger.ONE);
			if ( isSquareNum(maxValue)) {
				System.out.println(maxValue.toString()+" is a square number ");
			}
			
		}

	}

	public  static boolean isSquareNum(BigInteger maxValue) {
		long startingTime = System.currentTimeMillis()/1000;
		for ( BigInteger temp = new BigInteger("4000000000");;) {
			temp.add(BigInteger.ONE);
			long currentTime = System.currentTimeMillis()/1000;
			if ( currentTime-startingTime > 10 ) {
				System.out.println("The running time is too long, so break.");
				return false;
			}
			if ( temp.multiply(temp).equals(maxValue))
				return true;
		}
	}


}
