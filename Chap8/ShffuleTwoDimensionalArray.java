
public class ShffuleTwoDimensionalArray {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix.length ; j ++ ) {
				int i1 = (int)(Math.random()*matrix.length);
				int j1 = (int)(Math.random()*matrix.length);
				int temp = matrix[ i] [j ];
				matrix [i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
			}
		}
		
		printMatrix.printMatrix(matrix);
		// TODO Auto-generated method stub

	}



}
