
public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.setOnAction1(() -> System.out.println("Acttion 1"));
		test.setOnAction2(e -> System.out.print(e + " "));
        System.out.println(test.setOnAction3(e -> e*2));
	}

	private double setOnAction3(T3 t) {
		return t.m(5.5);
	}

	private void setOnAction2(T2 t) {
		t.m(4.5);
	}

	private void setOnAction1(T1 t) {
		t.m();
	}
	
	interface T1 {
		public void m();
	}
	
	interface T2 {
		public void m(Double d);
	}
	
	interface T3{
		public double m(Double d);
	}

}
