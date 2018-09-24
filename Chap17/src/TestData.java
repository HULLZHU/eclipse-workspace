import java.io.*;
public class TestData {
	public static void main(String[] args) throws IOException {
		
		try(FileOutputStream out = new FileOutputStream("temp.dat");
				DataOutputStream output = new DataOutputStream( out);) {
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeUTF("Jim");
			output.writeDouble(185.5);
			output.writeUTF("George");
			output.writeDouble(105.25);
		}
		
		try(DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));){
			System.out.println(input.readUTF()+ " "+ input.readDouble());
			System.out.println(input.readUTF()+ " "+ input.readDouble());
			System.out.println(input.readUTF()+ " "+ input.readDouble());
		}
		
	}

}
