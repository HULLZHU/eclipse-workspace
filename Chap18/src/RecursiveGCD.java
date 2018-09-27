import java.util.Scanner;

public class RecursiveGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		System.out.println(gcd(m,n));

	}

	private static int gcd(int m, int n) {
		if (m%n == 0)
			return n;
		else
			return gcd(n,m%n);
	}

}
