package Chapter6;
import java.util.*;
public class PE_06_12 {

	public static void main(String[] args) {
		System.out.println("Please input starting characters and ending characters");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		System.out.println("How many characters do you want per line");
		int Perline = input.nextInt();
		printChars(ch1, ch2, Perline);
		// TODO Auto-generated method stub
	}
	
	public static void printChars(char ch1, char ch2, int Perline) {
		int count = 1;
		char character ;
		while ( count <= ch2-ch1) {
			character = (char)(ch1+count -1);
			System.out.print(character);
			if(count%10 == 0)
				System.out.println();
			count ++;
		}
	}

}
