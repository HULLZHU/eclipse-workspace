import java.util.*;
public class PE_07_09 {

	public static void main(String[] args) {
		int [] array = new int[10];
		System.out.println("Please input 10 numbers");
		Scanner input = new Scanner(System.in);
		
		for ( int i = 0; i < 10 ; i++) {
			array[i]= input.nextInt();
		}
		
		System.out.println("The minimum number is " + min(array));
		// TODO Auto-generated method stub

	}

	private static int min(int[] array) {
		int currentMin =array[0];
		for (int i=0 ; i < 10 ; i ++) {
			if (array[i]<currentMin)
				currentMin = array[i];
		}
		return currentMin;
	}

}
