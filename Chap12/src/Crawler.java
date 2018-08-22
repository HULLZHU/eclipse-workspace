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
		//��crawler�����׳����쳣���д���
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
		//���Ƿ�����������ѭ���ж�
		while ( !pendingURLs.isEmpty()&&traversedURLs.size()<=20) {
			//���ȴ����ʵ�URL��ַ�б��еĵ�һ���Ƴ�
			String tempURLString = pendingURLs.get(0);
			pendingURLs.remove(0);
			//�жϸ�URL�ַ��Ƿ��Ѿ������ʹ������ޣ���ʼ����
			if (!traversedURLs.contains(tempURLString)) {
			    //���Ƴ����URL��ַ�����Ѿ����ʵ�URL��ַ�б���
				traversedURLs.add(tempURLString);
				System.out.println("Craw: " + tempURLString);
			    //��ʼ����URLҳ���µ����ݽ��д�ӡ������Ϊģ�廯����
				URL url = new URL(tempURLString);
			    //����URL��ҳ��������
				Scanner URLInput = new Scanner(url.openStream());
				crawlerTest.println(tempURLString + "\n****************************************************************************");
				while ( URLInput.hasNext()) {
				crawlerTest.print(URLInput.next());
			}
				//��ɶԵ�ǰҳ�������󣬿�ʼ��Ѱ��ǰҳ�����Ƿ������URL�������ڣ��򽫵�ַ��ӵ�pendingURLs
				ArrayList<String> subURLs = new ArrayList<>();
				subURLs = getSubURLs(url);
				for ( int i=0; i < subURLs.size(); i ++ ) {
					pendingURLs.add(subURLs.get(i));
				}
				//��subURLs�б��µĵ�ַ��һ��ӵ�pendingURLs��
			}
			
		}
		
	}

	private static ArrayList<String> getSubURLs(URL url) {
		ArrayList<String> subURLs = new ArrayList<>();
		try {
			Scanner URLInput = new Scanner(url.openStream());
			int current = 0;
			while ( URLInput.hasNext()) {
				//��current = -1ʱ����ζ����һ���ַ��㴩ɨ�����
				//���ڿ�ʼɨ����һ��
				String line = URLInput.nextLine();
				current = line.indexOf("http:",current);
				while ( current>0) {
					//��current = -1ʱ���˳�ѭ��
					int endIndex = line.indexOf("\"", current);
					System.out.println("endIndex:"+endIndex);
					if (endIndex > 0) {
					subURLs.add(line.substring(current, endIndex));
					//��������һ�����������꿪ʼѰ��http���ؼ���
					current = line.indexOf("http:",endIndex);
					}
					else {
						//��endIndex = -1��ʱ����˼�����������ַ�����û���ҵ���Ӧ���ַ�
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
