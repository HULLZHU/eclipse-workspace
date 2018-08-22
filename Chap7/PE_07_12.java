import java.util.*;
public class PE_07_12 {

	public static void main(String[] args) {
		System.out.println("Please input 10 numbers");
		int [] array = new int[10];
		Scanner input = new Scanner(System.in);
		for ( int i = 0 ; i < 10 ; i ++) {
			array [ i ]= input.nextInt();
		}
		
		for ( int i = 0 ; i < 4 ; i ++) {
			int temp = array[i];
			array[i] = array[ 9 -i];
			array[9 - i] = temp;
		}
		
		for ( int e : array) {
			System.out.print("  " + e);
		}
		// TODO Auto-generated method stub

	}

}
