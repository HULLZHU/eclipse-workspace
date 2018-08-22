package demo;

import java.util.*;

public class Point_in_Circle {

	public static void main(String[] args) {
		
		System.out.println(" Now input the coordinate of the point");
		
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		
		double y = input.nextDouble();
		
		double sqr_of_distance =  (Math.pow(x, 2)+Math.pow(y,2));
		
		double distance = Math.pow(sqr_of_distance, 0.5);
		
		if (distance <= 10)
		{
			System.out.println("The point is in the circle");
		}

	}

}
