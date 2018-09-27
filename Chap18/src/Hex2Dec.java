import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String hex = input.nextLine();
		System.out.println("Enter a hex number ");
		System.out.println(hex2Dec(hex));
	}

	private static int hex2Dec(String hexString) {
		return hex2Dec(hexString,0,hexString.length()- 1);
	}

	private static int hex2Dec(String hexString, int low, int high) {
		if ( high < low)
			return 0 ;
		else {
			return hex2Dec(hexString,low,high - 1)*16 + hexCharToDecimal(hexString.charAt(high));
		}
	}

	private static int hexCharToDecimal(char ch) {
		if ( ch >= 'A' && ch <= 'F')
			return 10 +ch - 'A';
		else
			return ch - '0';
	}
}
