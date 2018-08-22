package demo;

import java.util.Scanner;

public class DisplaythePopulationInfuture {

	public static void main(String[] args) {
		
		System.out.println("Enter a period of year");
		
		double birthVelocity = 1.0/7;
		
		double deathVelocity = 1.0/13;
		
		double immigrantVelocity=1.0/45;
		
		double sumVelocity=birthVelocity-deathVelocity+immigrantVelocity;

		Scanner input= new Scanner(System.in);
		
		double year = input.nextDouble();
		
		double sumSeconds=365*24*60*year;
		
		double sumPopulation=312032486+(sumSeconds*sumVelocity);
		
		System.out.print("The sum of population in "+year+"years is "+sumPopulation);
		
		
		
		// TODO Auto-generated method stub

	}

}
