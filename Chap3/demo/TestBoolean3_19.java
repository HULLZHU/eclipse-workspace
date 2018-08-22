package demo;

import java.util.*;

public class TestBoolean3_19 {

	public static void main(String[] args) {
		
		System.out.println("Input a number");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		boolean true_or_false=(number<100&&number>0);
		
		System.out.println("The number is between 0 and 100 is "+true_or_false);
		
		// TODO Auto-generated method stub

	}

}
