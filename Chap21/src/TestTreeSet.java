import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[]args) {
		//create a hash set
		Set<String> set = new HashSet<>();
		
		//add elements
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Bei Jing");
		set.add("New York");
		
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println("Sorted Tree set "+ treeSet);
		
		//use method in SortedSet interface
		System.out.println("first()"+ treeSet.first());
		System.out.println("last():"+treeSet.last());
		System.out.println("headSet NewYork : " + treeSet.headSet("New York"));
		System.out.println("tailSet NewYork :" + treeSet.tailSet("New York"));
		
		
		//use methods in navigable interface
		System.out.println(treeSet.lower("P"));
		System.out.println(treeSet.higher("P"));
		System.out.println(treeSet.floor("P"));
		System.out.println(treeSet.ceiling("P"));
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		System.out.println(treeSet);
	}

}
