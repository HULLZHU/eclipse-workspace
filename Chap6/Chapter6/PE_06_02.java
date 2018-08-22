package Chapter6;
import java.util.*;
public class PE_06_02 {

	public static void main(String[] args) {
		System.out.println("Please input an integr");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.print("The sum of an integer's digits is "+ sumOfDigits(i));
	}
	
	public static int sumOfDigits( int i) {
		int sum = 0;
		while ( i > 0 ) {
			sum = sum + ( i%10);
			i = ( i - i%10)/10;
		}
		return sum;
		
	}

}
