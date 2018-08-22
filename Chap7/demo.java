
public class demo {
	public static void main(String [] args) {
		int [] array = new int[10000];
		for ( int i = 0 ; i< 10000; i ++) {
			array[i] = (int)(10000*Math.random());
		}
		for ( int i = 0 ; i < array.length; i ++)
		System.out.println(array[i]);
	}

}
