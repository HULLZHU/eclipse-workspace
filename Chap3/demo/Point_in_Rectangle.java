package demo;

import java.util.Scanner;

public class Point_in_Rectangle {

	public static void main(String[] args) {
		
		System.out.println(" Please input a point");
		
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		
		double y = input.nextDouble();
		
		if ( x <=5 && x >= -5 &&y < 2.5 && y>-2.5)
		{
			System.out.println(" The point is within the range of rectangle");
		}
		
		else 
		{
			System.out.println(" The point is out of the range of rectangle");
		}

		
	}

}
