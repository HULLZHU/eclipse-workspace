import java.util.*;
public class PE_08_01 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4,5},{1,3,5,7,9},{2,4,6,8,10},{3,4,5,6,7},{8,7,6,5,4}};
		System.out.println("Please input columnIndex.");
		Scanner input = new Scanner(System.in);
		int columnIndex = input.nextInt();
		int sum = sumColumn( matrix,columnIndex);
		System.out.println("The sum is :" + sum);
		
		// TODO Auto-generated method stub

	}

	private static int sumColumn(int[][] matrix, int columnIndex) {
		int sum = 0;
		for ( int row = 0; row < matrix.length; row ++ ) {
			sum = sum + matrix[row][columnIndex];
		}
		return sum;
		// TODO Auto-generated method stub
		
	}

}
