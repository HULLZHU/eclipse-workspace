import java.util.HashSet;
import java.util.Set;

public class Demo1 {
	public static void main(String[]args) {
		Set<String> set1 = new HashSet();
		Set<String> set2 = new HashSet();
		
		set1.add("red");
		set1.add("yellow");
		set1.add("green");
		
		set2.add("red");
		set2.add("yellow");
		set2.add("blue");
		
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println(set2 + "\n");
		
		set1.removeAll(set2);
		System.out.println(set1);
		System.out.println(set2+"\n");
		
		set1.retainAll(set2);
		System.out.println(set1);
		System.out.println(set2 + "\n");
		
		set1.clear();
		System.out.println(set1);
	}

}
