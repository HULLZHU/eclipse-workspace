import java.util.Scanner;

public class SumDigitsHelper {
	public static void main(String[]args) {
		System.out.println("Please enter an Integer");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(sumDigits(number));
	}

	private static int sumDigits(int number) {
		// TODO Auto-generated method stub
		return sumDigits(number,0);
	}

	private static int sumDigits(int number, int result) {
		if ( 0<=number&&number<10) {
			return result + number;
		}
		else {
			result = result + number % 10;
			number = number/10;
			return sumDigits(number,result);
			//This is tail recursion
		}
	}

}
