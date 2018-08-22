package Chapter6;
import java.util.*;
public class Listing_6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		System.out.println("The max number of ¡± + num1" + " and " + num2+" is " + max(num1,num2));
	}
	
	public static double max( double x, double y) {
		if ( x > y )
			return x;
		else
			return y;
	}
	
	public static double max ( int x, double y) {
		if ( x > y)
			return x;
		else 
			return y;
	}

}
