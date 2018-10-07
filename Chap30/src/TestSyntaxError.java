
public class TestSyntaxError implements Runnable {
	public static void main(String[]args) throws InterruptedException {
		new TestSyntaxError();
	}
	
	public TestSyntaxError () throws InterruptedException {
		Thread thread = new Thread(this);
		thread.sleep(1000);
		thread.run();
	}

	@Override
	public void run() {
		System.out.println("hello");
	}

}
  