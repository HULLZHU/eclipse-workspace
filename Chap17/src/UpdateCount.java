import java.io.*;
public class UpdateCount {
	public static void main(String[] args) throws IOException {
		try (
			      RandomAccessFile raf = new RandomAccessFile("Exercise17_08.dat", "rw");
			    ) {
			      int count = 0;
			      
			  
			      count = raf.readInt();
			      //because of the readInt() action, we should not seek to pos 0
			      raf.seek(0);
			      //delete the redundant log to save storage space
			      raf.writeInt(++count);
			      System.out.println("Current count is " + count);
			      System.out.println(raf.readInt());
			      
		
		
	}

}
}