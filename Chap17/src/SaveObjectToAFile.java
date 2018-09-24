import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SaveObjectToAFile {
	public static void main(String[]args) throws ClassNotFoundException {
		
		//store objects into a file
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("obj1.dat"))){
			int[] array = {1,2,3,4,5};
			Date data = new Date();
			double value = 5.5;
			output.writeObject(array);
			output.writeObject(data);
			output.writeObject(value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file is not found.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO Exception occurs");
		}
		
		//get objects from file
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("obj1.dat"))){
			int[] array = (int[]) input.readObject();
			Date date = (Date)input.readObject();
			double value2 = (double)input.readObject();
			
			for ( int i = 0; i <array.length ; i ++ ) {
				System.out.print(array[i]+ " ");
				System.out.println("");
			}
			
			System.out.println(date.toString());
			System.out.println(value2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
