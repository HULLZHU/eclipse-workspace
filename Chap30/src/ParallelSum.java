import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;


public class ParallelSum {
	public static void main(String[]args) {
		final int N = 9000000;
		double [] list = new double[N];
		
		for ( int i = 0; i < list.length ; i ++ )
			list[i] = (int)(Math.random()*100);
		
		RecursiveTask task = new ParallelSumTask(list);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = (Double) pool.invoke(task);
		System.out.println(sum);
		
	} 
	 
	
	private static class ParallelSumTask extends RecursiveTask<Double>{
		double list[] ;
		
		public ParallelSumTask(double[] list) {
			this.list = list;
		}

		@Override
		protected Double compute() {
			
			double result = 0 ;
			//if the elements in the list is less than 100, directly get sum
			if ( list.length < 100) {
				for ( int i = 0 ; i < list.length ; i ++ ) {
					result += list[i];
				}
				return result;
			}
			//else we use fork and join
			else {
				//create 2 list
				double[] leftList = new double[list.length/2];
				double [] rightList = new double[list.length/2];
				//assign value to 2 list
				for ( int i = 0 ; i < leftList.length ; i ++ ) {
					leftList[i] = list[i];
				}
				 
				for ( int j = 0 ; j < rightList.length ; j ++ ) {
					rightList[j] = list[j+leftList.length];
				} 
				
				RecursiveTask<Double> left = new ParallelSumTask(leftList);
				RecursiveTask<Double> right = new ParallelSumTask(rightList);
				left.fork();
				right.fork();
				
				return left.join().doubleValue()+ right.join().doubleValue();
					
			}
			
			
		}
	}

}
