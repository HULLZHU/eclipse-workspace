import java.util.Scanner;

public class ComputeFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a nonnegetive intger");
		int n = input.nextInt();
		
		System.out.println("Factorial of "+ n + " is "+factorial(n));

	}

	private static long factorial(int n) {
		if ( n== 0)
			return 1;
		else 
			return n * factorial(n-1);
					
	}

}
