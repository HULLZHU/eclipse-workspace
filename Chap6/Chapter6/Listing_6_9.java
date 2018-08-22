package Chapter6;
import java.util.*;
public class Listing_6_9 {

	public static void main(String[] args) {
		System.out.println("The maximum of 3 and 4 is " + max ( 3,4));
		System.out.println("The  maximum of 3 and 5.4 is " + max ( 3.0, 5.4 ));
		System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max (3.0, 5.4, 10.14));
	}
	
	public static int max ( int num1, int num2) {
		int max = 0;
		if (num1 > num2)
			max = num1;
		else 
			max = num2;
		return max;
	}
	
	public static double max ( double num1, double num2) {
		double max = 0;
		if ( num1 > num2 )
			max = num1;
		else 
			max = num2;
		return max;
	}
	
	public static double max ( double num1, double num2, double num3) {
		double max = 0;
		return max( max ( num1, num2), num3);
			
	}

}
