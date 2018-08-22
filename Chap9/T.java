public class T {
	int e1 = 1;
	int e2 = 2;
	public static void main(String[]args) {
		T t = new T();
		swap(t);
		System.out.println("e1 = " + t.e1 + "e2 = "+t.e2);
	}
	private static void swap(T t) {
		int temp = t.e1;
		t.e1 = t.e2;
		t.e2 = temp;
	}
	
}
