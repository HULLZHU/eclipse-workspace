public class PE_07_26 {

	public static void main(String[] args) {
		int[] a = { 1,2,3,4,5,6};
		int [] b = { 1,2,3,4,5,6,7};
		if ( a.length!=b.length) {
			System.out.println("Not strictly identical.");
			System.exit(0);
		}
		boolean identical = true;
		for ( int i = 0; i < a.length; i++ ) {
			if ( a[i] != b[i])
				identical = false;
		}
		
		if ( identical) {
			System.out.println("It is strictly identical.");
		}
		else 
			System.out.println("It is not strictly identical.");
		// TODO Auto-generated method stub

	}

}
