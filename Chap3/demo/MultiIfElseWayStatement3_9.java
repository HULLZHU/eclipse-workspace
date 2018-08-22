package demo;

import java.util.Scanner;

public class MultiIfElseWayStatement3_9 {

	public static void main(String[] args) {
		
		System.out.println("Input 2 numbers");
		
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		
		double y = input.nextDouble();
		
		if (x>2)
		
			if (y>2)
			{
				double z = x+y;
				System.out.println("z is "+z);
			}
	    else
			
				System.out.println("x is "+x);
	}
			
	}


