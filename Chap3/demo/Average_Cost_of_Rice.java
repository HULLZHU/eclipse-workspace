package demo;

import java.util.*;

public class Average_Cost_of_Rice {

	public static void main(String[] args) {
		
		System.out.println("Now please enter the weight of each two package of rice ");
		
		Scanner input = new Scanner(System.in);
		
		double w1 = input.nextDouble();
		
		double w2 = input.nextDouble();
		
		System.out.println("Please enter the price of each two package of rice ");
		
		double price1 = input.nextDouble();
		
		double price2 = input.nextDouble();
		
		if ( price1 / w1 > price2/w2)
		{
			System.out.println("The price of the first package is higer");
		}
		
		else if ( price1 / w1 < price2 / w2)
		{
			System.out.println("The price of the second package is higher");
		}
		
		else
		{
			System.out.println(" The price of this two package is same");
		}
		
		// TODO Auto-generated method stub

	}

}
