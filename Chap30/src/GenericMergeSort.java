import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class GenericMergeSort {
	public static void main(String[]args) {
		String[] list1 = new String[1000];
		Character[] list2 = new Character[1000]; 
		//
		assignRandomValue(list1);
		assignRandomValue(list2);
		
		//print elements before merge sort
		 for ( String e : list1) {
			 System.out.println(e);
		 } 
		 for ( Character e : list2) {
			 System.out.println(e);
		 }
		 System.out.println("**************************************");
		//create 2 tasks
		ParallelMergeSortTask task1 = new ParallelMergeSortTask(list1); 
		ParallelMergeSortTask task2 = new ParallelMergeSortTask(list2);
		
		// print elements after merge sort
		for ( String e : list1) { 
			 System.out.println(e);
		 }
		 for ( Character e : list2) {
			 System.out.println(e);
		 }
		
		//create a pool to run the task
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task1);
		pool.invoke(task2);
		pool.shutdown();
	}
	private static void assignRandomValue(Character[] list) { 
		for ( int i = 0 ; i  < list.length ; i ++ ) {
			list[i] =(char) ((int)(Math.random()*100));
		}
		
	}
	private static void assignRandomValue(String[] list) {
		for ( int i = 0 ; i < list.length ; i ++)
		list[i] =(char) ((int)(Math.random()*100)) + "";
		
	}
	private static class ParallelMergeSortTask extends RecursiveAction{
		Comparable list[];
		 
		@Override
		protected void compute() {
			parallelMergeSort(list);
		}
		
		ParallelMergeSortTask(Comparable[] list){
			this.list = list;
		}
		
		private static <E extends Comparable<E>> void parallelMergeSort(E []list) {
			final int  THRESHOLD = 100;
			
			if (list.length < 100) {
				Arrays.sort(list);
			}
			
			else {
				Comparable[] leftList = (E[])new Comparable[list.length/2];
				Comparable[] rightList =(E[])new Comparable[list.length/2];
				
				//fork the main task into 2 tasks
				for ( int i = 0 ; i < leftList.length ; i ++ ) {
					leftList[i] = list[i];
				}
				
				for ( int j = 0 ; j < rightList.length ;j ++ ) {
					rightList[j] = list[leftList.length + j];
				}
				
				ParallelMergeSortTask task1 = new ParallelMergeSortTask(leftList);
				ParallelMergeSortTask task2 = new ParallelMergeSortTask(rightList);
				
				//join the result together
				
				for ( int i = 0 ; i < leftList.length ; i ++ ) {
					list[i] = (E) leftList[i];
				}
				
				for ( int j = 0 ; j < rightList.length ; j ++ ) {
					list[leftList.length + j ] = (E) rightList[j];
				}
				
			}
		}
		
	}
	}
