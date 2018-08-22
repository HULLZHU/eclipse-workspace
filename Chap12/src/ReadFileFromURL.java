import java.util.*;
import java.io.*;
import java.net.*;
public class ReadFileFromURL {

	public static void main(String[] args) throws IOException{
		System.out.println("Please enter a URL");
		String urlString = (new Scanner(System.in)).next();
		try {
			//����һ����txt�ļ�������������������
			File target = new File("urlTest.txt");
			//�жϸ������ļ��Ƿ��Ѿ�����
			if ( target.exists())
				System.out.println("The file alreay exist.");
			//ͨ��������ȷ��URL��ַ����URLʵ��
			URL url = new URL(urlString);
			int count = 0;
			//��openStream������������URL��ҳ���ݡ����롱inputʵ������ʱ��������input�Ѿ�д�����ַ���
			Scanner input = new Scanner(url.openStream());
			//����PrintWriterʵ����������input���ϵĶ�����е���
			PrintWriter output = new PrintWriter(target);
			//�ж��Ƿ��к���
			while (input.hasNext()) {
				char s1 = input.next().charAt(0);
				//��s1��ӡ��output�ļ��ϣ�output�ļ�ͨ���ڴ��봦������������д����target.txt�ļ���
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
