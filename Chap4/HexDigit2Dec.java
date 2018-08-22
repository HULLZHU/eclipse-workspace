import java.util.Scanner;

public class HexDigit2Dec {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a digit");
		
		String hexString = input.nextLine();
		
		if (hexString.length() !=1)
		{
			System.out.println(" You must enter exactly one character!");
			System.exit(1); // 非正常退出程序
		}
		
		
		//////////////////////////////
		char ch = hexString.charAt(0);
		
		ch = Character.toUpperCase(ch);
		
		if ( ch >= 'A' && ch< 'F')
		{
			int value = ch - 'A' +10;
			
			System.out.println(" The decimal value for hex digit " + ch + " is " + value);
		}
		
		else if( Character.isDigit(ch))
		{
			System.out.println(" The decimal value for hex digit" + ch + " is "+ ch);
		}
		else
		{
			System.out.println(ch + " is an invalid input");
		}
		/////////////////////////////
		


	}

}
