import java.util.*;
public class PE_07_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 10 integer.");
		int [] array = new int[10];
		for ( int i = 0 ; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		for ( int i = 0 ; i< array.length-1; i ++ ) {
			for ( int j = i + 1;j < array.length;j++) {
				System.out.print("   " +(array[i]+array[j]));
			}
		}
		
		// TODO Auto-generated method stub

	}

}
