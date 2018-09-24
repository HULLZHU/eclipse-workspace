import java.io.*;
import java.util.Date;
public class TestObjectOutputStream {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try ( ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));){
			output.writeObject("John");
			output.writeDouble(85.5);
			output.writeObject(new java.util.Date());
		}
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));){
			Object name = input.readObject();
			double score = input.readDouble();
			Date date = (Date)(input.readObject());
			System.out.println(name + " "+score + " "+ date);
		}
	}
}
