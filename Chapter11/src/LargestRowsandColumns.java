import java.util.*;
public class LargestRowsandColumns {
	public static void main(String[] args) {
		System.out.println("Please enter the size of matrix.");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[][] matrix = new int[size][size];
		ArrayList<Integer> listOfRow = new ArrayList<>();
		ArrayList<Integer> listOfColumn = new ArrayList<>();
		//fill the matrix
		for ( int i = 0; i <matrix.length ;i++ ) {
			for ( int j = 0; j < matrix[i].length;j ++) {
				matrix[i][j] = (int)(Math.round(Math.random()));
			}
		}
		printMatrix(matrix);
		
		for ( int i = 0; i < matrix.length ; i ++ ) {
			int count = 0;
			for ( int j = 0; j< matrix[i].length ; j ++ ) {
				if ( matrix[i][j]==1) {
					count ++ ;
				}
			}
			listOfRow.add(count);
		}
		
		for ( int column = 0; column < matrix.length ; column ++ ) {
			int count = 0;
			for ( int row = 0; row< matrix.length ; row ++ ) {
				if ( matrix[row][column]==1) {
					count ++;
				}
			}
			listOfColumn.add(count);
		}
		System.out.println(listOfRow.toString());
		System.out.println(listOfColumn.toString());
		
		System.out.println("The largest row  : " + getMaxIndex(listOfRow));
		System.out.println("The largest column  : " + getMaxIndex(listOfColumn));
	

	}

	private static String getMaxIndex(ArrayList<Integer> list) {
		int max = list.get(0);
		String s1 = "";
		for ( int i = 0; i < list.size(); i++ ) {
			if ( list.get(i)>= max)
				max = list.get(i);
		}
		
		for ( int i = 0; i < list.size(); i++ ) {
			if ( list.get(i) == max) {
				s1 = s1+i+" ";
			}
		}
		
		return s1;
	}

	private static void printMatrix(int[][] matrix) {
		for ( int i = 0; i <matrix.length ;i++ ) {
			for ( int j = 0; j < matrix[i].length;j ++) {
				System.out.print(" " + matrix[i][j]);
				if ( j == matrix.length-1 )
					System.out.println("");
			}
		}
		
	}

}
