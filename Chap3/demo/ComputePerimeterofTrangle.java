package demo;

import java.util.*;

public class ComputePerimeterofTrangle {

	public static void main(String[] args) {
		
		System.out.println("Now please input three edges of triangle");
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = input.nextInt();
		
		int c= input.nextInt();
		
		if ( (a+b>c) || (a+c > b) || ( b + c > a))
		{
			int perimeter = a + b + c;
			
			System.out.println(" The perimeter of this triangle is " + perimeter);
		}
			
			
		// TODO Auto-generated method stub

	}

}
