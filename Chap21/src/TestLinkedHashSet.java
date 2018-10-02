import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
	public static void main(String[]args) {
		//create a hash set
		Set<String> set = new LinkedHashSet<>();
		
		//add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Bei Jing");
		set.add("New York");
		
		System.out.println(set);
		
		for (String e : set) {
			System.out.print(e.toUpperCase() + " ");
		}
	}

}
