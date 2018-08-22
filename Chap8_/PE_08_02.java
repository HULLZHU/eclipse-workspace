
public class PE_08_02 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{2,3,4},{4,5,6}};
		int sum = sumDiagonal(matrix);
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

	private static int sumDiagonal(int[][] matrix) {
		int sum = 0;
		for ( int row = 0; row < matrix.length ; row ++) {
			sum = sum + matrix[row][row];
		}
		// TODO Auto-generated method stub
		return sum;
	}

}
