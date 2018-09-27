

public class Test4 {
	public static void main(String[]args) {
		xMethod(5);
	}

	private static void xMethod(int i) {
		if ( i > 0 ) {
			xMethod( i - 1 );
			System.out.println(i);
		}
	}

}
