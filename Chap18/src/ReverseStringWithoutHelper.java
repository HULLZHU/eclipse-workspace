import java.util.Scanner;

public class ReverseStringWithoutHelper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(reverse(str));
		System.out.println(str.substring(0, str.length()));
		// please remember str.subString(a,b) is right exclusive

	}

	private static String reverse(String str) {
		if ( str.length() == 1 || str.length() == 0)
			return str;
		else
			return ""+str.charAt(str.length() - 1)+reverse(str.substring(0, str.length()-1));
	}

}
