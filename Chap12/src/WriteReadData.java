import java.io.*;
import java.util.*;
public class WriteReadData {

	public static void main(String[] args) {
		//��ʾ�û������ļ���Ϣ
		System.out.println("Please enter the file name.");
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		File targetFile = new File ( fileName);
		
		//�ж�Ŀ���ļ����Ƿ��Ѿ�����
		if ( targetFile.exists()) {
			System.out.println("The File has existed. Program exit.");
			System.exit(0);
		}
		
		//��ʼ���ļ����в���
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


