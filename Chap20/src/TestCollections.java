import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TestCollections {
	public static void main(String[]args) {
		Stack<String> collection1 = new Stack<>();
		collection1.add("NewYork");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Mandison");
		
		System.out.println("A list of cities in collection1");
		System.out.println(collection1);
		
		System.out.println("\n Is Dallas in collection1"+ collection1.contains("Dallas"));
		
		collection1.remove("Dallas");
		System.out.println("\n" + collection1.size()+" cities are in collection now");
		
		Collection<String> collection2 = new ArrayList<>();
		collection2.add("Seattle");
		collection2.add("Portland");
		collection2.add("Los Angels");
		collection2.add("Atlanta");
		
		System.out.println("\n A list of cities in collection2");
		System.out.println(collection2);
		
		ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
		c1.addAll(collection2);
		System.out.println("\nCities in collection1 and collection2");
		System.out.println(c1);
		
		c1 = (ArrayList<String>)(collection1.clone());
		c1.retainAll(collection2);
		System.out.println("\n Cities in collection1 and Collection2");
		System.out.println(c1);
		
		c1 = (ArrayList<String>)(collection1.clone());
		c1.removeAll(collection2);
		System.out.println("\n Cities in collection1 but not in 2");
		System.out.println(c1);
		System.out.println(collection1);
		System.out.println(collection2);
	}

}
