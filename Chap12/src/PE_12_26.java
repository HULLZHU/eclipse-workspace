import java.io.*;
import java.util.*;
public class PE_12_26 {

	public static void main(String[] args) {
		if (args.length!=1) {
			System.out.println("Usage£ºjava PE_12_26 directoryName");
			System.exit(0);
		}
		
		File directory = new File ( args[0]);
		if ( ! directory.isDirectory()) {
			directory.mkdirs();
		}
		System.out.println(directory.isDirectory());
		

	}

}
