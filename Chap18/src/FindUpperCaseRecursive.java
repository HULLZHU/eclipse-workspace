import java.util.Scanner;

public class FindUpperCaseRecursive {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println("Count_Of_UpperCaseCharacters : "+ count(str,0));
	}

	private static int count(String str,int count) {
		if (str.length() == 1) {
			if ( 'A'<=str.charAt(0)&&str.charAt(0)<='Z' ) {
				return ++count ;
			}
			else
				return count ;
		}
		
		else if (str.length() > 1) {
			if (str.charAt(str.length()-1)>'A'&&str.charAt(str.length() - 1)<'Z') {
				count ++;
			}
			
			return count(str.substring(0, str.length() - 1),count);
		}
		
		else
			System.out.println("please enter a string");
		return (Integer) null;
	}

}
