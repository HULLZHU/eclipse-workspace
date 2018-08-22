import java.io.*;
import java.util.*;
public class ReplaceWords {
    //2018/07/13 unchecked
	public static void main(String[] args) {
		//check whether the directory is legal or not. 
		if ( args.length!= 1) {
			System.out.println("Usage: java ReplaceWords Directory" );
			System.exit(0);
		}
		
		//����Ŀ¼����
		File sourceDir = new File ( args[0]);
		if ( !sourceDir.exists()) {
			System.out.println("The directory did not exist.");
			System.exit(1);
		}
		
		//�����ļ��������
		File[] files = sourceDir.listFiles();
		for ( int i = 0; i < files.length ; i++ ) {
			rename(files[i]);
		}
		}

	private static void rename(File file) {
		String name = file.getName();
		if ( name.matches("Exercise*\\.txt")) {
			//ͨ����á�txt"�ֶε�����õ����ļ���ʽ����ĩβ�ַ�������
			int indexOfTXT = name.indexOf("txt");
			String subStr = name.substring(8,indexOfTXT-2);
			String beforeSubStr = subStr.substring(0,subStr.indexOf('_')-1);
			String latterSubStr = subStr.substring(subStr.indexOf('_')+1,subStr.length()-1);
			if ( beforeSubStr.length() == 1) {
				beforeSubStr = "0"+beforeSubStr;
			}
			if ( latterSubStr.length()==1) {
				latterSubStr= "0"+beforeSubStr;
			}
			String newSubStr = beforeSubStr+"_"+latterSubStr;
			String newName = "Exercise"+beforeSubStr+"_"+latterSubStr+".txt";
			file.renameTo(new File(newName));
		}	
	}

}
