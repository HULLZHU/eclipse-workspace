import java.io.*;
public class TestFileStream {
	public static void main(String[]args) throws IOException{
		try (FileOutputStream output = new FileOutputStream("temp.dat");)
		{
		  	for ( int i = 0 ;i <= 100; i ++) {
		  		output.write(i);
		  	}
		}
		
		try(FileInputStream input = new FileInputStream("temp.dat");){
			int value ;
			while ((value = input.read())!=-1) {
				System.out.println(value + " ");
			}
		}
		
	}

}
