import java.util.Scanner;
public class SumSeries2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(sum(n));

	}

	private static double sum(int n) {
		if ( n == 1)
			return 1.0/(1+2*n);
		else
			return n/(2.0*n+1)+sum(n-1);
	}

}
