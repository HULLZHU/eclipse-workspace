package demo;

import java.math.*;

import java.util.*;

public class PowerExponent {

	public static void main(String[] args) {
		
		//prompt the user to enter a number
		
		System.out.print("Please enter a number");
		
		//Enter a number
		
		Scanner input= new Scanner(System.in);
		
		//type and assign value
		
		double a=input.nextDouble();
		
		double b=input.nextDouble();
		
		//Numeric computation
		double c=Math.pow(a,b);
		
		//display the result
		System.out.print("The exponent power number of "+a+"and"+b+"is"+c);
		
		
		
	}

}
