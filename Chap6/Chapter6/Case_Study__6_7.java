package Chapter6;
import java.util.*;
public class Case_Study__6_7 {

	public static void main(String[] args) {
		System.out.println("Please input a Hexadecimal number");
		Scanner input = new Scanner(System.in);
		String Hexa = input.nextLine();
		System.out.println("The "+Hexa+" in deciaml is "+hexaToDecimal(Hexa.toUpperCase()));
		
	}
	
	public static int hexaToDecimal( String hexa ) {
		int decimal = 0;
		int count = 0;
		while ( count< hexa.length() ) {
			char hexaChar = hexa.charAt(count);
			decimal = decimal*16 + hexaCharToDecimal(hexaChar);
			count ++;
		}
		return decimal;
	}
	
	public  static int hexaCharToDecimal(char hexaChar) {
		if ( hexaChar <= 'F'&& hexaChar>='A')
			return 10+hexaChar - 'A';
		else
			return hexaChar-'0';
	}

}
