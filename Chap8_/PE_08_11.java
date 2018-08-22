import java.util.*;
public class PE_08_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number between 0 and 511.");
		int number = input.nextInt();
		String binaryString = "";
		while ( number != 0 ) {
			binaryString = number%2 + binaryString;
			number = number/2;
		}
		System.out.println("The binary number is : " + binaryString);
		char[][] matrix = new char[3][3];
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				matrix[i][j] = 'H';
			}
		}
		int temp = binaryString.length();
		for ( int i = matrix.length-1; i >= 0 ; i --) {
			for ( int j = matrix[i].length -1 ; j >= 0&&temp>=1; j--) {
				matrix[i][j] = binaryString.charAt(temp-1);
				temp --;
			}
		}
		
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix.length ; j ++ ) {
				if ( matrix[i][j] =='0')
					matrix[i][j] = 'H';
				if ( matrix[i][j]== '1')
						matrix[i][j] = 'T';
			}
		}
		
		for ( int i = 0 ; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				System.out.print(" "+ matrix[i][j] );
				if ( j == 2)
					System.out.println("");
			}
		}
		// TODO Auto-generated method stub

	}

}
