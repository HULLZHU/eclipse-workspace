import java.util.*;
public class SortArrayList {
	public static void main(String args[]) {
	Integer[] array= {7,1,2,3,4,5,6};
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); 
	Collections.sort(list);
	System.out.println(list.toString());
	}
}
