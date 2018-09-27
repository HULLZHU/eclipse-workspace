
public class RecursiveSelectionSort {
	public static void sort(double[] list) {
		sort(list,0,list.length - 1);
	}

	private static void sort(double[] list, int low, int high) {
		if ( low < high) {
			int indexOfMin = low;
			double min  = list [low];
			for ( int i = low + 1; i <= high ;i ++) {
				if(list[i]<min) {
					min = list[i];
					indexOfMin = i ;
				}
			}
			
			//swap the smallest in list
			list[indexOfMin] = list[low];
			list[low] = min;
			
			//sort the remainning list
			sort (list,low + 1, high);
		}
		
	}

}
