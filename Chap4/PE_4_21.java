import java.util.Scanner;
//利用循环语句做？？？
public class PE_4_21 {

	public static void main(String[] args) {
		
		System.out.println("Please input your social security number");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		if (s1.length()!=11)
		{
			System.out.println("Please input a valid SSN");
		}
		else if (s1.charAt(3)!='-'&&s1.charAt(6)!='-')
		{
			System.out.println("please input a valid SSN");
		}
		//////////////////////////////////////////
		else
		{
			
			//删除'-'字符，取消空格
			String s2 = s1.replace("-","");
			System.out.println(s1);
			System.out.println("Now the final string We need to judge is" + s2);
			
			
			int length = s2.length();
			
			int i = 0;
			
			while (i<=length-1&&i>0)
			{
				int chr = s2.charAt(i);
				
				if (chr<48 || chr >57)
				System.out.println("Please input a valid SSN");
				else
				{
					System.out.println("A valid SSN");
				}
				i = i+1;
				
			}
		
			
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
