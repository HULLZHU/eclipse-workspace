import java.util.*;
import java.io.*;
public class GetWordsFromEssay {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name.");
		File sourceFile = new File (input.nextLine());
		if (sourceFile.exists())
			System.out.println("Successfully find the file.");
		try(Scanner inputIO = new Scanner(sourceFile)){
			ArrayList<String> words = new ArrayList<>();
			while ( inputIO.hasNext()) {
				String str = inputIO.next();
				String newStr = str.replaceAll("//D&&//W", " ").trim();
				words.add(newStr);
			}
			inputIO.close();
			System.out.println(words);
		}
	}

}
