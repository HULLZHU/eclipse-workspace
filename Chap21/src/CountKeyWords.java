import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeyWords {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your source file");
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		if ( file.exists()) {
			System.out.println("The number of keyWords in "+ fileName + "  is "+countKeyWords(file));
		}
		else
			System.out.println("please enter a valid file name");
		
	} 

	private static int countKeyWords(File file) throws FileNotFoundException {
		String[]keywords = {"area","I","CQF","get","master","job","add","more","try"};
		Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywords));

		
		int count = 0;
		 
		Scanner input = new Scanner(file);
		while( input.hasNext()) {
			String word = input.next();
			//System.out.println(word);
			if (keywordSet.contains(word))
				count ++;
		}
		input.close();
		return count;
	}
}
