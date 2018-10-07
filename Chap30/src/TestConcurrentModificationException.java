import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestConcurrentModificationException {
	private static Set<Integer> hashSet = new HashSet<Integer>();
	private static Lock lock = new ReentrantLock();
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new AddOneNumberTask());
		executor.execute(new TraverseTask());
		executor.shutdown();
	}
	
	private static class AddOneNumberTask implements Runnable{
		Condition isNotEmptyCondition = lock.newCondition();
		@Override
		public void run() {
			lock.lock();
			while ( true ) {
				hashSet.add((int)(Math.random()*100));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					lock.unlock();
				}
				isNotEmptyCondition.signalAll(); 
			}
		}
		
	}
	
	private static class TraverseTask implements Runnable{
		//Iterator iterator = hashSet.iterator();
		Condition isEmptyCondition = lock.newCondition();
		@Override
		public void run() {
			lock.lock();
			while ( true ) { 
				while ( hashSet.isEmpty())
					try {
						System.out.print("Awaiting for new number");
						isEmptyCondition.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				finally {
					System.out.println(hashSet);
					hashSet.clear();
					lock.unlock();
				}
			}
			
		}
		
	}
	

}
