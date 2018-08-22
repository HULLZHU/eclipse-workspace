package Chapter;

public class Listing_07_08_decreasing {

	public static void main(String[] args) {
		
		int[] list = { 4,1,2,3,1,5,7};
		selectionSort(list);
		// TODO Auto-generated method stub

	}

	private static void selectionSort(int[] list) {
		for ( int i = 0; i < list.length; i++) {
			int currentMax = list[i];
			int currentMaxIndex = i;
			
			for ( int j = i + 1; j< list.length;j++) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if ( currentMaxIndex != i) {
				list[currentMaxIndex]=list[i];
				list[i]=currentMax;
			}
			
			}
		for ( int e : list) {
			System.out.print(" " + e);
		}
	
		// TODO Auto-generated method stub
		
	}

}
