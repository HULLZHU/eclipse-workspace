import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FromTextToBinary {
	public static void main(String [] args) throws FileNotFoundException {
		File file = new File("Source.txt");
		DataOutputStream output = new DataOutputStream(new FileOutputStream("target.txt"));
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				String str = input.nextLine();
				output.writeUTF(str);
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println("The file doest not exist.");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream inputStream = new DataInputStream(new FileInputStream("target.txt"))){
			while ( true ) {
				System.out.println(inputStream.readUTF());
			}
		}
		catch (EOFException ex) {
			System.out.println("ALL the string are collected.");
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
