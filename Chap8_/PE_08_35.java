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
				//�ж��Ƿ�����Ԫ�ؼ����Ӿ���Ĵ�С
				if ( matrix[i][j] == temp) {
					//�ж��Ӿ���Ĵ�С�Ƿ��Ŀǰ���ľ����СҪ�����ǣ�����¸þ���Ϊ������
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
		//�����Դ�������size
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
