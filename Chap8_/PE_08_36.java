import java.util.*;
public class PE_08_36 {

	public static void main(String[] args) {
		// read solution
		System.out.println("Enter number n .");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char[][] latinSquare = new char[size][size];
		System.out.println("Please enter "+ size+"rows of letter");
		for ( int i = 0; i < latinSquare.length; i++ ) {
			for ( int j = 0; j < latinSquare[i].length; j ++ )
				latinSquare[i][j] = input.next().charAt(0);
		}
		// judge is valid or not
		if ( isValidLatinSquare(latinSquare))
			System.out.println("The input array is a Latin square.");
		else
			System.out.println("The input array is not a Latin square.");
	}

	private static boolean isValidLatinSquare(char[][] latinSquare) {
		for ( int i = 0; i < latinSquare.length; i ++ ) {
			for ( int j = 0; j < latinSquare.length; j ++ ) {
				//判断方阵中的所有元素是否均在允许取值范围内&&进一步判断各元素在列、行上的独立性
				if ( (latinSquare[i][j]<='Z'&&latinSquare[i][j]>='A'|| latinSquare[i][j]>='a'&&latinSquare[i][j]<='z')&&isValidLatinSquare(latinSquare,i,j))
					return true;
			}
		}
		return false;
	}

	private static boolean isValidLatinSquare(char[][] latinSquare, int i, int j) {
		//判断行
		for ( int column = 0; column < latinSquare.length; column++ ) {
			if (latinSquare[i][column]==latinSquare[i][j]&& j != column )
				return false;
		}
		//判断列
		for ( int row = 0; row < latinSquare.length; row ++ ) {
			if ( latinSquare[row][j]==latinSquare[i][j]&&i != row )
				return false;
		}
		return true;
	}

}
