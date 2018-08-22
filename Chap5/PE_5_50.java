import java.util.*;
public class PE_5_50 {

	public static void main(String[] args) {
		System.out.println("Please input a srting");
		Scanner input = new Scanner(System.in);
		int count = 0;
		int countUp = 0;
		String s1= input.nextLine();
		while ( count < s1.length()) {
			if (s1.charAt(count)>='A'&&s1.charAt(count)<'Z')
				countUp++;
			count++;
		}
		System.out.println("Here are "+ countUp+" Uppercases");
		// TODO Auto-generated method stub

	}

}
