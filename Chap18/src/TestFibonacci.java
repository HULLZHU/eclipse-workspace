import java.util.Scanner;
public class TestFibonacci {
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		System.out.println(fib(n));
		System.out.println("The count is "+ count);
	}

	private static double fib(double n) {
		count ++;
		if (n == 0 )
			return 0 ;
		if (n == 1)
			return 1 ;
		else
			return  fib(n-1)+fib(n-2);
	}
	

}
