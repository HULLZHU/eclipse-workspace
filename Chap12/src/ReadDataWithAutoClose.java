import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadDataWithAutoClose {

	public static void main(String[] args) throws FileNotFoundException {
		File newFile = new File("F:/score2.txt");
		if (newFile.exists())
			System.out.println("The file already exist");
		
		try (Scanner input = new Scanner(newFile)){
			while (input.hasNext()) {
				String firstName = input.next();
				String mi = input.next();
				String lastName = input.next();
				int score = input.nextInt();
				System.out.println(firstName + " "+ mi+ " "+ lastName + " :"+ score );
		}
		

	}

}
}
