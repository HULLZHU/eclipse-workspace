import java.util.*;
public class Case_Study_08_07_Sudoko {

	public static void main(String[] args) {
		//read solution
		Scanner input = new Scanner(System.in);
		int[][]grid = new int[9][9];
		for ( int i = 0 ; i< 9; i++ ) {
			for ( int j = 0; j < 9 ; j ++ ) {
				grid[i][j] = input.nextInt();
			}
		}
		
		// check valid or not
		System.out.println(isValid(grid)?"Valid":"Invalid");
}

	private static boolean isValid(int[][] grid) {
		for ( int i = 0; i < 9 ; i ++ ) {
			for (int j = 0; j < 9; j ++ ) {
				if ( grid[i][j]<1 || grid[i][j]>9 || !isValid(i,j,grid))
					return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

	private static boolean isValid(int i, int j, int[][] grid) {
		//check row
		for ( int column = 0 ; column < 9 ; column ++ ) {
			if ( column != j && grid[i][column] == grid[i][j])
				return false;
		}
		for ( int row = 0 ; row < 9 ; row ++) {
			if ( row != i && grid[row][j] == grid[i][j])
				return false;
		}
		//check block
		for ( int row = ( i/3)*3; row < (j/3)*3+3; row ++) {
			for ( int col = ( j/3)*3;col<(j/3)*3+3;col++)
				if ( row != i && col != j && grid[i][j]== grid[col][row])
						return false;
		}
		return true;
	}
}
