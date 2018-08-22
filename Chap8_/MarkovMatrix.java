import java.util.*;
public class MarkovMatrix {
	public static void main(String[] args) {
		System.out.println("What is the size of matrix.");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		double [][]matrix = generateMarkovMatrix(size);
		printTable(matrix);
		//
		double total = 0;
		for ( int i = 0 ; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix.length ; j ++ ) {
				total+= matrix[i][j];
			}
		}
		System.out.println(total);
		//
	}
	public static double[][] generateMarkovMatrix(int size){
		double[][] matrix = new double[size][size];
		double total = 0;
		for ( int i = 0; i < size; i ++ ) {
			for ( int j = 0; j < size ; j++ ) {
				matrix[i][j] = Math.random();
				total +=matrix[i][j];
			}
		}
		for ( int i = 0 ; i < size ; i ++ ) {
			for ( int j = 0; j <size; j ++ ) {
				matrix[i][j] = matrix[i][j]/total;
			}
		}
		return matrix;
	}
	private static void printTable(double[][] matrix) {
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				System.out.print(" " + matrix[i][j]);
				if ( j== matrix[i].length-1)
					System.out.println("");
			}
		}
	}
}
