import java.io.*;
import java.util.*;
public class OccurrencesOfEachLetter {
	public static void main(String[] args) {
		//判断控制台窗口输入是否合法
		if ( args.length != 1) {
			System.out.println("Usage Error.");
		    System.exit(0);		
		}
		//创建文件对象，并判断文件是否存在
		File myFile = new File (args[0]);
		if ( !myFile.exists()) {
			System.out.println("The file does not exist.");			
	    	System.exit(1);
		}
		int[] counts = new int[26];
 		try {
			Scanner input = new Scanner(myFile);
			while (input.hasNextLine()) {
				String str = input.nextLine();
				for ( int i = 0; i<str.length(); i ++ ) {
					if ( Character.isLetter(str.charAt(i)))
						counts[Character.toUpperCase(str.charAt(i))-'A']++;
				}
			}
		}
 		catch( FileNotFoundException ex) {
 			ex.printStackTrace();
 		}
 		
 		for ( int i = 0; i < counts.length ; i ++ ) {
			System.out.println("The occurrences of Character " +(char)('A'+i) + " is "+  counts[i]);
		}

	}

}
