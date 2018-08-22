import java.io.*;
public class Test12 {

	public static void main(String[] args) throws FileNotFoundException {
		File newFile = new File("test.txt");
		if (newFile.exists()) {
			System.out.println("newFile already exists");
		}
		try(PrintWriter out = new PrintWriter(newFile)){
	    out.printf("amount is %f %e\r\n",32.32,32.32);
	    out.printf("amount is %5.4f %5.4e\r\n",32.32,32.32);
	    out.printf("%6b\r\n", (1>2));
	    out.printf("%6s\r\n", "java");
	    }
	}

}
