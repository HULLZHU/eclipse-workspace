import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ComparingPerformanceOfListAndSets {
	static final int N = 50000;
	public static void main(String args) {
	//create a ArrayList and add numbers
	List<Integer> list = new ArrayList<>(); 
	for ( int i = 0 ; i < N ; i ++ ) {
		list.add(i);
	}
	Collections.shuffle(list);//shuffle numbers
	
	Collection<Integer> set1 = new HashSet<>(list);
	System.out.println("Test Time for HashSet is : " + getTestTime(set1));
	System.out.println("Remove Time for HashSet is : "+getRemoveTime(set1));
	
	Collection<Integer> set2 = new LinkedHashSet<>(list);
	System.out.println("Test Time for LinkedHashSet: "+getTestTime(set2));
	System.out.println("remove Time for LinkedHashSet:" + getRemoveTime(set2));
	
	Collection<Integer>set3 = new TreeSet<>(list);
	System.out.println("Test Time for TreeSet: "+getTestTime(set3));
	System.out.println("remove time for TreeSet"+getRemoveTime(set3));
	
	Collection<Integer>list1 = new ArrayList<>(list);
	System.out.println("Test Time for ArrayList: "+ getTestTime(list1));
	System.out.println("remove time for ArrayList" + getRemoveTime(list1));
	
	Collection<Integer>list2 = new LinkedList<>(list);
	System.out.println("Test Time for LinkedList：" +getTestTime(list2));
	System.out.println("remove time for LinkedList: "+ getRemoveTime(list2));
	
	}
	private static long getRemoveTime(Collection<Integer> set1) {
		long StartTime = System.currentTimeMillis();
		for ( int i = 0 ; i< N ; i ++)
			set1.remove(i);
		return System.currentTimeMillis() - StartTime;
	}
	private static long getTestTime(Collection<Integer> set1) {
		long startTime = System.currentTimeMillis();
		
		for(int i = 0 ; i < N ; i ++ ) {
			set1.contains((int)Math.random()*2*N);
		}
		
		return System.currentTimeMillis() - startTime;
	}

}
