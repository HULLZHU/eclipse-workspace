import java.util.*;
public class TestLocation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row number and column number.");
		int row = input.nextInt();
		int column = input.nextInt();
		double [][]matrix  = new double[row][column];
		System.out.println("Please enter the matrix.");
		for ( int i = 0 ; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix[i].length ; j ++ ) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		Location myLocation = Location.locateLargest(matrix);
		System.out.println("Row: "+ myLocation.getRow());
		System.out.println("Column: " + myLocation.getColumn());
		System.out.println("MaxValue: " + myLocation.getMax());
		

	}

}
