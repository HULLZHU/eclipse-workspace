import java.util.Scanner;

public class PE_4_11 {

	public static void main(String[] args) {
		
		System.out.println("Please input a decimal integer between 0 - 15");
		
		Scanner input = new Scanner(System.in);
		
		int integer = input.nextInt();
		
		if (integer<0 || integer>15 )
		{
			System.out.println("Please input a valid number");
		}
		
		else
		{
			if (integer <= 9)
			{
				System.out.println("The hex number is" + integer);
			}
			else
			{
				int hex_number = 'A'+ (integer - 10);
				
				char hex = (char)hex_number;
				
				System.out.println("Now the hex_number is " + hex);
			}
		}
		// TODO Auto-generated method stub

	}

}
