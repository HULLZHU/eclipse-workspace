import java.util.Scanner;
public class PE_08_22 {

	public static void main(String[] args) {
		System.out.println("Please enter a 6-by-6 matrix by 1 and 0");
		Scanner input = new Scanner (System.in);
		int[][] matrix = new int[6][6];
		for( int i = 0;i<matrix.length;i ++ ) {
			for ( int j = 0; j < matrix.length; j ++ ) {
				matrix[i][j] = input.nextInt();
			}
		}
		printTable(matrix);
		if(rowRight(matrix) && columnRight(matrix))
			System.out.println("The matrix has even number of 1 in rows and columns.");
		
		// TODO Auto-generated method stub

	}
	
	private static boolean columnRight(int[][] matrix) {
		int count = 0;
		for ( int column = 0;column<matrix[0].length; column++ ) {
			for ( int row = 0; row < matrix.length; row ++ ) {
				if ( matrix[row][column]==1) {
					count++;
				}
			}
			if ( count%2 == 1)
				return false;
			count =0;
		}
		return true;
	
	}

	private static boolean rowRight(int[][] matrix) {
		int count = 0;
		for ( int row = 0;row<matrix.length; row++ ) {
			for ( int column = 0; column < matrix.length; column ++ ) {
				if ( matrix[row][column]==1) {
					count++;
				}
			}
			if ( count%2 == 1)
				return false;
			count =0;
		}
		return true;
	}

	private static void printTable(int[][] cities) {
		for ( int i = 0; i < cities.length; i ++ ) {
			for ( int j = 0; j < cities[i].length; j ++ ) {
				System.out.print(" "+cities[i][j]+" ");
				if ( j == 5)
					System.out.println("");
			}
		}	
	}
}
