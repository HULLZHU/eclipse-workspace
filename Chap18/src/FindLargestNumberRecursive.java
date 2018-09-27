import java.util.*;
public class FindLargestNumberRecursive {

	public static void main(String[] args) {
		System.out.println("Please enter 7 integer");
		int[] array = new int[7];
		for ( int i = 0 ; i < array.length ; i ++ ) {
			Scanner input = new Scanner(System.in);
			array[i] = input.nextInt();
		}
		
		for( int i = 0 ; i < array.length ; i ++ ) {
			System.out.print(" " + array[i]);
		}
		
		System.out.println("\n"+findLargest(array));
	}

	private static int findLargest(int[] array) {
		int order = array.length - 1;
		return findLargest(array,order,array[array.length - 1]);
	}

	private static int findLargest(int[] array, int order,int currentMax) {
		if (order == 0)
			return currentMax;
		else {
			order -- ;
			if (array[order] > currentMax) {
				currentMax = array[order];
			}
			return findLargest(array,order,currentMax);
		}
	}

}
