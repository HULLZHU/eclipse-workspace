package demo;

import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println(" Input a three-digit number, is it a palindrome number");
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = a%10 ;
		
		int c =(int)(a/100.0);
		
		if (b==c)
		
			System.out.println(" The number is a palindrome");
		else
			System.out.println("It is not a palindrome");
			
	 
		
		
		// TODO Auto-generated method stub

	}

}
