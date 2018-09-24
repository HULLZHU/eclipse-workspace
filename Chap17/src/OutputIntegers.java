import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputIntegers {
	public static void main(String[]args) throws FileNotFoundException {
		File file = new File("Exercise17_01.txt");
		
		if ( !file.exists()) {
			System.out.println("A new file will be created.");
		}
			
		PrintWriter output = new PrintWriter(new FileOutputStream(file,true)); 
		
		for ( int i = 0 ; i < 100 ; i ++ ) {
			String number = (int)(100*Math.random())+" ";
			output.print(number);
		}
		output.close();
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			System.out.println(input.next());
		}
		input.close();
		
	}

}
