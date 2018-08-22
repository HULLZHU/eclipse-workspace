import java.util.*;
public class PE_07_19 {

	public static void main(String[] args) {
		System.out.println("How many numbers do you want to enter");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int array[] = new int[num];
		for ( int i = 0; i < num ; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println("isSorted:"+ isSorted(array));
		
		// TODO Auto-generated method stub

	}

	private static boolean isSorted(int[] array) {
		boolean isSorted = true;
		for ( int i = 0; i < array.length-1; i++) {
			if ( array[i] > array[i+1])
				isSorted = false;
		}
		return isSorted;
		
	}

}
