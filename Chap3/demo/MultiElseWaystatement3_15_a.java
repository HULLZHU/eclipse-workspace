package demo;

import java.util.*;

public class MultiElseWaystatement3_15_a {
	
	public static void main(String[]args) {
		
		System.out.println("Input a number");
		
		Scanner input= new Scanner(System.in);
		
		//remember to compare it to the 3_14 b
		
		double number = input.nextDouble();
		
		if(number%2.0==0)
			System.out.println(number+"is even");
		
		if(number%5.0==0)
		    System.out.println(number+"is multiple of five");
		    
	}

}
