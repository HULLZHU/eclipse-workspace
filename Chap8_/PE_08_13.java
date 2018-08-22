import java.util.*;
public class PE_08_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row number and column number.");
		double [][] matrix = new double[input.nextInt()][input.nextInt()];
		System.out.println("Please enter the numbers one by one.");
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				matrix[i][j] = input.nextDouble();
			}
		}
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0; j< matrix[i].length ; j ++ ) {
				System.out.printf("%4.1f",matrix[i][j]);
				if ( j == matrix[i].length -1 )
					System.out.println("");
			}
		}
		int[] location = locateLargest(matrix);
		System.out.println("The largest number's row is"+ location[0]+" and the column is " + location[1]);
		// TODO Auto-generated method stub

	}

	private static int[] locateLargest(double[][] matrix) {
		int []location  = new int[2];
		location[0] = 0;
		location[1] = 0;
		double maxNum = matrix[0][0];
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j++ ) {
				if ( matrix[i][j] > maxNum) {
					maxNum = matrix[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}

}
