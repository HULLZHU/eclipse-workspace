package demo;

import java.util.*;

public class IfElseStatementDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner input = new Scanner(System.in);
		
		double radius=input.nextDouble();
		
		float PI=(float) 3.14;
		
		if(radius>=0) {
			System.out.println("The area of the circle is"+PI*radius*radius);
		}
		
		else
		{
			System.out.print("Input Error Occurs");
		}
		
		// TODO Auto-generated method stub

	}

}
