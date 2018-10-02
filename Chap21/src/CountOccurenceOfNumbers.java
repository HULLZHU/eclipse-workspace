import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurenceOfNumbers {
	public static void main(String[]args) {
		System.out.println("Please enter numbers and end up in 0");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int temp = input.nextInt();
		while ( temp !=0) {
			list.add(temp);
			temp = input.nextInt();
		}
		
		System.out.println(list);
		TreeMap<Integer,Integer> map = new TreeMap<>();
		
		for ( int i = 0 ; i < list.size() ; i ++ ) {
			if ( !map.containsKey(list.get(i)))
				map.put(list.get(i), 1);
			else { 
				int value = map.get(list.get(i));
				value ++;
				System.out.println(value);
				map.put(list.get(i), value);
			}
		}  
		 
		 
		int maxValue =map.firstEntry().getValue();
		System.out.println("The max occurrence is "+ maxValue);
		Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
		
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() ==maxValue )
				System.out.println(entry);
		}
	}
}
