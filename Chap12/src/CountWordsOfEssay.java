import java.util.*;
import java.io.*;
public class CountWordsOfEssay {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name.");
		File sourceFile = new File(input.nextLine());
		if (sourceFile.exists())
			System.out.println("The file is successfully found.");
		else {
			System.out.println("The found does not exist.");
			System.exit(0);
		}
		
		try (Scanner inputIO = new Scanner (sourceFile)){
			inputIO.useDelimiter("[\\D&&\\W]");
			ArrayList<String> words = new ArrayList<>();
			while (inputIO.hasNext()) {
				String str = inputIO.next();
				words.add(str);
			}
			inputIO.close();
			System.out.println(words);
			System.out.println("Here are " + words.size() + " words in the article");
			
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("The file is not a legal text file");
		}

	}

}
