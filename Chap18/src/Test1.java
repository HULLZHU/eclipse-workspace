
public class Test1 {
	public static void main(String[] args) {
		System.out.println("Sum is " + xMethod(5));
	}

	private static int xMethod(int i) {
		if (i==1) {
			return 1;
		}
		else {
			return i + xMethod(i-1);
		}
		
		
	}

}
