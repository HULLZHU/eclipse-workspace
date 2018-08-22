package demo;

import java.util.Scanner;

public class Point_in_Triangle {

	public static void main(String[] args) {
		
		System.out.println("Now please input the coordinate of the point");
		
		Scanner input = new Scanner(System.in);
		
		double x= input.nextDouble();
		
		double y = input.nextDouble();
		
		if ( x<200 && x>0 && y<0 && y<100)
		{
			if ( y <-0.5 * x +100)
				System.out.println("The point is in the triangle");
			else
			{
				System.out.println(" The point is out of the triangle");
			}
		}
		
		else
		{
			System.out.println("The point is out of the triangle");
		}
		
		// TODO Auto-generated method stub

	}

}
