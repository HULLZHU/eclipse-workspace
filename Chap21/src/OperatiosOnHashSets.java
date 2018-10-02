import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperatiosOnHashSets {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.addAll(Arrays.asList(new String[]{"Jim","George","John","Blake","Michael"}));
		Set<String> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(new String[] {"Jim","Katie","Kevin","Michelle","Ryan"}));
		
		
		Set<String> set3 = new HashSet<>(set1);
		set3.addAll(set2);
		System.out.println(set3);
		
		
		Set<String> set4 = new HashSet<>(set1);
		set4.removeAll(set2);
		System.out.println(set4);
		
		Set<String> set5 = new HashSet<>(set1);
		set5.retainAll(set2);
		System.out.println(set5);

	}

}
