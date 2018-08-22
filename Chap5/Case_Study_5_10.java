import java.util.*;
public class Case_Study_5_10 {

	public static void main(String[] args) {
		
		System.out.println("Please input a word");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		int low = 0;
		
		int high = s1.length()-1;
		
		boolean isPalindrome = true;
		
		while ( low < high) {
			if (s1.charAt(low)!=s1.charAt(high)) {
				isPalindrome =false;
				break;
			}
			low ++;
			high --;
		}
		
		if (isPalindrome)
		{
			System.out.println(s1 + " is a palindrome");
		}
		else
			System.out.println(s1 + " is not a palindrome");
		
		
		// TODO Auto-generated method stub

	}

}
