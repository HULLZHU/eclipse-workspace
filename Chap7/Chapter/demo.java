package Chapter;

public class demo {

	public static void main(String[] args) {
		int [] list = { 2,4,7,10,11,45,50,59,60,66,69,70,79};
		System.out.println(binarySearch(10,list));
		System.out.println(binarySearch(12,list));
		// TODO Auto-generated method stub
	}

	private static int binarySearch(int key, int[] list) {
		int high = list.length-1;
		int low = 0;
		while ( high >= low) {
			int mid = (high+low)/2;
			if ( list[mid] == key)
				return mid;
			else if ( list[mid]>key)
				high = mid -1;
			else
				low = mid +1;
		}
		// TODO Auto-generated method stub
		return -low -1;
	}

}
