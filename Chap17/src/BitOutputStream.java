import java.io.*;
public class BitOutputStream {
	public static void main(String[]args) throws IOException {
		
		try(FileInputStream input = new FileInputStream("source.txt")){
			int value;
			while ((value = input.read())!= -1) {
				System.out.println(Integer.toBinaryString(value));
				System.out.println(Integer.toHexString(value));
			}
		}
		
		
	}

}
