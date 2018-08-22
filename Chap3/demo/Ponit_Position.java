package demo;

import java.util.Scanner;

public class Ponit_Position {

	public static void main(String[] args) {
		
		System.out.println(" Please input the coordinate of p0, p1 points");
		
		Scanner input = new Scanner(System.in);
		
		double x0 = input.nextDouble();
		
		double y0 = input.nextDouble();
		
		double x1 = input.nextDouble();
		
		double y1 = input.nextDouble();
		
		System.out.println("Input the coordinate of p2 point ");
		
		double x2 = input.nextDouble();
		
		double y2 = input.nextDouble();
		
		double judgement_value = ( x1 - x0 )* ( y2 - y0) - (x2 - x0 )*( y1 - y0);
		
		if ( judgement_value > 0)
		{
			System.out.println("P2 is on the side of the line ");
		}
		
		if ( judgement_value == 0)
		{
			System.out.println(" P2 is on the same line");
		}
		
		if (judgement_value<0)
		{
			System.out.println(" P2 is out of the side of line");
		}
		
		
		// TODO Auto-generated method stub

	}

}
