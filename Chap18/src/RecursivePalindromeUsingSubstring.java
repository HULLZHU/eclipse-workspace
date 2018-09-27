
public class RecursivePalindromeUsingSubstring {

	public static void main(String[] args) {
		System.out.println(isPalindrome("moon"));
		System.out.println(isPalindrome("MoM"));

	}

	public static boolean isPalindrome(String s) {
		if ( s.length() <= 1)
			return true;
		else if ( s.charAt(0)!= s.charAt(s.length()-1))
			return false;
		else
			return isPalindrome(s.substring(1, s.length() - 1));
	}
}
