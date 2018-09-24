import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SumIntegersInBinaryFiles {
	
	public static void main(String args) throws FileNotFoundException, IOException {
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise_17_03_1.dat",false))){
					
					for ( int i = 0 ; i < 10 ; i ++ ) {
						int number = (int)(100*Math.random());
						output.writeInt(number);
					}
				}
		int sum = 0;
		try(DataInputStream input = new DataInputStream(new FileInputStream("Exercise_17_03_1.dat"))){
			int value = 0; 
			while ( (value = input.readInt())!= -1) {
				value = input.readInt();
				System.out.println(value+ " ");
				sum += value;
			}
		}
		catch (EOFException ex) {
			System.out.println("All the number has been collected.");
		}
		finally{
			System.out.println("The final sum is " + sum);
		}
		
		
	}

}
