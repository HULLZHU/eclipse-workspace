package demo;

import java.util.Scanner;

public class SelectionAreaofCircle {

	public static void main(String[] args) {
		
		System.out.print("Please Enter the radius of circle");
		
		Scanner input = new Scanner(System.in);
		
		double radius=input.nextDouble();
		
		double pi=3.1415926;
		
		double area=pi*radius*radius;
		if (radius<0)
		{
			System.out.print("Incorrect input");
		}
		else 
		{ 
			System.out.println("The area of the circle is"+area);
		}
		
		
		// TODO Auto-generated method stub

	}

}
