import java.io.*;
import java.net.*;
import java.net.*;
import java.util.*;
public class Crawler {
	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
		    System.out.println("Please enter the URL");
		    String url = input.nextLine();
		    crawler(url);
		}
		//对crawler方法抛出的异常进行处理
		catch(FileNotFoundException ex) {
			System.out.println("The file to save the Crawler Record is not created successfully");
		}
		catch(MalformedURLException ex) {
			System.out.println("The URL you input may be wrong");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void crawler(String urlString) throws IOException {
		File destFile = new File("crawlerTest.txt");
		PrintWriter crawlerTest = new PrintWriter(destFile);
		ArrayList<String> pendingURLs = new ArrayList<>();
		ArrayList<String> traversedURLs = new ArrayList<>();
		pendingURLs.add(urlString);
		//对是否进行爬虫进行循环判断
		while ( !pendingURLs.isEmpty()&&traversedURLs.size()<=20) {
			//将等待访问的URL地址列表中的第一个移除
			String tempURLString = pendingURLs.get(0);
			pendingURLs.remove(0);
			//判断该URL字符是否已经被访问过，若无，则开始访问
			if (!traversedURLs.contains(tempURLString)) {
			    //将移除后的URL地址放入已经访问的URL地址列表中
				traversedURLs.add(tempURLString);
				System.out.println("Craw: " + tempURLString);
			    //开始将该URL页面下的内容进行打印，以下为模板化过程
				URL url = new URL(tempURLString);
			    //创建URL网页的输入流
				Scanner URLInput = new Scanner(url.openStream());
				crawlerTest.println(tempURLString + "\n****************************************************************************");
				while ( URLInput.hasNext()) {
				crawlerTest.print(URLInput.next());
			}
				//完成对当前页面的爬虫后，开始搜寻当前页面下是否存在子URL，若存在，则将地址添加到pendingURLs
				ArrayList<String> subURLs = new ArrayList<>();
				subURLs = getSubURLs(url);
				for ( int i=0; i < subURLs.size(); i ++ ) {
					pendingURLs.add(subURLs.get(i));
				}
				//将subURLs列表下的地址逐一添加到pendingURLs下
			}
			
		}
		
	}

	private static ArrayList<String> getSubURLs(URL url) {
		ArrayList<String> subURLs = new ArrayList<>();
		try {
			Scanner URLInput = new Scanner(url.openStream());
			int current = 0;
			while ( URLInput.hasNext()) {
				//当current = -1时，意味着上一行字符你穿扫描完毕
				//现在开始扫描下一行
				String line = URLInput.nextLine();
				current = line.indexOf("http:",current);
				while ( current>0) {
					//当current = -1时，退出循环
					int endIndex = line.indexOf("\"", current);
					System.out.println("endIndex:"+endIndex);
					if (endIndex > 0) {
					subURLs.add(line.substring(current, endIndex));
					//继续从上一个结束的坐标开始寻找http：关键字
					current = line.indexOf("http:",endIndex);
					}
					else {
						//当endIndex = -1的时候，意思是搜完整个字符串都没有找到对应的字符
						current = -1;
					}
				}
			}
		
		}
		catch(Exception ex) {
			System.out.println("ErrorL " + ex.getMessage());
		}
		return subURLs;
	}

}
