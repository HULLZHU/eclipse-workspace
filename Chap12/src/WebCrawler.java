import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.*;
public class WebCrawler {
	public static void main(String[] args) throws MalformedURLException, IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the starting URL.");
		String url = input.nextLine();
		crawler(url);
	}

	private static void crawler(String startingURL) throws MalformedURLException, IOException {
		//创建两个列表用来存储待爬取网页和已经爬取的网页
		ArrayList<String> ListOfPendingURLs = new ArrayList<String>();
		ArrayList<String> ListOfTraversedURLs = new ArrayList<String>();
		//将起始页存入待爬取网页
		ListOfPendingURLs.add(startingURL);
		//创造一个txt
		File crawlTest = new File ("crawlTest.txt");
		//将crawlTest作为打印目标页
		PrintWriter crawTest = new PrintWriter(crawlTest);
		
		//开始爬虫（主要是对待爬取网页和已经爬取的网页进行处理
		//首先判断待爬取网页是否已经没有了；判断已经爬取的网页是否已经超过100了；
		while ( ListOfPendingURLs.size()>0 && ListOfTraversedURLs.size()<100) {
			//将待爬取网页中的第一个网页作为即将爬取的网页，并将它从待爬取网页列表中移除
			String urlString = ListOfPendingURLs.remove(0);
			//判断已经爬取的网页中是否已经存在该网页
			if (!ListOfTraversedURLs.contains(urlString)) {
				//若不包含待爬取的网页，则将该网页先加入已经爬取的网页中
				ListOfTraversedURLs.add(urlString);
				System.out.println("Craw: " + urlString );
				//开始爬虫，并将爬虫结果写入crawlTest.txt
				crawTest.println("Craw: " + urlString +"\n***************************************");
				Scanner input = new Scanner(new URL(urlString).openStream());
				while(input.hasNext()) {
					String line = input.nextLine();
					crawTest.println(line);
				}
			}
			
			//完成该页面的爬虫后，开始获取该页面下的子链接
			for (String s: getSubURLs(urlString)) {
				//如果其中有子链接不含在已爬取列表内，则加入待爬取列表
				if ( !ListOfTraversedURLs.contains(s))
					ListOfPendingURLs.add(s);
			}
		}
		
	}

	private static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();
		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while ( input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http:",current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:",endIndex);
					}
					else
						current = -1;
				}
				
			}
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		return list;
	}

}
