import java.util.*;
public class PE_08_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the size of these two matrix.");
		int size = input.nextInt();
		int[][] list1 = new int[size][size];
		int[][] list2 = new int[size][size];
		System.out.println("please enter the first list");
		readMatrix(list1);
		System.out.println("please enter the second list.");
		readMatrix(list2);
		if ( isStrictlySame(list1,list2)) {
			System.out.println("The two arrays are strictly same.");
		}
		else
			System.out.println("The two arrays are not strictly same." );
	}

	private static boolean isStrictlySame(int[][] list1, int[][] list2) {
		for ( int i = 0 ; i < list1.length ; i++) {
			for ( int j = 0; j < list1.length ; j ++ ) {
				if ( list1[i][j]!=list2[i][j])
					return false;
			}
		}
		return true;
	}
	
	private static int[][] readMatrix(int[][] matrix) {
		Scanner input = new Scanner(System.in);
		for ( int i = 0 ; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix.length ; j++ ) {
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}

}
