
public class Power2N {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("The power(2,n) is "+ getPower(2,n));

	}

	private static int getPower(int a, int n) {
		if ( n == 0 )
			return 1;
		else
			return 2 * getPower(a,n-1);
	}

}
