package demo;

import java.util.Scanner;

public class DistanceofTwoPoint {

	public static void main(String[] args) {
		
		System.out.print("Please Enter the first point's coordinate");
		
		Scanner input=new Scanner(System.in);
		
		float x1=input.nextFloat();
		
		float y1=input.nextFloat();
		
		System.out.print("Please Enter the second point's coordinate");
		
		float x2=input.nextFloat();
		
		float y2=input.nextFloat();
		
		float distanceBetweenX=x1-x2;
		
		float distanceBetweenY=y1-y2;
		
		double sumofSquare=(Math.pow(distanceBetweenX, 2)+Math.pow(distanceBetweenY, 2));
		
		double distance=Math.pow(sumofSquare, 1.0/2);
		
		System.out.println("The distance between two point is "+distance);
		
		
		// TODO Auto-generated method stub

	}

}
