package Chapter6;
import java.util.*;
public class PE_06_05 {

	public static void main(String[] args) {
		System.out.println("Please input 3 numbers");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		displaySortedNumbers(i, j, k);
	}
	
	public static void displaySortedNumbers( double i, double j, double k ) {
		double max = maxOf2Doubles(i, maxOf2Doubles(j,k));
	    double min = minOf2Doubles( i, minOf2Doubles(j,k));
		double mid = midOf3Doubles ( i,j,k);
		
		
		System.out.println(max +" "+ mid +" "+ min );
	}
	
	public static double maxOf2Doubles( double i, double j) {
		if ( i > j ) 
			return i;
		else
			return j;
	}
	
	public static double minOf2Doubles ( double i, double j) {
		if ( i< j)
			return i;
		else 
			return j;
}
	public static double midOf3Doubles( double a, double b, double c) {
		double mid = 0;
		mid = a>b?(b>c?b:(a>c?c:a)):(a>c?a:(b>c?c:b));
		return mid;
	}
	}
