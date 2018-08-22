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
		//���������б������洢����ȡ��ҳ���Ѿ���ȡ����ҳ
		ArrayList<String> ListOfPendingURLs = new ArrayList<String>();
		ArrayList<String> ListOfTraversedURLs = new ArrayList<String>();
		//����ʼҳ�������ȡ��ҳ
		ListOfPendingURLs.add(startingURL);
		//����һ��txt
		File crawlTest = new File ("crawlTest.txt");
		//��crawlTest��Ϊ��ӡĿ��ҳ
		PrintWriter crawTest = new PrintWriter(crawlTest);
		
		//��ʼ���棨��Ҫ�ǶԴ���ȡ��ҳ���Ѿ���ȡ����ҳ���д���
		//�����жϴ���ȡ��ҳ�Ƿ��Ѿ�û���ˣ��ж��Ѿ���ȡ����ҳ�Ƿ��Ѿ�����100�ˣ�
		while ( ListOfPendingURLs.size()>0 && ListOfTraversedURLs.size()<100) {
			//������ȡ��ҳ�еĵ�һ����ҳ��Ϊ������ȡ����ҳ���������Ӵ���ȡ��ҳ�б����Ƴ�
			String urlString = ListOfPendingURLs.remove(0);
			//�ж��Ѿ���ȡ����ҳ���Ƿ��Ѿ����ڸ���ҳ
			if (!ListOfTraversedURLs.contains(urlString)) {
				//������������ȡ����ҳ���򽫸���ҳ�ȼ����Ѿ���ȡ����ҳ��
				ListOfTraversedURLs.add(urlString);
				System.out.println("Craw: " + urlString );
				//��ʼ���棬����������д��crawlTest.txt
				crawTest.println("Craw: " + urlString +"\n***************************************");
				Scanner input = new Scanner(new URL(urlString).openStream());
				while(input.hasNext()) {
					String line = input.nextLine();
					crawTest.println(line);
				}
			}
			
			//��ɸ�ҳ�������󣬿�ʼ��ȡ��ҳ���µ�������
			for (String s: getSubURLs(urlString)) {
				//��������������Ӳ���������ȡ�б��ڣ���������ȡ�б�
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
