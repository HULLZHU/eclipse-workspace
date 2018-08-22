import java.util.*;
import java.io.*;
public class ReplaceALLTextOfDirectory {
	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 3) {
			System.out.println("Usage : Directory oldString newString");
			System.exit(0);
		}
		try {
			//创建文件路径
			File dir = new File(args[0]);
			//判断路径是否合法，若非法，则直接退出程序
			if ( !dir.isDirectory()){
				System.out.println("Please make sure the first argument is an legal directory.");
				System.exit(0);
				}
			//若路径合法，则继续下一步。
			else {
				//列出目录下的文件
				File[] files = dir.listFiles();
				for ( int i = 0; i < files.length; i ++ ) {
					//对txt的文件进行匹配
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
			//创建新的文本文件存储输出
			File newFile = new File ( "New"+file.getName());
			PrintWriter output = new PrintWriter(newFile);
			Scanner inputIO = new Scanner(file);
			while ( inputIO.hasNext()) {
				String s1 = inputIO.nextLine();
				output.println(s1.replaceAll(oldString, newString));
			}
			inputIO.close();
			//若不对output进行close(),输出流是无法自动关闭的，因此程序完成后，目标的输出文本文件依然是空白的
			output.close();
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
	}
}
