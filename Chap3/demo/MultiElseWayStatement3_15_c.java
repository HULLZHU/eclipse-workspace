package demo;

import java.util.Scanner;

public class MultiElseWayStatement3_15_c {
	
	public static void main(String[]args) {
		

		System.out.println("Input a number");
		
		Scanner input= new Scanner(System.in);
		
		//remember to compare it to the 3_14 b
		
		double number = input.nextDouble();
		
		double x=number%2.0;
		
		double y=number%5.0;
		
		System.out.println("The value of x is"+x+", The value of y is"+y);
		
		if(x==0)
			System.out.println(number+"is even");
		
		
		//try to delete the "else" to have one another result
		
		
		else if(y==0)
		    System.out.println(number+"is multiple of five");
		    
	}

}

