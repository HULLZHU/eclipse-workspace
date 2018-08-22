import java.math.*;
public class BigIntegerDemo {

	public static void main(String[] args) {
		BigInteger x = new BigInteger("3");
		BigInteger y = new BigInteger("7");
		BigInteger z = x.add(y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		String[] stringList = "I&Love&You".split("&");
		for ( int i = 0; i < stringList.length; i ++ ) {
			System.out.println(stringList[i]);
		}

	}

}
