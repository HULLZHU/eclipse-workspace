import java.io.*;
import java.util.*;
public class WriteReadData {

	public static void main(String[] args) {
		//提示用户输入文件信息
		System.out.println("Please enter the file name.");
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		File targetFile = new File ( fileName);
		
		//判断目标文件夹是否已经存在
		if ( targetFile.exists()) {
			System.out.println("The File has existed. Program exit.");
			System.exit(0);
		}
		
		//开始对文件进行操作
		try {
			PrintWriter output = new PrintWriter(targetFile);
			for ( int i = 0 ; i< 100 ; i ++ ) {
				double randomNumber = 100 * Math.random();
				output.println(randomNumber);
				if ( i == 99)
					output.close();
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		}
	}


