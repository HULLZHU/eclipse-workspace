package demo;

import java.util.Scanner;

public class CalculatetheEnergyNeededtoHeatWater {

	public static void main(String[] args) {
		
		System.out.println("Enter the amount of water in kg, initial temperature and final temperature");
		
		Scanner input = new Scanner(System.in);
		
		double m=input.nextDouble();
		
		double initialTemperature = input.nextDouble();
		
		double finalTemperature = input.nextDouble();
		
		double Q=m*(finalTemperature-initialTemperature);
		
		System.out.println("The energy needed is "+Q);
		
		
		
		// TODO Auto-generated method stub

	}

}
