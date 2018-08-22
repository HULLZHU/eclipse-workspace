import java.util.*;
import java.io.*;
public class CreateLargestDataSet {
	public static void main(String[] args) throws FileNotFoundException {
		//对控制台输入的字段进行检测，判断文件是否符合规则，若否，退出程序
		if ( args.length != 1) {
			System.out.println("Usage: java CreateLargestDateSet Filename.txt");
			System.exit(0);
		}
		if ( !args[0].endsWith("txt")) {
			System.out.println("Please make sure that the Filename ends with txt" );
			System.exit(1);
		}
		// printWriter process 
		try {
			File targetFile = new File ( args[0]);
			System.out.println(targetFile.exists());
			PrintWriter output = new PrintWriter(targetFile);
			output.printf("%12s%12s%16s%10s\n","FirstName","SecondName","Rank","Salary");
			output.println("");
			for ( int i = 0 ; i < 1000; i ++ ) {
				output.printf("%12s%12s","FirstName"+i,"SecondName" + i);
				//randomly generate a rank
				double temp = 3*Math.random();
				if ( temp<=1) {
					output.printf("%16s%10.2f\n","assistant",50000+30000*Math.random());
				}
				else if ( temp <=2) {
					output.printf("%16s%10.2f\n","associate",60000+50000*Math.random());
				}
				else {
					output.printf("%16s%10.2f\n","full",75000+55000*Math.random());
				}
				output.println("");
			}
		}
		catch (IOException ex) {
			System.out.println("IO Exception occurs");
		}
	}

}
