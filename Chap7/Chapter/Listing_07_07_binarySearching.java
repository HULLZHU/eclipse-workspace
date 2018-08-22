package Chapter;

public class Listing_07_07_binarySearching {

	public static void main(String[] args) {
		int [] list = { 2,4,7,10,11,45,50,59,60,66,69,70,79};
		int key = 11;
		System.out.println(binarySearch(list,key));
		// TODO Auto-generated method stub

	}

	private static int binarySearch(int[] list, int key) {
		int high = list.length-1;
		int low = 0;
		while ( high>=low) {
			int mid = (low+high)/2;
			if( key <list[mid])
				high = mid - 1;
			else if ( key == list[mid])
				return mid;
			else 
				low = mid + 1;
		}
		return -low -1;
		// TODO Auto-generated method stub
		
	}

}
