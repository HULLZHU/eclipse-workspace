
public class PE_07_16 {

	public static void main(String[] args) {/*
		int[] array = new int[ 100000 ];
		for ( int i = 0 ; i < array.length -1 ; i ++ ) {
			array[i] = (int)(100000*Math.random());
		}
		
		array = selectionSorting.selectionSorting(array);
		int key = array[(int)(100000*Math.random())];
		System.out.println("The index is " +BinarySearch.binarySearch(array, key));*/
		
		int[] list = new int[100000];
	    for (int i = 0; i < list.length; i++) {
	      list[i] = (int)(Math.random() * 1000000);
	    }

	    int key = list[ (int)(100000*Math.random()) ];
	    long startTime = System.currentTimeMillis();
	    System.out.println(LinearSearch.linearSearch(list, key));
	    long endTime = System.currentTimeMillis();
	    long executionTime = endTime - startTime;
	    System.out.println("Execution time for linear search is " +
	                       executionTime);
        list = selectionSorting.selectionSorting(list);
	    java.util.Arrays.sort(list);
	    startTime = System.currentTimeMillis();
	    System.out.println(BinarySearch.binarySearch(list, key));
	    endTime = System.currentTimeMillis();
	    executionTime = endTime - startTime;
	    System.out.println("Execution time for binary search is " +
	                       executionTime);
	}

}
