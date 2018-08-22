package Chapter;
import java.util.*;
public class Listing_07_08_Modified {

	public static void main(String[] args) {
		System.out.println("How many numbers do you want to input?");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		System.out.println("Please input numbers");
		int[] list = new int[length];
		for (int i = 0; i < list.length; i++) {
			list[i]= input.nextInt();
		}
		System.out.println("The array is : ");
		for ( int e: list) {
			System.out.print(" "+e);
		}
		System.out.println("");
		
		selectionSorting(list);
		// TODO Auto-generated method stub

	}

	private static void selectionSorting(int[] list) {
		for ( int i = 0; i < list.length; i++) {
			int tempMin = list[i];
			int tempMinIndex = i;
			
			for ( int j = i + 1; j < list.length;j ++) {
				if ( tempMin > list[j]) {
					tempMin = list[j];
					tempMinIndex = j;
				}
			}
			//交换数组中最小和剩余数组首位的数值
			if ( tempMinIndex!= i) {
				list[tempMinIndex]=list[i];
				list[i]= tempMin;
			}
		}
		for ( int e : list) {
			System.out.print(" " + e);
		}
		// TODO Auto-generated method stub
		
	}
	

}
