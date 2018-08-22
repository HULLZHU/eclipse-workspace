package demo;

import java.util.Scanner;

public class ComputetheSumofSubtotalandGratuity {

	public static void main(String[] args) {
		
		System.out.println("Enter the subtotal and gratuity rate");
		
		Scanner input = new Scanner(System.in);
		
		double subtotal = input.nextDouble();
		
		double gratuityRate =  input.nextDouble();
		
		double gratuity = subtotal * gratuityRate ;
		
		System.out.println("The total amount of subtotal and gratuity is " + (gratuity + subtotal));
		
		
		
		// TODO Auto-generated method stub

	}

}
