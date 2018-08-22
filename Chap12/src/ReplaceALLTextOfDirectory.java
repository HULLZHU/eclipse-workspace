import java.util.*;
import java.io.*;
public class ReplaceALLTextOfDirectory {
	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 3) {
			System.out.println("Usage : Directory oldString newString");
			System.exit(0);
		}
		try {
			//�����ļ�·��
			File dir = new File(args[0]);
			//�ж�·���Ƿ�Ϸ������Ƿ�����ֱ���˳�����
			if ( !dir.isDirectory()){
				System.out.println("Please make sure the first argument is an legal directory.");
				System.exit(0);
				}
			//��·���Ϸ����������һ����
			else {
				//�г�Ŀ¼�µ��ļ�
				File[] files = dir.listFiles();
				for ( int i = 0; i < files.length; i ++ ) {
					//��txt���ļ�����ƥ��
					if ( files[i].getName().matches(".*\\.txt"))
						replaceText(files[i],args[1],args[2]);
				}
			}
		}
		catch(FileNotFoundException ex) {
			throw new FileNotFoundException ( "Here is no matched found");
		}
	}
	private static void replaceText(File file, String oldString, String newString) throws FileNotFoundException {
		try {
			//�����µ��ı��ļ��洢���
			File newFile = new File ( "New"+file.getName());
			PrintWriter output = new PrintWriter(newFile);
			Scanner inputIO = new Scanner(file);
			while ( inputIO.hasNext()) {
				String s1 = inputIO.nextLine();
				output.println(s1.replaceAll(oldString, newString));
			}
			inputIO.close();
			//������output����close(),��������޷��Զ��رյģ���˳�����ɺ�Ŀ�������ı��ļ���Ȼ�ǿհ׵�
			output.close();
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
	}
}
