import java.io.RandomAccessFile;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestRandomAccessFile extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try(RandomAccessFile inout = new RandomAccessFile("inout.dat","rw");
				){
			//clear contents
			inout.setLength(0);
			//write integers to the file
			for (int i = 0 ; i < 200 ; i ++ ) {
				inout.writeInt(i);
			}
			
			System.out.println("Current file length is " + inout.length());
			//move the file pointer to the beginning
			inout.seek(0);
			//display the first number in the file
			System.out.println("The first number is " + inout.readInt());
			
			//move the file pointer to the second number
			inout.seek(1*4);
			//display the second number
			System.out.println("The second number is " + inout.readInt());
			
			//move the file pointer to the tenth number
			inout.seek(9*4);
			System.out.println("The tenth number is " + inout.length());
			
			//retrieve the new element number
			inout.seek(10 * 4);
			System.out.println("The eleventh number is " + inout.readInt());
		}
		
		
	}

}
