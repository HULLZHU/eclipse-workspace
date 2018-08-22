package demo;

import java.util.*;

public class TestBooleanOperators {

	public static void main(String[] args) {
		
		System.out.println("Input a number");
		
		Scanner input=new Scanner(System.in);
		
		int number = input.nextInt();
		
		if(number%2==0&&number%3==0)
			System.out.println("The number is divisable by 2 and 3");
		
		if(number%2==0||number%3==0)
			System.out.println("The number is divisable by 2 or 3");
		
		if(number%2==0^number%3==0)
			System.out.println("The number is divisable by 2 or 3 but not both");
		
		// TODO Auto-generated method stub

	}

}
