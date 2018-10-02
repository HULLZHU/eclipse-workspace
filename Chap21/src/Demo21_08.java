import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;

public class Demo21_08 {
	public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//create output stream
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("demo.dat"));
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("New York");
		
		LinkedHashSet<String> set2 = (LinkedHashSet<String>)set1.clone();
		set1.add("Atlanta");
		output.writeObject(set1);
		output.writeObject(set2);
		output.close();
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("demo.dat"));
		set1 = (LinkedHashSet<String>)input.readObject();
		set2 = (LinkedHashSet<String>)input.readObject();
		System.out.println(set1);
		System.out.println(set2);
		input.close();
	}

}
