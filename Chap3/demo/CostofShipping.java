package demo;

import java.util.*;

public class CostofShipping {

	public static void main(String[] args) {
		
		System.out.println("Now input the weight of your package");
		
		Scanner input = new Scanner(System.in);
		
		int weight = input.nextInt();
		
		double price = 0 ; 
		
		if ( weight <= 1)
		{
			price = weight * 3.5 ;
			System.out.println(" The price you should pay is "+price);
		}
		
		else if (weight <= 3)
		{
			price = 3.5 + ( weight -1 )*5.5;
			System.out.println(" The price you should pay is "+ price);
		}
		
		else if (weight <= 10)
		{
			price = 14.5 + (weight -4)*8.5;
			System.out.println("The price you should pay "+ price);
		}
		else if (weight <=20)
		{
			price = 59.5 + ( weight - 10)*10.5;
			System.out.println("The price you should pay is" + price);
		}
	
	}

}
