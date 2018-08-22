import java.io.*;
public class WriteDataWithAutoClose {
	public static void main(String[] args) throws FileNotFoundException {
		File newFile = new  File("F:/score2.txt");
		if (newFile.exists()) {
			System.out.println("The file already exist");
			System.exit(0);
		}
		
		try(PrintWriter output = new PrintWriter(newFile)){
			output.print("I am a good boy.");
			output.println("I love Linziqi");
			output.println("She loves me. So we will always be together");
		}
		
	}

}
