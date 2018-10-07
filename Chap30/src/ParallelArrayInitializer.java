import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelArrayInitializer {
	public static void main(String[]args) {
		final int N = 900; 
		int [] list = new int [N];
		
		long time1 = System.currentTimeMillis();
		parallelArrayInitialize(list);
		long time2 = System.currentTimeMillis();
		/*display*/
		for ( int i = 0 ; i<list.length ; i ++ ) {
			System.out.println(list[i]);
		}
		 
		long time3 = System.currentTimeMillis();
		for ( int i = 0 ; i < list.length ; i ++ ) {
			list[i] = new Random().nextInt();
		}
		long time4 = System.currentTimeMillis();
		
		System.out.println("Parallel : "+ (time2 - time1));
		System.out.println("Sequential : "+ (time4 - time2));
	}

	private static void parallelArrayInitialize(int[] list) {
		RecursiveAction mainTask = new ParallelArrayInitializeTask(list);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(mainTask);
	}
	
	private static class ParallelArrayInitializeTask extends RecursiveAction{
		private int[] list;
		final int THRESHOLD = 100;
		 
		ParallelArrayInitializeTask(int[]list){
			this.list = list;
		}
		
		@Override
		protected void compute() {
			if (list.length < THRESHOLD) {
				assignValues(list);
			}
			
			else {
				int[] firstHalf = new int[list.length/2];
				int[] secondHalf = new int[list.length / 2];  
				
				this.invokeAll(new ParallelArrayInitializeTask(firstHalf),new ParallelArrayInitializeTask(secondHalf));
				 
				for ( int i = 0 ; i < firstHalf.length ; i ++ ) {
					list[i] = firstHalf[i];
				}
				
				for ( int j = firstHalf.length; j <firstHalf.length + secondHalf.length ; j ++) {
					list[j] = secondHalf[j-firstHalf.length];
				}
			}
		} 

		private void assignValues(int[] list) {
			for ( int i = 0 ; i < list.length ; i ++ ) {
				list[i] = new Random().nextInt();
			}
		}
		
	}
}
