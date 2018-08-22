package Chapter6;
import java.util.*;
public class PE_06_23 {

	public static void main(String[] args) {
		System.out.println("Please input a String and the characters you wanna to count");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		char ch = s2.charAt(0);
		System.out.println(count( s1, ch));
	}
	
	public static int count(String s1, char ch) {
		int i = 0;
		int countOfCharacter = 0;
		char ch_;
		while ( i < s1.length()) {
			ch_ = s1.charAt(i);
			if (ch_ == ch )
				countOfCharacter++;
			i ++;
		}
		return countOfCharacter;
	}

}
