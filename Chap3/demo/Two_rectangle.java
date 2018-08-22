package demo;

import java.util.*;

public class Two_rectangle {

	public static void main(String[] args) {
		
		System.out.println("Please enter the center coordinates of two rectangles");
		
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		
		double y2 = input.nextDouble();
		
		System.out.println("Please enter width and height of these two rectangles");
		
		double width1 = input.nextDouble();
		
		double height1 = input.nextDouble();
		
		double width2 = input.nextDouble();
		
		double height2 = input.nextDouble();
		
		double xA = x1 - 0.5 * width1;
		
		double yA = y1 + 0.5 * height1;
		
		double xB = x1 + 0.5 * width1;
		
		double yB = x1 + 0.5 * height1;
		
		double xC = xA ;
		
		double yC = y1 - 0.5 *width1;
		
		double xD = xB;
		
		double yD = yC;
		
		double xa = x2 - 0.5 * width2;
		
		double ya = y2 + 0.5 * height2;
		
		double xb = x2 + 0.5 * width2;
		
		double yb = ya;
		
		double xc = xa;
		
		double yc = x2 - 0.5 * height2;
		
		double xd= xb;
		
		double yd= xc;
		
		if ( xb < xA && xc > xB && yc > yA && ya < yC)
		{
			System.out.println(" This two rectangle have no common field");
		}
		
		else if ( xA < xa && xB > xb && yc > yC  && ya < yB  )
		{
		System.out.println("The small one is included in the big one");	
		}
		
		else
		{
			System.out.println(" These two one are overlapped by each other");
		}

		
		// TODO Auto-generated method stub

	}

}
