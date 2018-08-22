
public class TestComplexClass {

	public static void main(String[] args) {
		Complex complex = new Complex(3,4);
		System.out.println(complex.abs());
		Complex complex2 = new Complex(2,1);
		Complex complex3 = complex.add(complex2);
	}

}
