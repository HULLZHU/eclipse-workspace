import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
	public static void main(String[]args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("red");
		list1.add("yellow");
		list1.add("green");
		list2.add("red");
		list2.add("yellow");
		list2.add("blue");
		list1.retainAll(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		List<String> list3 = new ArrayList<>();
		list3.add("hello");
		System.out.println(list3.size());
		list3.remove("hello");
		System.out.println(list3.size());
	}

}
