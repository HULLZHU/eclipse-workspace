import java.util.*;
public class PE_08_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of a square matrix.");
		int size = input.nextInt();
		int[][] matrix = new int[size][size];
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				matrix[i][j] = (int)(Math.round(Math.random()));
			}
		}
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j =0; j < matrix.length; j ++ ) {
				System.out.printf("%3d",matrix[i][j]);
				if ( j == size -1 )
					System.out.println("");
			}
		}
		
		checkRows(matrix);
		checkColumns(matrix);
		checkMajorDiag(matrix);
		checkSubDiag(matrix);
	}
	
	private static void checkMajorDiag(int[][] matrix) {
		int temp = matrix[0][0];
		if ( isSameDiagonal(matrix,temp)) {
			System.out.println("All "+ temp +" on major diagnal");
		}
		else 
			System.out.println("No same numbers on major diagnal.");
		
	}

	private static boolean isSameDiagonal(int[][] matrix, int temp) {
		for ( int i = 0; i < matrix.length ; i ++ ) {
			if (matrix[i][i] != temp)
				return false;
		}
		return true;
	}

	private static void checkSubDiag(int[][] matrix) {
		int temp = matrix[0][matrix[0].length-1];
		if ( isSameSubDiagonal(matrix,temp)) {
			System.out.println("All "+ temp +" on sub diagnal");
		}
		else 
			System.out.println("No same numbers on sub diagnal.");
		
		// TODO Auto-generated method stub
		
	}

	private static boolean isSameSubDiagonal(int[][] matrix, int temp) {
		for ( int i = 0; i<matrix.length ; i ++  ) {
			if ( temp != matrix[i][matrix.length-1-i])
				return false;
		}
		return true;
	}

	private static void checkColumns(int[][] matrix) {
		boolean hasSame = false;
		for ( int i = 0; i < matrix.length; i ++ ) {
			int temp = matrix[0][i];
			if ( isSameColumn(matrix,i,temp)) {
				System.out.println("All " + matrix[0][i]+"s on the"+i +"th column");
				hasSame = true;
			}
		}
		if ( !hasSame)
			System.out.println("No same numbers in the columns.");
	}

	private static boolean isSameColumn(int[][] matrix, int i, int temp) {
		boolean sameColumn = true;
		for ( int j = 0 ; j < matrix.length ; j ++) {
			if ( matrix[j][i]!= temp)
				return false;
		}
		return true;
	}

	public static void checkRows(int[][] matrix) {
		boolean hasSame = false;
		for ( int i = 0; i < matrix.length; i ++ ) {
			int temp = matrix[i][0];
			if ( isSameRow(matrix,i,temp)) {
				System.out.println("All " + matrix[i][0]+"s on the"+i +"th row");
				hasSame = true;
			}
		}
		if ( !hasSame)
			System.out.println("No same numbers in row.");
	}

	private static boolean isSameRow(int[][] matrix, int i, int temp) {
		boolean sameRow = true;
		for ( int j = 0 ; j < matrix[i].length ; j ++) {
			if ( matrix[i][j]!= temp)
				return false;
		}
		return true;
	}

}
