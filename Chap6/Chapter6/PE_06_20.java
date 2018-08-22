package Chapter6;
import java.util.Scanner;
public class PE_06_20 {

	public static void main(String[] args) {
		System.out.println("Please input a string");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		countLetters(s1);
	}
	
	public static void countLetters(String s1) {
		int count = 0;
		int countOfLetter = 0;
		while ( count < s1.length()) {
			if ((s1.charAt(count)>'a'&&s1.charAt(count)<'z')||(s1.charAt(count)<'Z'&&s1.charAt(count)>'A'))
					countOfLetter++;
			count++;
		}
		System.out.println(countOfLetter);
	}

}
