import java.util.Scanner;

public class Binary2DecimalRecursive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binary = input.next();
		for ( int i = 0; i <(binary+"").length(); i ++) {
			if ((char)(binary+"").charAt(i)<'0' || (char)(binary+"").charAt(i)>'1') {
				System.out.println("Please enter a valid integer");
				System.exit(0);
			}
		}
		
		System.out.println(binary2Decimal(binary));
	}

	private static int binary2Decimal(String binaryString) {
		return binary2Decimal(binaryString,binaryString.length()-1,0);
	}

	private static int binary2Decimal(String binaryString, int high, int result) {
		if ( high < 0 )
			return 0;
		else {
			char binaryChar = binaryString.charAt(high);
			int binary = getBinaryNumber(binaryChar);
			result = (int) (result + binary*Math.pow(2, binaryString.length()-1-high));
			high -- ;
			result =result + binary2Decimal(binaryString,high,result);
			return result;
		}
	}

	private static int getBinaryNumber(char binaryChar) {
		if (binaryChar =='1')
		return 1;
		else
			return 0;
	}




}
