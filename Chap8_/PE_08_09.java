import java.util.*;
public class PE_08_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [][] matrix = new String[3][3];
		for ( int i = 0 ; i < matrix.length; i++) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				matrix[i][j] = " ";
			}
		}	
		printMatrix(matrix);
		System.out.println("Game Start");
		for ( int i = 0; i < 9 ; i ++ ) {
			if ( i % 2 ==0 ) {
				System.out.println("Place the X");
				int x = input.nextInt(), y = input.nextInt();
				while ( matrix[x-1][y-1] != " ") {
					System.out.println("This place has been occupied, choose again.");
					x = input.nextInt();
					y = input.nextInt();
				}
				matrix[x-1][y-1] = "X";	
			}
			if ( i % 2 != 0) {
				System.out.println("Place the O");
				int x = input.nextInt(), y = input.nextInt();
				while ( matrix[x-1][y-1] != " ") {
					System.out.println("This place has been occupied, choose again.");
					x = input.nextInt();
					y = input.nextInt();
				}
				matrix[x-1][y-1] = "O";
			}
			printMatrix(matrix);
			if ( judgeResult(matrix)==0) {
				System.out.println("X player won");
				System.exit(0);
				}
			else if( judgeResult(matrix)==1){
				System.out.println("O player won.");
				System.exit(0);
			}
			else if ( judgeResult(matrix) ==2) {
				System.out.println("");
				continue;
			}
		}
		System.out.println("Game End.");
	}
	private static int judgeResult(String[][] matrix) {
		if ( xWin(matrix)) {
			return 0;
		}
		else if ( oWin(matrix)) {
			return 1;
		}
		return 2;
		
	}
	private static boolean xWin(String[][] matrix) {
		for ( int i = 0; i<matrix.length; i ++ ) {
			if ( matrix[i][0]=="X"  && matrix[i][1]=="X"&& matrix[i][2]=="X")
					return true;
				else if ( matrix[0][i]=="X"  && matrix[1][i]=="X"&& matrix[2][i]=="X")
					return true;
		}
		if ( matrix[0][0]=="X"&&matrix[1][1]=="X"&&matrix[2][2]=="X") {
			return true;
		}
		if ( matrix[0][2]=="X"&&matrix[1][1]=="X"&&matrix[2][0]=="X") {
			return true;
		}
		return false;
	}
	private static boolean oWin(String[][] matrix) {	
		for ( int i = 0; i<matrix.length; i ++ ) {
				if ( matrix[i][0]=="O"  && matrix[i][1]=="O"&& matrix[i][2]=="O")
					return true;
				else if ( matrix[0][i]=="O"  && matrix[1][i]=="O"&& matrix[2][i]=="O")
					return true;
		}	
		if ( matrix[0][0]=="O"&&matrix[1][1]=="O"&&matrix[2][2]=="O") {
			return true;
		}
		if ( matrix[0][2]=="O"&&matrix[1][1]=="O"&&matrix[2][0]=="O") {
			return true;
		}
		return false;
	}
	private static void printMatrix(String[][] matrix) {
		System.out.println("--------------");
		for ( int i = 0 ; i < matrix.length ; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				System.out.print("|");
				System.out.printf("%3s",matrix[i][j]);
				if ( j == matrix[i].length-1) {
					System.out.println("|");
					System.out.println("--------------");
				}
			}		
		}
	}
}
