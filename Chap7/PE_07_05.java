import java.util.*;
public class PE_07_05 {

	public static void main(String[] args) {
		System.out.println("Please input a series of numbers.");
		Scanner input = new Scanner (System.in);
		int[] Array = new int[10];
		for ( int i =0,j=0; i<Array.length;i++) {
			int num = input.nextInt();
			if (!isInArray(num,Array)) {
				Array[j]=num;
				j++;
			}
		}
		
		for ( int i =0 ; i<Array.length;i++) {
			if ( Array[i]!=0)
				System.out.print(" " + Array[i]);
		}
		// TODO Auto-generated method stub

	}

	private static boolean isInArray(int num, int[] array) {
		for ( int i =0 ; i <array.length;i++) {
			if (num == array[i])
				return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
