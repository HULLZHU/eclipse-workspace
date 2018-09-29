import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo20_09 {
	public static void main(String[]args) {
		List<String>list = Arrays.asList("yellow","red","green","blue");
		Collections.reverse(list);
		System.out.println(list);
		
		List<String> list1 = Arrays.asList("yellow","red","green","blue"); 
		List<String> list2  = Arrays.asList("white","black");
		Collections.copy(list1, list2);
		System.out.println(list1);
		System.out.println(list2);
		
		Collection<String> c1 = Arrays.asList("red","cyan");
		Collection<String> c2 = Arrays.asList("red","blue");
		Collection<String> c3 = Arrays.asList("pink","tan");
		System.out.println(Collections.disjoint(c1, c2));
		System.out.println(Collections.disjoint(c1, c3));
		
		Collection<String> collection = Arrays.asList("red","cyan","red");
		
		System.out.println(Collections.frequency(collection, "red"));
		
	}

}
