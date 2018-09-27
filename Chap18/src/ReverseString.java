import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(reverse(str));
		
	}

	private static String reverse(String str) {
		int length = str.length();
		return reverse(str,"",length);
	}

	private static String reverse(String str, String result, int length) {
		if (length == 1) {
			result = result + str;
			//System.out.println(result);
			return result;
		}
		
		else {
			result = result + str.charAt(length - 1);
			length = length - 1;
			str =str.substring(0, length);
		
			return reverse(str,result,length);
		} 
		
	}
}
