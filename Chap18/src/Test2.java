
public class Test2 {
	public static void main(String[] args) {
		xMethod(1234567);
	}

	private static void xMethod(int i) {
		if ( i>0) {
			System.out.println(i % 10);
			xMethod(i /10);
		}
		
	}

}
