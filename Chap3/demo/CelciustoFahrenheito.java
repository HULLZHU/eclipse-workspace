package demo;

import java.util.*;

import java.math.*;

public class CelciustoFahrenheito {

	public static void main(String[] args) {
		
		System.out.println("Please enter the degree of Celcius");
		
		Scanner input = new Scanner(System.in);
		
		double Celcius = input.nextDouble();
		
		double Fahrenheito = (9.0/5)*Celcius +32 ;
		
		System.out.println("The degree converted into the Fahrenheito is" + Fahrenheito);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
