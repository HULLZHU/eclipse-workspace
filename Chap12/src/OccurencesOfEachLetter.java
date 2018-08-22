import java.util.*;
import java.io.*;
public class OccurencesOfEachLetter {
	public static void main(String[]args) {
		//�жϿ���̨���������Ƿ�Ϸ�
		if ( args.length != 1) {
			System.out.println("Usage Error.");
			System.exit(0);
		}
		//�����ļ����󣬲��ж��ļ��Ƿ����
		File myFile = new File (args[0]);
		if ( !myFile.exists()) {
			System.out.println("The file does not exist.");
			System.exit(1);
		}
		
		int[] occurrences = new int[26];
		try {
			Scanner input = new Scanner(myFile);
			while (input.hasNextLine()) {
				String characters = input.nextLine();
				for ( int i = 0; i < characters.length(); i ++ ) {
					char character = characters.charAt(i);
					if ( character>='a'&&character<='z')
						occurrences[character - 'a']++;
					if ( character>='A'&&character<='Z')
						occurrences[character - 'A']++;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for ( int i = 0; i < occurrences.length ; i ++ ) {
			System.out.println("The occurrences of Character " +(char)('A'+i) + " is "+  occurrences[i]);
		}
	}
}
