import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[]args) {
		Map<String,Integer> hashMap = new HashMap();
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 31);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);
		System.out.println("For HashMap"+hashMap);
		
		Map<String,Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println("For TreeMap:" + treeMap);
		
		Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
		linkedHashMap.putAll(hashMap);
		System.out.println("Lewis: "+ linkedHashMap.get("Lewis"));
		
		System.out.println("LinkedHashMap : "+linkedHashMap);
		
		Set set = linkedHashMap.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
