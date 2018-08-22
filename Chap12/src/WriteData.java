import java.io.*;
public class WriteData {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("hahaha.txt");
		if( file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter(file);
		out.print("John T Smith");
		out.println(90);
		out.println("Eric K Jones");
		out.println(85);
		out.close();
	}
}
