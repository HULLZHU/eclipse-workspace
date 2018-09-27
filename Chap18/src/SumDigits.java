import java.util.Scanner;

public class SumDigits {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(sumDigits(number));
	}

	private static int sumDigits(int number) {
		
		if ( 0<=number&&number <10) {
			return number;
		}
		
		else {
			return number%10 +sumDigits(number/10);
		}
		
		
	}

}
