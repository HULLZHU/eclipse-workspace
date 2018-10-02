import java.util.*;
public class TestTreeSetWithComparator {
	public static void main(String[]args) {
		Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
		set.add(new GeometricObject(20));
		set.add(new GeometricObject(30));
		set.add(new GeometricObject(5));
		set.add(new GeometricObject(15));
		
		
		System.out.println(set);
	}
}
