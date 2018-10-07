import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedSet {
	private static Set hashSet = Collections.synchronizedSet(new HashSet());
	
	public static void main(String[]args) { 
		Thread thread1 = new Thread(new Task1());
		Thread thread2 = new Thread(new Task2());
		thread1.start();
		thread2.start();
	}
	
	static class Task1 implements Runnable {
	    public void run() {
	      for (int i = 0; i < 10000; i++) {
	        System.out.println("Thread 1");
	        hashSet.clear();
	        hashSet.add(new Integer(i));
	        try { Thread.sleep(1000); } catch (Exception ex) {
	          ex.printStackTrace();
	        } 
	      }
	    }
	  }
	
	 
	
	public void xMethod() {
	synchronized(this) {
	}
	}
	
	static class Task2 implements Runnable{

		@Override
		public void run() {
			while ( true ) {
				System.out.println("Thread 2");
				try {
					Thread.sleep(1000);
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				
				synchronized(hashSet) {
					Iterator iterator = hashSet.iterator();
					while ( iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
			}
			
		}
		
	}
	
}
