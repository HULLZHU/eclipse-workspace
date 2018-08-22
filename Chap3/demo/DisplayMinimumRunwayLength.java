package demo;

import java.util.Scanner;

public class DisplayMinimumRunwayLength {

	public static void main(String[] args) {
		
		System.out.println("Input velocity and acceleration per second");
		
		Scanner input= new Scanner(System.in);
		
		double velocity=input.nextDouble();
		
		double acceleration=input.nextDouble();
		
		double length=(Math.pow(velocity, 2))/(2*acceleration) ;
		
		System.out.println("The minimum length needed is" +length);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
