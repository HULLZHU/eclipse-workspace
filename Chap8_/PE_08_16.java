import java.util.*;
public class PE_08_16 {

	public static void main(String[] args) {
		System.out.println("How many rows do you want to have.");
		Scanner input = new Scanner(System.in);
		int numberOfRow = input.nextInt();
		int[][] matrix = new int[numberOfRow][2];
		System.out.println("Please enter numbers");
		for ( int i = 0; i < matrix.length ; i++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		sort(matrix);
		// TODO Auto-generated method stub

	}

	private static void sort(int[][] matrix) {
		for ( int column = 0 ; column < matrix[0].length; column ++ ) {
			for ( int row = 0; row < matrix.length-1; row ++ ) {
				int currentMin = matrix[row][column];
				int currentMinIndex = row;
				for( int row_ = row + 1; row_<matrix.length;row_++ ) {
					if ( currentMin > matrix[row_][column]) {
						currentMin = matrix[row_][column];
						currentMinIndex = row_;
					}
				}
				if ( currentMinIndex != row ) {
					matrix[currentMinIndex][column] = matrix[row][column];
					matrix[row][column] = currentMin;
				}
			}
		}
		
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j <matrix[0].length; j ++ ) {
				System.out.print("  " + matrix[i][j]);
				if ( j == matrix[0].length -1 )
					System.out.println("");
			}
		}
		
	}

}
