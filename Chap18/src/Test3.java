
public class Test3 {
	public static void main(String[]args) {
		xMethod(5);
	}

	private static void xMethod(int n) {
		if ( n > 0 ) {
			System.out.println(n + " ");
			xMethod(n-1);
		}
		
	}

}
