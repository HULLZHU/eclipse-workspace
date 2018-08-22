import java.util.*;
public class PE_08_29 {

	public static void main(String[] args) {
		System.out.println("Please enter the size of matrices.");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[][] list1 = new int[size][size];
		int[][] list2 = new int[size][size];
		System.out.println("Please enter the 1st list.");
		readMatrix(list1);
		System.out.println("Please enter the 2nd list.");
		readMatrix(list2);
		boolean temp = true;
		for ( int i = 0 ; i < list1.length ; i ++ ) {
			for ( int j = 0; j < list1[i].length ; j ++ ) {
				if ( hasSameValue(list1[i][j],list2))
					temp = false;
			}
		}
		if ( temp )
			System.out.println("They are identical arrays.");
	}

	private static boolean hasSameValue(int k, int[][] list2) {
		for ( int i = 0 ; i <list2.length ; i ++ ) {
			for ( int j = 0; j < list2[i].length ; j ++ ) {
				if (k != list2[i][j])
					return false;
			}
		}
		return true;
	}

	
	private static void readMatrix(int[][] list1) {
		Scanner input = new Scanner(System.in);
		for ( int i = 0; i < list1.length; i ++ ) {
			for ( int j = 0; j <list1[i].length ; j ++ ) {
				list1[i][j]= input.nextInt();
			}
		}
	}
}
