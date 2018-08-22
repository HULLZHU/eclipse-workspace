import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// ��ָ��ģʽ���ַ�������
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
	 
	      // ���� Pattern ����
	      Pattern r = Pattern.compile(pattern);
	 
	      // ���ڴ��� matcher ����
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }

	}

}
