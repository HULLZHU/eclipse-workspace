import java.util.*;
public class PE_07_02 {

	public static void main(String[] args) { 
		System.out.println("Please input 10 integer.");
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for( int i =0 ; i< numbers.length;i++) {
			numbers[i]=input.nextInt();
		}
		
		int[] array = reverse(numbers);
		for (int e : array)
			System.out.print("   " +e);
		// TODO Auto-generated method stub

	}

	private static int[] reverse(int[] numbers) {
		int[] array = new int[numbers.length];
		
		for ( int i = 0; i < array.length;i++) {
			array [i] = numbers[numbers.length-1-i];
		}
		
		return array;
		
	}

}
