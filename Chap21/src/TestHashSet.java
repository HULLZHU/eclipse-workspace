import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[]args) {
		Set<String> set = new HashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("BeiJing");
		set.add("New York");
		
		System.out.println(set);
		for (String e : set) {
			System.out.print(e.toUpperCase()+ " ");
		}
		
	}

}
