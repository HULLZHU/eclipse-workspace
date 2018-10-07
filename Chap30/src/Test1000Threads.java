import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1000Threads {
	private static int sum = 0 ;
	public static void main(String[]args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for ( int i = 0 ; i < 10000; i ++ ) {
			executor.execute(new AddOneTask());
			System.out.println(" "+ sum);
		} 
		
		executor.shutdown(); 
		
 
	}  
	 
	      
    	private static class AddOneTask implements Runnable{
			@Override
			public void run() {  
				sum += 1; 
			 	System.out.print(sum + " ");
			}
	}
} 
