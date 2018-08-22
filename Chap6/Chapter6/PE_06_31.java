package Chapter6;
import java.util.*;
public class PE_06_31 {

	public static void main(String[] args) {
		System.out.println("Please enter the card number");
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		System.out.println("Valid"+isValid(number));
		System.out.println(sumOfDoubleEvenPlace(number));
		System.out.println(sumOfOddPlace(number));
		}
		
	public static boolean	isValid( long number ) {
		if ( (sumOfDoubleEvenPlace(number)+ sumOfOddPlace(number))%10==0&&getSize(number))
			return true;
		else
			return false;
		
	}
	
	public static int sumOfDoubleEvenPlace( long number ) {
		String s1 = number +"";
		int i = 0;
		int sum = 0;
		int digit = 0;
		while ( i<= s1.length()-1) {
			digit = 2*Integer.parseInt(s1.charAt(i)+"");
		    if ( digit>=10) 
		    	digit = digit - 9;
		    sum = sum + digit;
		    i +=2;
		}
		return sum;
	}
	
	public static int sumOfOddPlace( long number ) {
		String s1 = number +"";
		int i = 0;
		int sum = 0;
		int digit = 0;
		while( s1.length()-1-i>=0) {
			digit = Integer.parseInt(s1.charAt(s1.length()-1-i)+"");
			sum = sum + digit;
			i +=2;
		}
		return sum;
	}
	
	public static boolean getSize(long number) {
		String s1 = number +"";
		if (s1.length()>= 13 && s1.length()<=16)
			return true;
		else
			return false;
	}

}
