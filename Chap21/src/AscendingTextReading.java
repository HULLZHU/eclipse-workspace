import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AscendingTextReading {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("demo.txt");
		Scanner input = new Scanner(file);
		Set<String> set1 = new TreeSet<>();
		
		while ( input.hasNext()) {
			set1.add(input.next());
		}

		for ( String e : set1) {
			System.out.println(e);
		}
		
		input.close();
	}

}
