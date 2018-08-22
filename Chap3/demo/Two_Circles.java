package demo;

import java.util.*;

public class Two_Circles {

	public static void main(String[] args) {
		
		System.out.println(" please input the center coordinate of two circles");
		
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		
		double y2 = input.nextDouble();
		
		System.out.println(" Please input the radius of circles");
		
		double radius1 = input.nextDouble();
		
		double radius2 = input.nextDouble();
		
		double distance = Math.pow( Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1), 2), 0.5);
		
		if ( distance < Math.abs(radius2-radius1))
				{
			System.out.println(" One circle is inside another one");
				}
		else if ( distance < (radius1 + radius2))
		{
			System.out.println(" One circle overlaps another one");
		}
		else 
		{
			System.out.println(" These two circles have no common field");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
