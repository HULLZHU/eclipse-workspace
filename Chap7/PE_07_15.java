import java.util.*;
public class PE_07_15 {

	public static void main(String[] args) {
		System.out.println("Please input several numbers.");
		Scanner input = new Scanner(System.in);
		int[] numbers  = new int [ 10 ];
		for ( int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The original array is :");
		for ( int e : numbers) {
			System.out.print("  " +e);
		}
		System.out.print("The modified array is :"  );
		for ( int e : sorting( numbers)) {
			System.out.print("  "+e);
		}

	}

	private static int[] sorting(int[] numbers) {
		final int continueValue = 999999;
		for ( int i = 0; i < numbers.length-1; i++) {
			for ( int j = i+1; j< numbers.length; j++) {
				if ( numbers[j]!= continueValue) {
					if ( numbers[i]==numbers[j])
						numbers[j]= continueValue;
						
				}
				else
					continue;
			}
		}
		
		int length = 0;
		for ( int i =0; i< numbers.length;i++) {
			if ( numbers[i] != continueValue)
				length++;
		}
		
		int[] modifiedArray = new int [ length];
		
		for ( int i = 0, j = 0; i < length && j < numbers.length; j++) {
			if ( numbers[j]!=continueValue) {
				modifiedArray[i] = numbers[j];
				i++;
			}
		
		}
		return modifiedArray;
	}

}
