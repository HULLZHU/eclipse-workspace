
public class A1 {
	public static void main(String args[]) {
		new A1();
		new B1();
	}
	int i = 7;
	public A1() {
		setI(20);
		System.out.println("I from A is "+ i );
	}
	public void setI(int j) {
		this.i = 2*j ;
	}

}

