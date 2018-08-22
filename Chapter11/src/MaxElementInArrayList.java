import java.util.*;
public class MaxElementInArrayList {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,3,4,5,4,3,2};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		int maxNum = max(list);
		System.out.println(maxNum);
		Integer[] newArray = new Integer[list.size()];
		Collections.sort(list);
		newArray = list.toArray(newArray);
		
		for ( int e : newArray) {
			System.out.print(" " + e);
		}
	}

	private static int max(ArrayList<Integer> list) {
		int tempMax = list.get(0);
		for ( int i = 0; i < list.size(); i ++ ) {
			if ( tempMax < list.get(i))
				tempMax = list.get(i);
		}
		return tempMax;
	}

}
