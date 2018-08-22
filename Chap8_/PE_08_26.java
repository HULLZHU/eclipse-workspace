import java.lang.reflect.Array;
import java.util.*;
public class PE_08_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a 3-by-3 matrix.");
		double[][] matrix = new double[3][3];
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j =0 ; j < matrix.length ; j ++ ) {
				matrix[i][j] = input.nextDouble();
			}
		}
		for ( int row = 0; row < matrix.length; row ++ ) {
			Arrays.sort(matrix[row]);
		}
		
		for ( int i = 0 ; i < matrix.length ; i ++ ) {
			for( int j = 0; j < matrix.length ; j ++ ) {
				System.out.printf("%5.1f",matrix[i][j]);
				if ( j == 2)
					System.out.println("");
			}
		}
		// TODO Auto-generated method stub

	}

}
