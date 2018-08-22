package Chapter;

public class Listing_07_08_selectionSearching {

	public static void main(String[] args) {
		int [] list = { 3,2,4,1,3,4,6,7,8,9,0,11,12,9,2,98,78,14,89};
		selectionSorting(list);
		// TODO Auto-generated method stub

	}

	private static void selectionSorting(int[] list) {
		for (int i = 0; i<list.length-1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for ( int j = i +1; j < list.length; j++) {
				if ( currentMin >list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if ( currentMinIndex!=i) {
				list[currentMinIndex]= list[i];
				list[i]= currentMin;
				
			}
		}
		// TODO Auto-generated method stub
		for ( int e : list) {
			System.out.println(" "+e);
		}
	}

}
