
public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon oct1 = new Octagon(8);
		Octagon oct2 = (Octagon) oct1.clone();
		System.out.println(oct1.compareTo(oct2));

	}

}
