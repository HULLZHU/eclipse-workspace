import java.util.Scanner;

public class PE_4_8 {

	public static void main(String[] args) {
		
		System.out.println("Please input a ASCII number");
		
		Scanner input = new Scanner(System.in);
		
		int ASCII = input.nextInt();
		
		if (ASCII >= 128 || ASCII <0 )
		{
			System.out.println("Please input a true number.");
			System.exit(1);
		}
		
		else
		{
			char character = (char) ASCII;
			System.out.println("The character of the ASCII code is"+character);
		}
		// TODO Auto-generated method stub

	}

}
