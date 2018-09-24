import java.io.*;
public class EncrypteFiles {
	public static void main(String[]args) throws FileNotFoundException, IOException {
		
		try ( FileInputStream input = new FileInputStream("source.txt")){
			
			try (FileOutputStream output = new FileOutputStream("happy.txt"))
					{
						int value ; 
						while ((value = input.read())!=-1) {
							output.write(value+5);
						}
						
					}
			}
		
		try (FileInputStream input1 = new FileInputStream("happy.txt")){
			try(FileOutputStream output1 = new FileOutputStream("decryptedFile.txt")){
				int value ;
				while ( (value = input1.read())!=-1) {
					output1.write(value - 5);
				}
			}
			
		}
}
}