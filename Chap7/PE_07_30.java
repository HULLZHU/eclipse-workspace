import java.util.*;
public class PE_07_30 {

	public static void main(String[] args) {
		System.out.println("How many numbers do you have.");
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[input.nextInt()];
		System.out.println("Please enter values.");
		for ( int i =0; i < numbers.length; i ++) {
			numbers[i] = input.nextInt();
		}
		boolean isConsecutive = false;
		for ( int i = 0;  i < numbers.length-4; i ++) {
			if ( numbers[i] ==numbers[i + 1]&&numbers[i] ==numbers[i + 2]&&numbers[i] ==numbers[i + 3]) {
				isConsecutive = true;
				break;
			}
		}
		
		if ( isConsecutive) {
			System.out.println("4 Consecutively 4 numbers.");
		}
		else if ( !isConsecutive) {
			System.out.println("Not 4 consecutively same  numbers.");
		}
		// TODO Auto-generated method st
	

	}

}
