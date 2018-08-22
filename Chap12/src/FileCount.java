import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class FileCount {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: TextFile");
			System.exit(0);
		}
		File sourceFile = new File(args[0]);
		
		if (!sourceFile.exists()) {
			System.out.println("The sourceFile does not exist.");
			System.exit(0);
		}
		
		try(Scanner input = new Scanner(sourceFile)){
			int countOfCharacters = 0;
			int countOfLine = 0;
			int countOfWords = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				countOfCharacters += line.length();
				countOfLine ++;
				System.out.println("Line :" +countWords(line));
				countOfWords += countWords(line);
			}
			System.out.println("Characters Number :" + countOfCharacters);
			System.out.println("Lines Number: " +countOfLine);
			System.out.println("Words Number: " +countOfWords);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private static int countWords(String line) {
		String temps = line.replaceAll("[^\\w\\d]", ",");
		String[] words = line.split("[^\\w\\d]+");
		return words.length;
		}
	

}
