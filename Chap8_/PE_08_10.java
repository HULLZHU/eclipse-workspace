import java.util.*;
public class PE_08_10 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for ( int i = 0; i<matrix.length; i++) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				int temp = Math.round((float)Math.random());
				matrix[i][j] = temp;
			}
		}
		for ( int i= 0; i < matrix.length; i ++ ) {
			for ( int j =0; j < matrix[i].length; j ++ ) {
				System.out.print("  "+ matrix[i][j]);
				if ( j ==3)
					System.out.println("");
			}
		}
		// TODO Auto-generated method stub
		int count = 0;
		int count_=0;
		for ( int i = 0 ; i < matrix.length; i++ ) {
			for ( int j = 0; j <matrix[i].length; j ++ ) {
				if( matrix[i][j]==0)
					count_++;
				else
					count ++ ;
			}
		}
		
		System.out.println("0 count : "+ count_);
		System.out.println("1 count : "+ count);
	}
	
	

}
