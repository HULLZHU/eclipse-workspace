
public class Test2 implements Runnable {
	public static void main(String[]args) {
		new Test2();
	}
	
	public Test2() {
		Thread t = new Thread(this);
		t.start();
 	    t.start();
	}

	@Override
	public void run() {
		System.out.println("test"); 
		
	}

}
 