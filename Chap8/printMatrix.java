
public class printMatrix {
	public static void printMatrix( int[][] key) {
		for ( int i = 0 ; i < key.length ; i ++ ) {
			for ( int j = 0; j < key.length ; j ++ ) {
				System.out.print("  " + key[i][j]);
				if ( j == key[i].length-1)
					System.out.println("");
	
			}

		}
	}
	}
