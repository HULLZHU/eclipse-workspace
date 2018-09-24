import java.io.*;
public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedInputStream input = new BufferedInputStream(new FileInputStream("source.txt"));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("happy.txt"));
		for ( int i = 0 ; i < 10; i  ++ ) {
			output.write(input.read());
		}
		input.close();
		output.close();
		
		FileInputStream input1 = new FileInputStream("source.txt");
		FileOutputStream output1 = new FileOutputStream("happy2.txt");
		for ( int i = 0 ; i < 10 ; i ++ ) {
			output1.write(input1.read());
		}
		
		input.close();
		output.close();
	}

}
