
public class ComputeFibonacci {
	public static void main(String[]args) {
		int n= 5;
		System.out.println("The n th fibonacci number is " + fib(n));
		
	}

	private static int fib(int n) {
		if ( n <= 2 && n >= 1 ) {
			return n-1;
		}
		else
			return fib(n - 1)+ fib(n - 2) ;
	}
}
