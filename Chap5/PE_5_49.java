import java.util.*;
public class PE_5_49 {

	public static void main(String[] args) {
		System.out.println("Please input a stirng");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s = s1.replace(" ", ""); 
		int count = 0;
		int countVowl=0;
		while ( count< s.length()) {
			if (s.charAt(count)=='A'||s.charAt(count)=='E'||s.charAt(count)=='I'||s.charAt(count)=='O'||s.charAt(count)=='U') {
				countVowl++;
			}
			count++;
		}
		int consonant = s.length()-countVowl;
		System.out.println("Consonant: "+consonant);
		System.out.println("Vowl: " + countVowl);
		// TODO Auto-generated method stub

	}

}
