package Chapter6;
import java.util.*;
public class PE_06_21 {

	public static void main(String[] args) {
		System.out.println("Please input an uppercase letter");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char upperCaseLetter = s.charAt(0);
		System.out.println(getNumber(upperCaseLetter));
	}
	
	public static int getNumber( char upperCaseLetter) {
		if ( upperCaseLetter<='C'&& upperCaseLetter>= 'A')
			return 2;
		if ( upperCaseLetter <='F'&& upperCaseLetter>='D')
			return 3;
		if ( upperCaseLetter >='G'&& upperCaseLetter<='I')
			return 4;
		if ( upperCaseLetter>='J'&&upperCaseLetter<='L')
			return 5;
		if ( upperCaseLetter>='M'&&upperCaseLetter<='O')
			return 6;
		if ( upperCaseLetter>='P'&&upperCaseLetter<='S')
			return 7;
		if ( upperCaseLetter >='T'&& upperCaseLetter<='V')
			return 8;
		else
			return 9;
			
		
	}

}
