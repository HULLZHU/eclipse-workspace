import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountConsonantsandVowels {
	public static void main(String[]args) {
		
		try {
			File file = new File("demo.txt");
			Scanner input = new Scanner(file);
			TreeMap<String,Integer> treeMap = new TreeMap<>();
			treeMap.put("A", 0);
			treeMap.put("E", 0);
			treeMap.put("I", 0);
			treeMap.put("O", 0);
			treeMap.put("U", 0);
			
			while ( input.hasNext() ) {
				String str = input.next().toUpperCase();
				for ( int i = 0 ; i < str.length() ; i ++ ) {
					if(str.charAt(i) == 'A' || str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
						int value = treeMap.get(str.charAt(i)+"")+1;
						treeMap.put(str.charAt(i)+"", value);
					}
				}
			}
			
			Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet();
			
			for ( Map.Entry<String, Integer> e : entrySet) {
				System.out.println(e);
			}
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
