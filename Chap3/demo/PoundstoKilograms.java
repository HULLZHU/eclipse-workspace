package demo;

import java.util.*;

public class PoundstoKilograms {

	public static void main(String[] args) {
	
		System.out.print("Enter the pounds of goods");
		
		Scanner input = new Scanner(System.in);
		
		double pounds = input.nextDouble();
		
		double kilograms = 0.454 * pounds ;
		
		System.out.println(pounds+"pounds is equal to "+ kilograms +"kilograms");
		
		// TODO Auto-generated method stub

	}

}
