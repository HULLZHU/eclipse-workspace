package demo;

import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		
		System.out.print("Enter your weight in pounds and your height in inches");
		
		Scanner input=new Scanner(System.in);
		
		double pounds= input.nextDouble();
		
		double inches=input.nextDouble();
		
		double BMI=(pounds*0.45359237)/(inches*0.0254);
		
		System.out.println("The BMI of you is" + BMI);
		// TODO Auto-generated method stub

	}

}
