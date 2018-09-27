
public class LoopForFab {
	public static void main(String[]args) {
		int x1 = 0;
		int x2 = 1;
		for ( int i = 0 ; i<= 6 ; i ++) {
			if ( i == 0)
				x2 = 0;
			if ( i == 1)
				x2 = 1;
			else {
				int temp = x2;
				x2 = x2 + x1;
				x1 = temp;
		}
	}
		System.out.println(x2);

}
}
