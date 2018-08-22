
public class PE_07_16_LinearSearching {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int [] array = new int[100000];
		// generate a random array
		for ( int i = 0 ; i < 100000; i++) {
			array[i] = (int)(100000*Math.random());
		}
		//determine the key number
		int key = array[(int)(100000*Math.random())];
		for ( int i = 0; i < 100000; i ++ ) {
			if ( array[i]== key) {
				System.out.println("The index is " + i);
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("The execution time is " + (endTime - startTime));

	}

}
