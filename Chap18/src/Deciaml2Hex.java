import java.util.Scanner;

public class Deciaml2Hex {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a decimal");
		int decimal = input.nextInt();
		System.out.println(dec2Hex(decimal));
	}

	private static String dec2Hex(int decimal) {
		if ( decimal < 16 && decimal >= 0) {
			return getCharacter(decimal);
		}
		
		else
			return dec2Hex(decimal/16)+getCharacter(decimal%16);
	}

	private static String getCharacter(int decimal) {
		if (decimal<10&&decimal>=0) {
			return decimal+"";
		}
		else
			return (char)('A'+(decimal - 10))+"";
	}

}
