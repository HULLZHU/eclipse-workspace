import java.util.*;
import java.io.*;
public class ReplaceText2 {

	public static void main(String[] args) throws FileNotFoundException {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the sourceFile name.");
	String sourceFileName = input.next();
	File sourceFile = new File(sourceFileName);
	if( sourceFile.exists()) {
		System.out.println("Successfully find the file.");
	}
	
	System.out.println("Please enter the targetFile name.");
	String targetFileName =input.next();
	File targetFile = new File (targetFileName);
	System.out.println("The targetfile exists £º" + targetFile.exists());
	
	System.out.println("Please enter the original text.");
	String s1 = input.next();
	
	System.out.println("Please enter the new text.");
	String s2 = input.next();
	
	try(
			Scanner inputIO = new Scanner(sourceFile);
			PrintWriter outputIO = new PrintWriter(targetFile);
			){
		while ( inputIO.hasNext()) {
			String text = inputIO.next();
			String newText = text.replaceAll(s1, s2);
			outputIO.print(newText+ " ");
		}
		outputIO.close();
		inputIO.close();
	}
	
	

	}

}
