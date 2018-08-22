package demo;

import java.util.Scanner;

public class FeettoMeters {
	
	public static void main(String[] args) {
	
		System.out.print("Enter the feet");
		
		Scanner input = new Scanner(System.in);
		
		double feet = input.nextDouble();
		
		double meters = feet* 0.305 ;
		
		System.out.println("The meter of "+ feet +" feet is "+meters+ "meters");
		
	}

}
