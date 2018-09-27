import java.util.Scanner;

public class FindSpecifiedCharactersInArray {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 characters");
		char[] characters = new char[10];
		for (int i = 0 ; i < 10 ; i++ ) {
			characters[i] = input.next().charAt(0);
		}
		System.out.println("Please enter the character you want to specify");
		char character = input.next().charAt(0);
		
		System.out.println("Count: "+count(characters,character));
	}

	private static int count(char[] characters, char character) {
		// TODO Auto-generated method stub
		int high = characters.length - 1;
		return count(characters,character,high);
	}

	private static int count(char[] characters, char character, int high) {
		if ( high <= 0) {
			return 0; 
		}
		
		else {
			if (character == characters[high]) {
				return count(characters,character,--high)+ 1;
			}
			else
				return count(characters,character,--high);
		}
	}

}
