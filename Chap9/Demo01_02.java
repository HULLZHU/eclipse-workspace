
public class Demo01_02 {
	public static void main(String[] args) {
		int[] a = { 1, 2} ;
		swap(a);
		System.out.println("a[0]= " + a[0] +", a[1]="+a[1]);
	}

	private static void swap(int[] a) {
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}

}
