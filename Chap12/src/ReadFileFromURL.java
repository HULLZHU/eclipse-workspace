import java.util.*;
import java.io.*;
import java.net.*;
public class ReadFileFromURL {

	public static void main(String[] args) throws IOException{
		System.out.println("Please enter a URL");
		String urlString = (new Scanner(System.in)).next();
		try {
			//创建一个新txt文件，用来保存爬虫数据
			File target = new File("urlTest.txt");
			//判断该命名文件是否已经存在
			if ( target.exists())
				System.out.println("The file alreay exist.");
			//通过输入正确的URL地址创建URL实例
			URL url = new URL(urlString);
			int count = 0;
			//用openStream打开输入流，将URL网页数据“导入”input实例，此时可以联想input已经写满了字符串
			Scanner input = new Scanner(url.openStream());
			//创建PrintWriter实例，用来对input身上的对象进行导出
			PrintWriter output = new PrintWriter(target);
			//判断是否还有后文
			while (input.hasNext()) {
				char s1 = input.next().charAt(0);
				//将s1打印到output文件上，output文件通过内存与处理器，将内容写到了target.txt文件上
				output.print(s1);
				count ++;
			}
			System.out.println("The size is : " +count);
		}
		catch(MalformedURLException ex) {
			throw new MalformedURLException("Invalid URL");
		}
		catch (IOException ex){
			throw new IOException("Invalid File");
		}
		
		

	}

}
