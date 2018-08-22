
public class selectionSorting {
	public static int[] selectionSorting( int[] array) {
		for ( int i = 0 ; i < array.length - 1; i ++ ) {
			int currentMin = array[i];
			int currentIndex = i;
			for ( int j = i + 1; j < array.length; j ++ ) {
				if ( currentMin < array [j] ) {
					currentMin = array[j];
					currentIndex = j;
				}
			}
			// swap the position
			if ( currentIndex != i ) {
				array[currentIndex] = array[i];
				array [i] = currentMin;
			}
			
			
		}
		return array;
	}

}
