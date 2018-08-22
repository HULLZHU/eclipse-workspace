import java.util.*;
public class PE_08_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the rowNumber1, columnNumber1, rowNumber2, columnNumber2 .");
		int rowNumber1 = input.nextInt();
		int columnNumber1= input.nextInt();
		int rowNumber2 = input.nextInt();
		int columnNumber2 = input.nextInt();
		if ( columnNumber1 != rowNumber2 ) {
			System.out.println("Wrong matrices' size");
			System.exit(0);
		}
		
		int[][] matrix1 = new int[rowNumber1][columnNumber1];
		int[][] matrix2 = new int[rowNumber2][columnNumber2];
		System.out.println("Enter matrix 1");
		for ( int i =0; i < matrix1.length ; i ++ ) {
			for ( int j = 0; j < matrix1[i].length; j ++ ) {
				matrix1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter martrix 2");
		for ( int i =0; i < matrix2.length ; i ++ ) {
			for ( int j = 0; j < matrix2[i].length; j ++ ) {
				matrix2[i][j] = input.nextInt();
			}
		}
		
		int[][] result =multiplyMatrix(matrix1,matrix2);
		System.out.println("The multiplication is :");
		printMatrix(matrix1);
		System.out.println("*");
		printMatrix(matrix2);
		System.out.println("=");
		printMatrix(result);
		
		// TODO Auto-generated method stub

	}
	private static void printMatrix(int[][] matrix) {
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0 ; j < matrix[i].length; j ++ ) {
				System.out.printf("%5d",matrix[i][j]);
				if ( j == matrix[i].length-1)
					System.out.println("");
			}
		}
		
	}

	private static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][matrix2[0].length];
		for ( int i = 0; i < result.length ; i ++ ) {
			for ( int j = 0; j < result[i].length; j ++ ) {
				result[i][j] = vectorMultiply( matrix1, matrix2, i , j );
			}
		}
		return result;
	}

	private static int vectorMultiply(int[][] matrix1, int[][] matrix2, int row, int column) {
		int[] vector1 = new int[matrix1[0].length];
		int[] vector2 = new int[matrix2.length];
		for ( int i = 0; i < matrix1[0].length; i ++ ) {
			vector1[i] = matrix1[row][i];
		}
		for ( int i = 0; i < matrix2.length; i ++ ) {
			vector2[i] = matrix2[i][column];
		}
		int sum = 0;
		for ( int i = 0; i < vector1.length; i++) {
			sum = sum + vector1[i]*vector2[i];
		}
		return sum;
	}

}
