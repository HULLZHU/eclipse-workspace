import java.io.*;
import java.util.*;
public class ReplaceText {

	public static void main(String[] args) throws IOException{
		if ( args.length !=4) {
			System.out.println("The Right Usage should be :sourceFile targetFile oldStr newStr");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) 
			System.out.println("The SourceFile does not exist.");
		
		File targetFile = new File(args[1]);
		if (!targetFile.exists())
				System.out.println("The targetFile does not exist.");
		
		try(	Scanner input = new Scanner(sourceFile);
				PrintWriter output = new PrintWriter(targetFile);
				){
			while ( input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[2], args[3]);
				output.println(s2);
			}
		}
		
		
			
		

	}

}
