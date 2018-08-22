import java.io.*;
import java.util.*;
public class RemoveText {
	public static void main(String[] args) throws Exception {
		if ( args.length !=2) {
			System.out.println("The right format is: text fileName" );
			System.exit(0);
		}
		File targetFile = new File ("D:\\targetFile.txt");
		if ( targetFile.exists()) {
			System.out.println("The targetFile already exist" );
			System.exit(1);
		}
		
		File sourceFile = new File (args[1]);
		if ( !sourceFile.exists()) {
			System.out.println("The targetFile " +args[1] + " doest not exist" );
			System.exit(1);
		}
		
		try(
			Scanner input = new Scanner(sourceFile);
				//以sourceFile作为IO的输入流
			PrintWriter output = new PrintWriter(targetFile);
				//以targetFile作为IO的输出流
				){
			while (input.hasNextLine()) {
				String s1 = input.nextLine();
				String s2= s1.replaceAll(args[0], "");
				output.println(s2);
				
			}
			
		}

	}

}
