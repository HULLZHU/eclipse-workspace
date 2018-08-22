import java.util.*;
public class PE_08_23 {

	public static void main(String[] args) {
		System.out.println("Please enter a 6-by-6 matrix which has even number of 1s in every columns and rows.");
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[6][6];
		for ( int i = 0; i < matrix.length; i++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		printTable(matrix);
		System.out.println("Which number do you want to flip.");
		int x = input.nextInt(), y = input.nextInt();
		if ( matrix[x][y]==1)
			matrix[x][y] = 0;
		else 
			matrix[x][y]=1;
		printTable(matrix);
		System.out.println("Now the computer will start to guess which one is flipped.");
		int row = checkColumn(matrix);
		int column = checkRow(matrix);
		System.out.println("The flipped one is ("+row+","+column+")" );

	}

	private static int checkRow(int[][] matrix) {
		int count = 0;
		for ( int column = 0 ; column < matrix[0].length;column++ ) {
			for ( int row = 0; row < matrix.length; row++ ) {
				if (matrix[row][column]== 1)
					count ++ ;
			}
			if ( count%2==1)
				return column;
		}
		return 7;
	}

	private static int checkColumn(int[][] matrix) {
		int count = 0; 
		for ( int row = 0; row < matrix.length ; row ++ ) {
			for ( int column = 0; column<matrix[row].length ; column++) {
				if ( matrix[row][column]==1)
					count++;
			}
			if (count%2==1)
				return row;
		}
		
		return 7;
	}

	private static int flippMatrix(int x, int y, int[][] matrix) {
		if ( matrix[x][y]==1)
			matrix[x][y]=0;
		else if ( matrix[x][y]==0);
			matrix[x][y]=1;
		return matrix[x][y];
		
	}

	private static void printTable(int[][] matrix) {
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				System.out.print(" " + matrix[i][j]);
				if ( j== matrix[i].length-1)
					System.out.println("");
			}
		}
	}

}
