import java.util.Scanner;

public class SumSeries3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		System.out.println(sum(n));

	}

	private static double sum(double n) {
		if( n == 1 )
			return 1.0/(n+1);
		else
			return (n)/(n+1.0) + sum(n-1.0);
	}

}
