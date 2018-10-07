import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelMatrixAddition {
	public static void main(String[]args) {
		//create a list
		final int N = 2000;
		
		double [][] matrix1 = new double[N][N];
		for(int i = 0 ; i< matrix1.length ; i ++ ) {
			for ( int j = 0 ; j < matrix1.length; j ++) {
				matrix1[i][j] = 1;
			}
		}
		
		double [][] matrix2= new double[N][N];
		for ( int i = 0 ; i < matrix2.length; i ++ ) {
			for ( int j = 0 ; j < matrix2[i].length; j ++) {
				matrix2[i][j] = 1;
			}
		}
		
		long startTime = System.currentTimeMillis();
		double [][] result = parallelAddMatrix(matrix1,matrix2);
		long endTime = System.currentTimeMillis();
		System.out.println("The number of Processors is "+Runtime.getRuntime().availableProcessors());
		System.out.println("Time is "+ (endTime - startTime)+ " milliseconds");
		
	}

	private static double[][] parallelAddMatrix(double[][] matrix1, double[][] matrix2) {
		double[][] result = new double[matrix1.length][matrix1[0].length];
		RecursiveAction task = new SumTask(matrix1,matrix2,result);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		return result;
	}
	
	private static  class SumTask extends RecursiveAction{
		private double[][]a;
		private double[][]b;
		private double[][]c;
		
		public SumTask(double[][]a ,double[][]b, double[][]c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		protected void compute() {
			RecursiveAction[] tasks = new RecursiveAction[a.length];
			for ( int i = 0; i<a.length ;i++ )
				tasks[i] = new AddOneRow(i);
			
			//invoke all tasks in the list
			invokeAll(tasks);
		}
		
		private class AddOneRow extends RecursiveAction{
			int i ;
			
			public AddOneRow(int i ) {
				this.i = i;
			}
			@Override
			protected void compute() {
				for ( int j = 0; j <a[0].length; j ++ ) {
					c[i][j] = a[i][j] + b[i][j];
				}
				
			}
			
		}
	}
	 
	
	
	
	
}
