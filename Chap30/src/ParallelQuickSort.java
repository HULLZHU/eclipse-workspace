import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
 
public class ParallelQuickSort {
	public static void main(String[] args) {
		//create the list
		final int N = 100000;  
		int[] numbers  =  new int[N];
		//create a new RecursiveAction object
		
		for ( int i = 0 ; i < N ; i ++ ) {
			numbers[i] = (int) (10000*Math.random());
		}
		
		ForkJoinPool pool = new ForkJoinPool();
		//now execute task	
		RecursiveAction quickSort = new QuickSortTask(numbers);
		pool.execute(quickSort);
		pool.shutdown();
		
		for ( int i = 0 ; i < numbers.length ; i ++ ) {
			if ( (i+1)%10 == 0)
				System.out.println(" " + numbers[i]);
			else
				System.out.print(" " + numbers[i]);
		} 
	 

	} 
	
	
	private static class AssignRandomValue extends RecursiveAction{
		int [] list;
		final int THRESHOLD = 100;
		
		AssignRandomValue(int []numbers){
			list = numbers;
		}
		 
		 
		@Override
		protected void compute() {
			if ( list.length < THRESHOLD ) {
				for ( int i = 0 ; i < list.length ; i ++ ) {
					list[i] = new Random().nextInt();
				}
			}
			
			else {
				//create 2 list
				int [] left = new int[list.length/2];
				int [] right = new int[list.length/2];
				//assign value to 2 list
				for ( int i = 0 ; i < left.length ; i ++ ) {
					left[i] = list[i];
				}
				 
				for ( int j = 0 ; j < right.length ; j ++ ) {
					right[j] = list[j+left.length];
				}
				
				invokeAll(new AssignRandomValue(left),new AssignRandomValue(right));
				 
				//combine 2 list into 1
				for ( int i = 0 ; i < left.length ; i ++ ) {
					list[i] = left[i];
				}
				
				for ( int j = 0 ; j < right.length ; j ++ ) {
					list[left.length +j] = right[j];
				}
				 
			}
		}
		
	}
	
	private static class QuickSortTask extends RecursiveAction {
		int [] list;
		
		QuickSortTask(int [] list){
			this.list = list;
		}

		@Override
		protected void compute() {
			if ( list.length < 100 ) {
				Arrays.sort(list);
			}
			else {
				//create 2 list
				int [] left = new int[list.length/2];
				int [] right = new int[list.length/2];
				//assign value to 2 list
				for ( int i = 0 ; i < left.length ; i ++ ) {
					left[i] = list[i];
				}
				 
				for ( int j = 0 ; j < right.length ; j ++ ) {
					right[j] = list[j+left.length];
				} 
				
				invokeAll(new QuickSortTask(left),new QuickSortTask(right));
				 
				//combine 2 list into 1
				for ( int i = 0 ; i < left.length ; i ++ ) {
					list[i] = left[i];
				}
				
				for ( int j = 0 ; j < right.length ; j ++ ) {
					list[left.length +j] = right[j];
				}
			
		}
		
		
	}

}
}
