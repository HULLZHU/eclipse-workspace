import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntergerToTextFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(
		DataOutputStream output= new DataOutputStream(new FileOutputStream("Exercise17_02_new.dat",true))
				){
			for ( int i = 0 ; i < 100 ; i ++ ) {
				int number = (int)(100*Math.random());
				output.writeInt(number);
			}
		}
		
		try(
		DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_02_new.dat"));
				){
			int value;
			while((value =input.read()) != -1) {
				System.out.println(input.readInt()+" ");
			}
		}
		catch(EOFException ex) {
			System.out.println("All the numbers has been printed");
		}
		
	}

}
