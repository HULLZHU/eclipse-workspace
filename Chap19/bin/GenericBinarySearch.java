
public class GenericBinarySearch {
	public static void main(String[]args) {
		Integer[] array = {1,2,3,4,5,6,7,8};
		System.out.println(binarySearch(array,4));
	}
	
	public static <E extends Comparable<E>> int binarySearch(E[]array,E key) {
		int low = 0;
		int high = array.length - 1;
		int mid = array.length / 2;
		while ( low < high) {
			if( key.compareTo(array[high])==0)
				return high;
			else if ( key.compareTo(array[low])==0)
				return low;
			else if( array[mid].compareTo(key)==0) {
				return mid;
			}
			
			else if (array[mid].compareTo(key)<0){
				low = mid; 
				mid = (low + high)/2;
			}
			
			else {
				high = mid;
				mid = (high + low)/2;
			}
		}
		return mid;
	}

}
