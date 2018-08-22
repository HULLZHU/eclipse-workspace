package demo;

import java.util.*;

import java.math.*;

public class EquilityTestofTwoFloatingValues {

	public static void main(String[] args) {
		
		System.out.println("Enter an input y");
		
		Scanner input = new Scanner(System.in);
		
		final double EPSILON = 1E-14;
		
	    double x = 1-0.1-0.1-0.1-0.1-0.1;
		
		double y = input.nextDouble();
		
		if(Math.abs(x-y)<EPSILON)
		{
			System.out.println(x+"is approximately"+y);
		}
		else
		{
			System.out.println("The x and y cannot be equal");
		}
		// TODO Auto-generated method stub

	}

}
