package Chapter;
import java.util.*;
public class Listing_07_01 {

	public static void main(String[] args) {
		System.out.println("Please input the number of items you want to input.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Please input values");
        double[] array = new double [n];
        double sum = 0;
        for ( int i=0; i < n; i ++ ) {
        	array [ i ] = input.nextDouble();
            sum += array[i];
        }
        
        double average = sum / n;
        System.out.println("Average: "+ average);
        
        for ( int i = 0 ; i < n ; i ++) {
        	if ( array[i]>average)
        		System.out.print(" " + array[i]);
        	if ((i + 1)%10==0)
        		System.out.println("");
        }
     
		// TODO Auto-generated method stub

	}

}
