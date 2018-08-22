import java.util.*;
public class PE_08_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Defining a matrix
		System.out.println("Enter the size of the matrix.");
		int size = input.nextInt();
		int[][] matrix = new int[size][size];
		// Value every element
		for ( int i = 0 ; i < matrix.length; i ++ ) {
			for (int j = 0; j < matrix.length ; j ++ ) {
				matrix[i][j] = (int)(Math.round(Math.random()));
			}
		}
		// Output the matrix
		for ( int i = 0; i < matrix.length ; i++ ) {
			for ( int j = 0; j < matrix.length; j ++ ) {
				System.out.printf("%2d",matrix[i][j]);
				//Change the line
				if ( j== size -1 )
					System.out.println("");
			}
		}
		//prompt the user to enter the element filling the submatrix
		System.out.println("In your submatrix, what are the all element?");
		int temp = input.nextInt();
		getMaxSubMatrixWith(matrix,temp);
	}

	private static void getMaxSubMatrixWith(int[][] matrix, int temp) {
		//traverse all the element in the matrix
		int rowIndex = 0, columnIndex = 0;
		int tempMaxSize = 0;
		for ( int i = 0; i < matrix.length ; i++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				//判断是否进入该元素计算子矩阵的大小
				if ( matrix[i][j] == temp) {
					//判断子矩阵的大小是否比目前最大的矩阵大小要大，若是，则更新该矩阵为最大矩阵
					int currentSubmatrixSize = computeSubMatrixSize( matrix, i , j, temp);
					if ( currentSubmatrixSize >tempMaxSize) {
						rowIndex = i;
						columnIndex= j;
						tempMaxSize = currentSubmatrixSize;
					}	
				}
					
			}
		}
		System.out.println("The maximum square submatrix is at (" +rowIndex+","+columnIndex+")with size "+ tempMaxSize );
		
	}

	private static int computeSubMatrixSize(int[][] matrix, int i, int j, int temp) {
		//利用试错法来计算size
		for ( int size = 0; size <Math.min(matrix.length-i,matrix.length-j); size ++ ) {
			for ( int k = i; k <= i+size; k ++ ) {
				for ( int l = j ; l <= j+size ; l ++ ) {
					if ( temp != matrix[k][l])
						return size;
				}
			}
		}
		return 1;
	}

}
