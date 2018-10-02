import java.util.HashSet;
import java.util.Set;

public class TestMethodInCollection {
	/**
	 * @param args
	 */
	public static void main(String[]args) {
		Set<String> set1 = new HashSet<>();
		
		set1.add("London");
		set1.add("Paris");
		set1.add("NewYork");
		set1.add("San Francisco");
		set1.add("BeiJing");
		
		System.out.println("Set1 is "+ set1);
		System.out.println("Set1 size : " + set1.size());
		
		set1.remove("London");
		System.out.println("\nset1 is " +set1);
		System.out.println("set1 size is "+ set1.size());
		
		Set<String> set2 = new HashSet<>();
		set2.add("London");
		set2.add("Shanghai");
		set2.add("Paris");
		System.out.println("\nset2 is " + set2);
		System.out.println(set2.size() + " elements in set2");
		
		System.out.println(set2.contains("Taipei"));
		
		set1.addAll(set2);
		System.out.println("After adding set2 to set1 : "+ set1);
		
		set1.removeAll(set2);
		System.out.println("After removing set2 from set1" + set1);
		
		set1.retainAll(set2);
		System.out.println("The common factor of set1 and set2 is " + set1);
		
		
	}

}
