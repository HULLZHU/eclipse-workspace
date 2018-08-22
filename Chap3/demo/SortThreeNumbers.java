package demo;

import java.util.*;
public class SortThreeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Input three numbers");
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = input.nextInt();
			
		int c = input.nextInt();
		
		int t = 0; 
		
		
		if ( a > b )
		{
			t = b;
			
			b = a;
			
			a = t;
			
		}
		
		if ( b > c)
		{
			 t = c;
			 
			 c = b;
			 
			 b = t;
		}
		

		if ( a > b )
		{
			t = b;
			
			b = a;
			
			a = t;
			
		}
		
		System.out.println("These three number are diplayed in order as"+a+" "+b+" "+c);
		
		// TODO Auto-generated method stub

	}

}
