import java.util.*;
public class PE_07_18 {

	public static void main(String[] args) {
		System.out.println("Please input ten numbers.");
		int [] array = new int[10];
		Scanner input = new Scanner(System.in);
		for ( int i =0 ; i < array.length;i++)
			array[i] = input.nextInt();
		for (int e : array)
			System.out.printf("%5d" ,e);
		System.out.println("The list after the sorting process is " );
		int [] array1 = bubbleSort(array);
		for ( int e : array1) {
			System.out.printf("%5d",e);
		}
		// TODO Auto-generated method stub

	}



	private static int[] bubbleSort(int[] array) {
		int array1[] = new int[array.length];
		boolean inOrder = false;
		/////////////////////////////
		while ( !inOrder ) {
			inOrder = true;
			for ( int i = 0 ; i<array.length-1; i++) {
				if ( array[i]> array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					inOrder = false;
				}
			}
		}
		///////////////////////////////////
		for ( int i = 0; i < array.length; i++) {
			array1[i]= array[i];
		}
		return array1;
	}

}
