import java.util.*;
public class DemoTest {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Dallas");
		myList.add("Dallas");
		myList.add("Houston");
		for ( int i = 0; i < myList.size(); i ++ )
			myList.remove("Dallas");
		System.out.println(myList.toString());
		ArrayList<Double> myList2 = new ArrayList<>();
		myList2.add((double) 1);
		
		Integer[] array = { 3,5,95,4,15,34,3,6,5};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
	}

}
