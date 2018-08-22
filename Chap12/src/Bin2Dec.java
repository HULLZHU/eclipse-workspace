import java.util.*;
public class Bin2Dec {
	public static void main(String [] args) throws NumberFormatException, BinaryFormatException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a binary number");
		String binaryString = input.next();
		System.out.println("The binary number " + binaryString +" is "+Bin2Dec(binaryString)+" in decimal format");
	}

	public static int Bin2Dec(String binaryString) throws NumberFormatException, BinaryFormatException {
		double decimalNum = 0;
		try {
			
		for ( int i = 0 ; i < binaryString.length(); i ++ ) {
			if (binaryString.charAt(i)>'1'||binaryString.charAt(i)<'0')
				throw new BinaryFormatException();
			double temp =Double.parseDouble(binaryString.charAt(i)+"");
			decimalNum += temp * Math.pow(2, binaryString.length()-i-1);
		}
		}
		catch (BinaryFormatException ex) {
			System.out.println("Wrong Input, do you want to input again?Y for yes, any others for no");
			Scanner input = new Scanner(System.in);
			String choice = input.next();
			if ( inputAgain(choice)) {
				String newBinaryString = input.next();
				decimalNum = Bin2Dec(newBinaryString);
			}
		
		}

		return (int) decimalNum;
	}

	public static boolean inputAgain(String choice) {
		if (choice.length() ==1 && choice.charAt(0)=='Y')
			return true;
		return false;
	}

}
