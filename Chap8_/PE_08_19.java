import java.util.*;
public class PE_08_19 {

	public static void main(String[] args) {
		System.out.println("Please input numbers.");
        Scanner input = new Scanner(System.in);
        int[][]matrix = new int[6][7];
        for ( int i = 0 ; i < matrix.length ; i ++ ) {
        	for ( int j = 0 ; j < matrix[i].length;j++ ) {
        		matrix[i][j] = input.nextInt();
        	}
        }
        
        checkMatrix(matrix);
		// TODO Auto-generated method stub

	}

	private static void checkMatrix(int[][] matrix) {
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				
				////
				int isConsecutive = 0;
				if ( i<3 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i+addition][j]==matrix[i][j])
							isConsecutive ++;
					}
					}
				if ( isConsecutive==3) {
					System.out.println("Here are "+ matrix[i][j]+"s consecutive in a column in the " + j + "th row");
				}
				
				////
				isConsecutive = 0;
				if ( j<4 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
				}
				if (isConsecutive==3 ) {
					System.out.println("Here are " + matrix[i][j]+"s consecutive in the "+  i+ "th row");
				}
				////
				
				isConsecutive = 0;
				if ( i<3 && j < 4 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i+addition][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
					if (isConsecutive==3 ) {
						System.out.println("Here are " + matrix[i][j]+"s consecutive in major diagonal direction");
					}
					
				}
				
				////
				
				isConsecutive = 0;
				if ( i>=3 && j<=3) {
					for ( int addition =1; addition < 4 ; addition ++ ) {
						if ( matrix[i-addition][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
					if (isConsecutive ==3) {
						System.out.println("Here are " + matrix[i][j]+"s consecutive in sub diagonal direction");
					}
				}
			}
		}
		
	}

}
