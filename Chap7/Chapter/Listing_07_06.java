package Chapter;
import java.util.*;
public class Listing_07_06 {

	public static void main(String[] args) {
		System.out.println("please input the key number you wanna to search");
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		int [] myList = { 1,4,4,2,5,-3,6,2};
		int index = linearSearch(myList,key);
		System.out.println(index);
		// TODO Auto-generated method stub

	}

	private static int linearSearch(int[] myList, int key) {
		for (int i =0; i< myList.length;i++) {
			if (key == myList[i])
				return i;
		}
		// TODO Auto-generated method stub
		return -1;
	}

}
