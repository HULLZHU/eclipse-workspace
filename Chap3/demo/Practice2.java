package demo;

import java.util.Scanner;

import java.math.*;

public class Practice2 {

	public static void main(String[] args) {
System.out.println("Input two number x and y to compute xy^2");
		
		Scanner input = new Scanner (System.in);
		
		double x = input.nextDouble();
		
		double y = input.nextDouble();
		
		double z=Math.pow(y,2);
		
		double s=x*z;
		
		System.out.println("The value of x*y^2 is"+s);
		

	}

}
