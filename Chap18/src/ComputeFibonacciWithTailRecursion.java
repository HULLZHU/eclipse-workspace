
public class ComputeFibonacciWithTailRecursion {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(fac(n+1));
	}

	private static int fac(int n) {
		int x0 = 0;
		int x1 = 1;
		return fac(n,x0, x1);
	}

	private static int fac(int n, int x0, int x1) {
		if ( n <= 2) {
			return x1;
		}
		
		else 
			return fac(n-1, x1 , x1 + x0);
		
		
	}

}
