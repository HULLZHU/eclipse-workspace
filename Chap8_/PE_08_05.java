import java.util.*;
public class PE_08_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the row number of the matrices.");
		int rowNumber = input.nextInt();
		int columnNumber = input.nextInt();
		int[][] matrix1 = new int[rowNumber][columnNumber];
		int[][] matrix2 = new int[rowNumber][columnNumber];
		System.out.println("Enter the first matrices.");
		for ( int i = 0; i < matrix1.length; i ++ ) {
			for ( int j = 0; j <matrix1[i].length; j ++ ) {
				matrix1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the second matrices.");
		for ( int i = 0 ; i < matrix2.length; i ++ ) {
			for ( int j = 0; j < matrix2[i].length ; j ++ ) {
				matrix2[i][j] = input.nextInt();
			}
		}
	
		int[][]result = addMatrix(matrix1,matrix2);
		printMatrix(matrix1);
		System.out.println("+");
		printMatrix(matrix2);
		System.out.println("=");
		printMatrix(result);
		// TODO Auto-generated method stub

	}

	private static void printMatrix(int[][] matrix) {
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0 ; j < matrix[i].length; j ++ ) {
				System.out.printf("%4d",matrix[i][j]);
				if ( j == matrix[i].length-1)
					System.out.println("");
			}
		}
		
	}

	private static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int [matrix1.length][matrix1[0].length];
		for ( int i = 0; i < matrix1.length; i ++ ) {
			for ( int j = 0; j < matrix1[i].length; j ++ ) {
				result[i][j] = matrix1[i][j]+ matrix2[i][j];
			}
		}
		return result;
	}

}
