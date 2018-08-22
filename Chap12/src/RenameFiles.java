import java.util.*;
import java.io.*;
public class RenameFiles {

	public static void main(String[] args) {
		if (args.length !=1 ) {
			System.out.println("Usage : java RenameFiles directoryName");
			System.exit(0);
		}
		
		File myDirectory = new File(args[0]);
		if (myDirectory.isDirectory())
			System.out.println("Successfully find the directory");
		else {
			System.exit(1);
			System.out.println("The directory does not exist");
			}
		
		File[] myFiles = myDirectory.listFiles();
		for ( int i = 0; i < myFiles.length ; i ++ ) {
			String fileName = myFiles[i].getName();
			if ( fileName.matches("[\\w]+Exercise[\\d]_.*")) {
				String newName = fileName.substring(0, fileName.indexOf('_')-1)+"0"+fileName.substring(fileName.indexOf('_'));
				myFiles[i].renameTo(new File(newName));
			}
		}
		

	}
}
