import java.util.Scanner;

public class DecimalToBinaryRecursive {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a decimal number");
		int decimal = input.nextInt();
		System.out.println(dec2Bin(decimal));
	}

	private static String dec2Bin(int decimal) {
		if ( decimal < 2 && decimal > 0 ) {
			return decimal+"";
		}
		else {
			return dec2Bin(decimal/2)+decimal%2 ;
		}
	}
	

}
