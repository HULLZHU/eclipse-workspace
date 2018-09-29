import java.util.ArrayList;

public class GenericArrayListMax {
	public static void main(String[]args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("e");
		list.add("a");
		list.add("c");
		list.add("b");
		System.out.println(max(list));
	}

	private static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0);
		for ( int i = 0 ; i < list.size() ; i ++ ) {
			if ( max.compareTo(list.get(i))<0) {
				max = list.get(i);
			}
		}
		return max;
	}

}
