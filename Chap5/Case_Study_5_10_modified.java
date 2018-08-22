import java.util.Scanner;

public class Case_Study_5_10_modified {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String s = input.nextLine();
		
		boolean isPalindrome = true;
		
		for ( int low =0, high = s.length(); low < high-1-low ; low++)
		{
			if ( s.charAt(low)!=s.charAt(high-1-low))
			{
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome)
			System.out.println(s + " is a Palindrome");
		else
			System.out.println(s + " is not a palindrome");
		
		// TODO Auto-generated method stub

	}

}
