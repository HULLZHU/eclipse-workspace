import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFiles {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		if(args.length != 2 ){
			System.out.println("Usage: java SplitFiles numberOfPieces");
			System.exit(1);
		}
		
		try (
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(args[0])));
		){
			int numberOfPieces = Integer.parseInt(args[1]);
			long fileSize = input.available();
			System.out.println("File size:" +input.available() + " bytes");
			int splitFileSize = (int)Math.ceil(1.0*fileSize/numberOfPieces);
			
			for ( int i = 1 ; i< numberOfPieces ; i ++) {
				try(BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(args[0]+i+".txt")))
				){
					int value ; 
					int count = 0;
					
					while (count ++ < splitFileSize && (value = input.read())!=-1) {
						System.out.println(value);
						output.write(value);
					}
					
				}
			}
		}
	}

}
