import java.util.Scanner;

public class ReverseIntegerRecursively {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(reverse(number));
	}

	private static int reverse(int number) {
		return reverse(0,number);
	}

	private static int reverse(int result, int number) {
		if ( number == 0) {
			return result;
		}
		else if (number > 0 ) {
			result = 10 * result + number % 10;
			number = number / 10;
			return reverse(result,number);
		}
		else
			return reverse(result,-number);
	}
}
