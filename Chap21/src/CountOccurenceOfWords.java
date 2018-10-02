import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurenceOfWords {
	public static void main(String[]args) throws FileNotFoundException {
		Map<String,Integer> treeMap= new TreeMap<>();
		//Set file and input
		try {
		File file = new File("demo.txt");
		Scanner input = new Scanner(file);
		while ( input.hasNext()) {
			String key = input.useDelimiter("[ \n\t\r.,;:!?(){}\"&-/'·–…]").next().toLowerCase();
			if ( !treeMap.containsKey(key) ) {
				treeMap.put(key, 1);
			}
			else {
				int value = treeMap.get(key)+1;
				treeMap.put(key, value);
			}
			
		} 
		
		Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "="+entry.getValue());
		}
		
		}
		catch(Exception ex) {
			System.out.println("");
		}
	}

}
