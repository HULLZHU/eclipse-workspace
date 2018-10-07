import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerProducer {
	private static Buffer buffer = new Buffer();
	
	public static void main(String[]args) {
		//create an executor pool
		ExecutorService executor = Executors.newFixedThreadPool(2);
		//use this executor pool to run two task
		//please remember the task must be class extending Runnable and overriding the run() method
		executor.execute(new ProducerTask());
		executor.execute(new ConsumerTask());
		executor.shutdown();
	}
	
	private static class ProducerTask implements Runnable{

		@Override
		public void run() {
			try {
				int i =1;
				while ( true ) {
					System.out.println("Producer writes "+ i);
					buffer.write(i ++ );
					//put the thread into sleep 
					Thread.sleep((int)Math.random() * 100000);
				}
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}	
		}
	}
	
	private static class ConsumerTask implements Runnable{

		@Override
		public void run() {
			try {
				while(true) {
					System.out.println("Consumer reads "+ buffer.read());
					Thread.sleep((int)Math.random()*100000);
				}
			}
			
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
		}
		
	}
	
	private static class Buffer{
		private static final int CAPACITY=1;
		private LinkedList<Integer> queue = new LinkedList<Integer>();
		private static Lock lock = new ReentrantLock();
		
		//create 2 condition
		//These 2 condition are bound to the whole class scope 
		//the communication between these 2 condition control the read and write of the Buffer
		private static Condition notEmpty = lock.newCondition();
		private static Condition notFull  = lock.newCondition();
		
		public void write(int value) throws InterruptedException {
			lock.lock();
			try {
				while (queue.size() == CAPACITY) {
					System.out.println("Wait for notfull condition");
					notFull.await();
				}
				
				queue.offer(value);
				
				notEmpty.signal();
			}
			finally {
				lock.unlock();
			}
		}
		
		public int read() {
			int value = 0 ;
			lock.lock();
			try {
				while (queue.isEmpty()) {
					System.out.println("wait for notEmpty Condition");
					notEmpty.await();
				}
				
				value = queue.remove();
				notFull.signal();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			finally {
				lock.unlock();
				return value;
			} 
			
		}
	}

}
