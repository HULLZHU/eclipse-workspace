import java.util.Scanner;

public class SumSeries {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("The sum is " + getSum(n));
	}

	private static double getSum(int n) {
		if ( n == 0)
			return 0;
		if ( n== 1)
			return 1;
		else 
			return 1.0/n + getSum(n-1);
		
	}
}
