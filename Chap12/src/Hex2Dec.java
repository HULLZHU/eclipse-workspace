import java.util.*;
public class Hex2Dec {
	public static void main (String[] args) {
		System.out.println("PLease enter an hexadecimal number.");
		Scanner input = new Scanner(System.in);
		String hex = input.next();
		System.out.println("The number in decimal format is :" +  hexToDecimal(hex));
		
				
	}

	public static int hexToDecimal(String hex) {
		int sum = 0;
		try {
		for ( int i = 0 ; i < hex.length() ; i ++) {//
			try {
				sum += Double.parseDouble(hex.charAt(i)+"")*Math.pow(16,hex.length()-i-1);
			}
			catch(NumberFormatException ex) {
				if ( hex.charAt(i)<='F'&&hex.charAt(i)>='A')
					sum +=(10+hex.charAt(i)-'A') *Math.pow(16, hex.length()-i-1);
				else {
					throw new NumberFormatException("Please make sure that the numbers are between 0 and F\n"
							+ "Pleae enter again");
				}
			}
		}
		}
		catch(Exception ex) {
			System.out.println("Please make sure that the numbers are between 0 and F\n"
							+ "Pleae enter again");
			Scanner input = new Scanner(System.in);
			String s1 = input.next();
			sum = hexToDecimal(s1);
		}
		return sum;
	}

	
}
