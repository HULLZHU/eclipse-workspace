import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class GetWordsFormEssay2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name.");
		File sourceFile = new File (input.nextLine());
		if (sourceFile.exists())
			System.out.println("Successfully find the file.");
		try(Scanner inputIO = new Scanner(sourceFile);
				){
			inputIO.useDelimiter("[^\\d\\w]");
			ArrayList<String> words = new ArrayList<>();
			while ( inputIO.hasNext()) {
				String str = inputIO.next();
				words.add(str);
			}
			inputIO.close();
			System.out.println(words);
		}

	}

}
