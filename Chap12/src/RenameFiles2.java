import java.io.*;
import java.util.*;
public class RenameFiles2 {
	public static void main(String [] args) {
		if (args.length != 1) {
			System.out.println("Illegal Usage.");
			System.exit(0);
		}
		
		File myFiles = new File (args[0]);
		if ( myFiles.isDirectory()) {
			System.out.println("The directory is successfully found.");		
		}
		else {
			System.out.println("The directory does not exist.");
			System.exit(0);
		}
		
		File[] files = myFiles.listFiles();
		for ( int i = 0 ; i < files.length ; i ++  ) {
			String fileName = files[i].getName();
			if (fileName.matches("[\\w]+Exercise[\\d]_[\\d].*")){
				String newName = fileName.substring(0, fileName.indexOf('_'))+"0"+fileName.indexOf('_'+1);
				files[i].renameTo(new File(newName));
			}
			
		}
	}
}
