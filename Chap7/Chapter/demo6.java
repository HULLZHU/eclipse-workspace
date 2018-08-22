package Chapter;

public class demo6 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		int [] b =reverse(a);
		System.out.println(b);
		System.out.println(a);
		
		// TODO Auto-generated method stub

	}

	private static int[] reverse(int[] a) {
		int[] result = new int [a.length];
		
		for ( int i = 0, j =result.length-1;i < a.length;i++,j--) {
			result[j]= a[i];
		}
		return result;

	}

}
