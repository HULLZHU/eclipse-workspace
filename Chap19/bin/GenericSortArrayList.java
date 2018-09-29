import java.util.ArrayList;

public class GenericSortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(8);
		list.add(6);
		list.add(12);
		sortArrayList(list);
		for ( int i = 0 ; i < list.size(); i ++ ) {
			System.out.print(list.get(i)+" ");
		}

	}
	
	public static <E extends Comparable<E>> void sortArrayList(ArrayList<E> list) {
		for ( int i =0; i < list.size()-1 ; i ++ ) {
			E min = list.get(i);
			int minIndex = i;
			for ( int j = i+1 ; j < list.size(); j ++  ) {
				if (list.get(i).compareTo(list.get(j))>0) {
					minIndex = j;
					min = list.get(j);
				}
			}
			list.set(minIndex, list.get(i));
			list.set(i, min);
		}
	}

}
