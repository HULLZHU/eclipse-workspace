import java.util.*;
public class PE_5_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a decimal integer");
		
		int quotient = input.nextInt();
		int remainder = 0;
		String hexa ="";
		
		while ( quotient != 0 ) {
			remainder = quotient%16;
			quotient = quotient/16;
			if (remainder>9 && remainder < 16) {
				switch (remainder) {
				case 10: hexa = "A"+hexa;
				break;
				case 11: hexa = "B"+hexa;
				break;
				case 12: hexa = "C"+hexa;
				break;
				case 13: hexa = "D"+hexa;
				break;
				case 14: hexa = "E"+hexa;
				break;
				case 15: hexa = "F"+hexa;
				break;
				}
			}
			else
				hexa = remainder+hexa ;
		}
		System.out.println(hexa);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
