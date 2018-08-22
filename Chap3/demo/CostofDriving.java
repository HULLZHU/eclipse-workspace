package demo;

import java.util.Scanner;

public class CostofDriving {

	public static void main(String[] args) {
		
		System.out.print("Input your trip distance, fuel efficiency and price of gallon");
		
		Scanner input=new Scanner(System.in);
		
		double distance=input.nextDouble();
		
		double fuelEfficiency=input.nextDouble();
		
		double priceofGallon=input.nextDouble();
		
		double usedAmountofGallon=distance/fuelEfficiency;
		
		double sumCost=usedAmountofGallon*priceofGallon;
		
		System.out.print("The sum cost value of Gallon is"+ sumCost);
		// TODO Auto-generated method stub
		

	}

}
