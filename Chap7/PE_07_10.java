import java.util.*;
public class PE_07_10 {

	public static void main(String[] args) {
		System.out.println("Please input several numbers and prompt -9999 to stop loop");
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int length=0;
		for ( int i = 0; i < 100 ; i++) {
			int temp = input.nextInt();
			if (temp == -9999)
				break;
			array[i]=temp;
			length ++ ;
		}
		
		int [] list = new int[length];
		for ( int i = 0; i < length; i++) {
			list[i]= array[i];
		}
		
		int currentMin = array[0];
		int currentIndex = 0;
		for ( int i = 0 ; i< length; i++) {
			if (list[i]< currentMin) {
				currentMin = list[i];
				currentIndex = i;
			}
		}
		
		System.out.println("The minimun number is"+ currentMin+ " and the index is "+currentIndex );
	
		// TODO Auto-generated method stub

	}

}
