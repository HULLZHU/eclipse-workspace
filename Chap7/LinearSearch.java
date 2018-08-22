
public class LinearSearch {
	public static int linearSearch( int [] array, int key) {
		for ( int i = 0; i < array.length -1 ; i ++ ) {
			if ( key == array [i]) {
				return i ;
			}
		}
		return -1;
		
	}

}
