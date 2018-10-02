import java.util.LinkedHashSet;

public class Demo21_07 {
	public static void main(String []args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("New York");
		LinkedHashSet <String> set2 = set1;
		LinkedHashSet <String> set3 = (LinkedHashSet<String>)(set1.clone());
		set1.add("Atlanta");
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}

}
