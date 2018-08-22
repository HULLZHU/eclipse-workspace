import java.util.*;
public class ShuffuleArrayList {
	public static void main(String[] args) {	
		Integer[] array = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		shuffle(list);
		System.out.println(list.toString());
}

	public static void shuffle(ArrayList<Integer> list) {
		for ( int i = 0 ; i < list.size()*3; i ++ ) {
			int m = (int)(list.size()*Math.random());
			int n = (int)(list.size()*Math.random());
			int temp = list.get(m);
			list.set(m, list.get(n));
			list.set(n, temp);
		}
		
	}
}