import java.util.Scanner;

public class PE_4_9 {

	public static void main(String[] args) {
		
		System.out.println("Please input a character.");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
	    char character = s1.charAt(0);
	    //�����ַ�������ʽ��ȡ��һ���ַ�
	    
	    int ASCII = (int)character;
	    
	    System.out.println("The ASCII code of the character is"+ASCII);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
