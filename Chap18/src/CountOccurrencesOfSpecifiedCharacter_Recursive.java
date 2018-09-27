import java.util.Scanner;

public class CountOccurrencesOfSpecifiedCharacter_Recursive {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string you want to be counted");
		String s1 = input.next();
		System.out.println("Please enter the character you want to count");
		char character = input.next().charAt(0);
		
		System.out.println("Count : "+ count(s1,character));
	}

	private static int count(String s1, char character) {
		// TODO Auto-generated method stub
		int high = s1.length()-1;
		int count = 0;
		return count(s1,character,high,count);
	}

	private static int count(String s1, char character, int high, int count) {
		if ( high == 0 ) {
			if ( s1.charAt(high) == character)
				return ++count;
			else
				return count;
		}
		
		else {
			if ( s1.charAt(high) == character) {
				return count(s1.substring(0, high),character,--high,++count);
			}
			else
				return count(s1.substring(0,high),character,--high,count);
		}
		
			
			
	}

}
