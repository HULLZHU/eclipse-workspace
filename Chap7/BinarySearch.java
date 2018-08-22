
public class BinarySearch {
	public static int binarySearch( int[]array, int key) {
		int low = 0; 
		int high = array.length - 1;
		for ( ; high >= low ;  ) {
			int mid = ( low + high )/2;
			if ( key < array[mid]) {
				high = mid - 1;
			}
			else if ( key == array[mid])
				return mid;
			else 
				low = mid + 1;
	}
		return -low-1;

}
}
