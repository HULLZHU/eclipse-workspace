import java.util.ArrayList;
import java.util.Arrays;
public class ShuffleArrayList {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(new Integer(3+""));
		list.add(new Integer(12+""));
		list.add(new Double(2+""));
		shuffle(list);
		System.out.println(list);
		sort(list);
		System.out.println(list);
	}

	public static void sort(ArrayList<Number> list) {
		Number[] numbers = new Number[list.size()];
		Arrays.sort(numbers);
		list = new ArrayList<>(Arrays.asList(numbers));
	}

	private static void shuffle(ArrayList<Number> list) {
		for ( int i = 0; i < list.size(); i ++ ) {
			int position1 = (int)(3*Math.random());
			int position2 = (int)(3*Math.random());
			Number tempNumber = list.get(position2);
			list.set(position2, list.get(position1));
			list.set(position1, tempNumber);
		}
	}

}
