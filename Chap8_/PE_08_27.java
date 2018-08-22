import java.util.*;
public class PE_08_27 {

	public static void main(String[] args) {
		System.out.println("Please enter a 3-by-3 matrix.");
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];
		matrix = readMatrix(matrix);
		matrix = sortColumn(matrix);
		printTable(matrix);

	}

	private static void printTable(double[][] matrix) {
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0; j <matrix.length ; j ++ ) {
				System.out.printf("%5.2f", matrix[i][j]);
				if ( j == matrix.length -1 )
					System.out.println("");
			}
		}	
	}
	private static double[][] sortColumn(double[][] matrix) {
		double [][] matrix2 = new double[matrix.length][matrix.length];
		matrix2 = reverse(matrix);
		for ( int row = 0; row < matrix.length ; row ++ )
			Arrays.sort(matrix2[row]);
		matrix = reverse(matrix2);
		return matrix;
	}
	private static double[][] reverse(double[][] matrix) {
		double matrix2[][] = new double[matrix.length][matrix.length];
		for ( int i = 0; i < matrix.length; i++ ) {
			for ( int j = 0; j < matrix.length ; j ++ ) {
				matrix2[i][j] = matrix[j][i];
			}
		}
		return matrix2;
	}
	private static double[][] readMatrix(double[][] matrix) {
		Scanner input = new Scanner(System.in);
		for ( int i = 0 ; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix.length ; j++ ) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}
}
