
public class Accumulation {
	public static void main(String[] args) {
		int n = 5;
		System.out.println("The accumulation of n is " + getAccumulation(n));
	
	}

	private static int getAccumulation(int n) {
		if ( n == 0 )
			return n ;
		else
			return n + getAccumulation(n-1);
	}

}
