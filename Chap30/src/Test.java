
public class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("Test");
	}
	public static void main(String[]args) {
		new Test().run();
	}
	

}
     