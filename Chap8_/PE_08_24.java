import java.util.*;
public class PE_08_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[9][9];
		matrix =readMatrix();
		if( rightRow( matrix )&& rightColumn( matrix )&& rightBox(matrix))
			System.out.println("The sudoku solution is valid.");
		else 
			System.out.println("The sudoku solution is invalid.");

	}

	private static boolean rightBox(int[][] matrix) {
		boolean[]temp = new boolean[9];
		for ( int i = 0 ; i < 3; i++ ) {
			for ( int j = 0; j< 3;j++) {
				for ( int row = 3*i; row<3*i+3 ; row++) {
					for( int column = 3*j ; column<3*j +3; column++) {
						temp[matrix[row][column]-1] = true;
					}
					}
				if ( !isValid(temp))
					return false;
				for ( int k = 0; k < temp.length ; k ++ )
					temp[k] = false;
			}
		}
		return true;
	}

	private static boolean rightColumn(int[][] matrix) {
		boolean[] temp = new boolean[9];
		for ( int column = 0; column < matrix[0].length ; column ++ ) {
			for ( int row = 0; row < matrix.length ; row ++ ) {
				temp[matrix[row][column]-1] = true;
			}
			if ( !isValid(temp))
				return false;
			for ( int i = 0; i < temp.length ; i ++ )
				temp[i] = false;
		}
		return true;
	}

	private static boolean rightRow(int[][] matrix) {
		boolean [] temp = new boolean[9];
		for ( int row = 0; row < matrix.length;row ++ ) {
			for ( int column = 0 ; column<matrix[row].length;column++) {
				temp[matrix[row][column]-1] = true;
			}
			if(!isValid(temp))
				return false;
			for ( int i = 0; i < temp.length ; i ++ )
				temp[i] = false;
		}
		return true;
	}

	private static boolean isValid(boolean[] temp) {
		for ( int i = 0 ; i <temp.length ; i ++ ) {
			if (!temp[i])
				return false;
		}
		return true;
	}

	private static int[][] readMatrix() {
		Scanner input = new Scanner(System.in);
        int[][] matrix = new int[9][9];
        System.out.println("Please enter numbers¡£");
        for ( int i = 0; i < matrix.length ; i++ ) {
        	for ( int j = 0; j<matrix[i].length ; j++ ) {
        		matrix[i][j] = input.nextInt();
        	}
        }
		return matrix;
	}

}
