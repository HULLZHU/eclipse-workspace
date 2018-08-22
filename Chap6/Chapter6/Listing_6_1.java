package Chapter6;
import java.util.*;
public class Listing_6_1{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 2 numbers");
		int i = input.nextInt();
		int j = input.nextInt();
		int k = max(i,j);
		System.out.println(k);
		
	}
	

	public static int max( int num1, int num2) {
		int result;
		if ( num1 > num2)
			result = num1;
		else 
			result = num2;
		
		return result;
}
}
	