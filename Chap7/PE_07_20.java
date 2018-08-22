import java.util.*;
public class PE_07_20 {

	public static void main(String[] args) {
		System.out.println("How many numbers do you want to input?");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] array = new int[num];
		System.out.println("Please input numbers.");
		for ( int i = 0; i< array.length;i++) {
			array[i] = input.nextInt();
		}
		for ( int i = 0 ; i < array.length-1; i++) {
			int currentMax = array[i];
			int currentMaxIndex = i;
			for ( int j = i + 1; j<array.length;j ++ ) {
				if ( currentMax < array[j]) {
					currentMax = array[j];
					currentMaxIndex = j;
				}
			}
			
			
				array[currentMaxIndex] = array[i];
				array [i]= currentMax; 
				
			
		}
		
		for ( int e : array)
			System.out.printf("%5d", e);
			
	}

}
