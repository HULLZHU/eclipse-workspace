package demo;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter the coordinate of three points in order ");
		
		Scanner input=new Scanner(System.in);
		
		double x1=input.nextDouble();
		
		double y1=input.nextDouble();
		
		double x2=input.nextDouble();
		
		double y2=input.nextDouble();
		
		double x3=input.nextDouble();
		
		double y3=input.nextDouble();
		
		double s1=Math.pow((Math.pow(x2-x1, 2)+Math.pow(y2-y1,2)),1.0/2);
		
		double s2=Math.pow((Math.pow(x2-x3, 2)+Math.pow(y2-y3,2)),1.0/2);
		
		double s3=Math.pow((Math.pow(x3-x1, 2)+Math.pow(y3-y1,2)),1.0/2);
		
		double s=(s1+s2+s3)/2.0;
		
		double area=Math.pow(s*(s-s1)*(s-s2)*(s-s3), 1.0/2);
		
		System.out.println("The area of the triangle is"+area);
		
		
		
		// TODO Auto-generated method stub

	}

}
