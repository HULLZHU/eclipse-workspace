import java.util.*;
public class PE_08_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] matrix = new String[6][7];
		for ( int i = 0; i < matrix.length; i++) {
			for ( int j = 0; j < matrix[i].length;j++) {
				matrix[i][j]= "";
			}
		}
		int blackCount = 0;
		int whiteCount = 0; 
		System.out.println("Enter Y to start game.");
		char playAgain = (input.nextLine()).charAt(0);
		System.out.println("How many rounds do you want to play?");
		int totalCount=0;
		int total = input.nextInt();
		while ( playAgain == 'Y' && totalCount<total) {
			// void all places and start a new game
			refreshTable(matrix);
			printTable(matrix);
			for ( int count = 0; count < 42; count++  ) {
				if ( count%2==0) 
					System.out.println("Where to place the black disk.");
				if ( count%2==1) 
					System.out.println("Where to place the white disk.");
				int x = input.nextInt(), y = input.nextInt();
				// check whether the place is valid or not
				while ( matrix[x][y] != "") {
					System.out.println("This place has been occupied by one another disk, please place again.");
					x = input.nextInt();
					y = input.nextInt();
				}
				// update matrix and display the recently updated one
				matrix=placeDisk(x,y,count,matrix);	
				printTable(matrix);
				//judge the result
				if(blackWin(matrix)) {
					System.out.println("The black player wins.");
					blackCount++;
					break;
				}
				else if (whiteWin(matrix)) {
					System.out.println("The white player wins.");
					whiteCount++;
					break;
				}
				//if neither player wins
				else if(!blackWin(matrix)&&!whiteWin(matrix)&&count==41) {
					System.out.println("Draw.");
					break;
					}
			}
			System.out.println("Enter Y to start Game");
			playAgain = (input.next()).charAt(0);
		}
		System.out.println("Black win count: " + blackCount);
		System.out.println("White win count: " + whiteCount);
		if ( blackCount > whiteCount)
			System.out.println("The black player win");
		else if ( whiteCount > blackCount)
			System.out.println("The white player win.");
		else if ( whiteCount == blackCount)
			System.out.println("Draw");
	}
	private static void refreshTable(String[][] matrix) {
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0; i < matrix[i].length; j ++ ) {
				matrix[i][j] = "";
			}
		}
	}
	private static boolean whiteWin(String[][] matrix) {
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				
			    if ( matrix[i][j].equals("¡ð")) {
				int isConsecutive = 0;
				if ( i<3 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i+addition][j]==matrix[i][j])
							isConsecutive ++;
					}
					}
				if ( isConsecutive==3) {
					return true;
				}
				isConsecutive = 0;
				if ( j<4 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
				}
				if (isConsecutive==3 ) {
					return true;
				}
				isConsecutive = 0;
				if ( i<3 && j < 4 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i+addition][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
					if (isConsecutive==3 ) {
						return true;
					}
					
				}
				isConsecutive = 0;
				if ( i>=3 && j<=3) {
					for ( int addition =1; addition < 4 ; addition ++ ) {
						if ( matrix[i-addition][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
					if (isConsecutive ==3) {
						return true;
					}
				}
			}
			}
		}
		return false;
		}
	private static boolean blackWin(String[][] matrix) {
		for ( int i = 0; i < matrix.length; i ++ ) {
			for ( int j = 0; j < matrix[i].length; j ++ ) {
			    if ( matrix[i][j].equals("¡ñ")) {
				int isConsecutive = 0;
				if ( i<3 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i+addition][j]==matrix[i][j])
							isConsecutive ++;
					}
					}
				if ( isConsecutive==3) {
					return true;
				}
				isConsecutive = 0;
				if ( j<4 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
				}
				if (isConsecutive==3 ) {
					return true;
				}
				isConsecutive = 0;
				if ( i<3 && j < 4 ) {
					for ( int addition =1; addition<4; addition ++ ) {
						if ( matrix[i+addition][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
					if (isConsecutive==3 ) {
						return true;
					}
					
				}			
				isConsecutive = 0;
				if ( i>=3 && j<=3) {
					for ( int addition =1; addition < 4 ; addition ++ ) {
						if ( matrix[i-addition][j+addition]== matrix[i][j])
							isConsecutive ++;
					}
					if (isConsecutive ==3) {
						return true;
					}
				}
			}
			}
		}
		return false;
	}
	private static String[][] placeDisk(int nextInt, int nextInt2,int count,String[][] matrix) {
		if(count%2==0)
			matrix[nextInt][nextInt2] = "¡ñ";
		else 
			matrix[nextInt][nextInt2] = "¡ð";
		return matrix;
	}
	private static void printTable(String[][] matrix) {
		for ( int i = 0; i < matrix.length ; i++ ) {
			System.out.print("|");
			for ( int j = 0; j < matrix[i].length; j ++ ) {
				System.out.printf("%1s",matrix[i][j]);
				System.out.print("|");
				if ( j == 6 ) 
					System.out.println("");
			}
		}
	}
}
