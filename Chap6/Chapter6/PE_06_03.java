package Chapter6;
import java.util.Scanner;
public class PE_06_03 {

	public static void main(String[] args) {
		System.out.println("Please input an integer");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
		if (isPalindrome(integer)) 
			System.out.println("The " + integer+ " is a palindrome");
		else 
			System.out.println("The integer " + integer+" is not a palindrome");
	}
	
	public static boolean isPalindrome( int integer ) {
		if (reverse( integer )== integer)
			return true;
		else 
			return false;
	}
	
	public static int reverse( int integer) {
		int reverseNum = 0;
		int remainder = 0;
		while ( integer != 0) {
			remainder = ( integer % 10);
			integer = (integer - remainder)/10;
			reverseNum = reverseNum*10 + remainder;
		}
		return reverseNum;
	}

}
