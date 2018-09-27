import java.util.Scanner;

public class RecursiveCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = input.nextLine();
		System.out.println("Please enter the character");
		char character = input.next().charAt(0);
		
		System.out.println("Count"+ count(str,character));

	}

	private static int count(String str, char character) {
		int length = str.length();
		return count(str,character,length,0);
	}

	private static int count(String str, char character, int length,int count) {
		if ( length == 0) {
			return count;
		}
		
		else {
			if ( str.charAt(length-1) == character) {
				count ++;
			}
			length --;
			return count(str,character,length,count);
		}
	}

}
