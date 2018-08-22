package demo;

import java.util.*;

public class FahrenheitoCelsius {

	public static void main(String[] args) {
		
		//Prompt the user to enter a number
		System.out.println("Input the degree represented in Fahrenhei");
		
		//Enter the number
		Scanner input= new Scanner(System.in);
		
		//Define variables
		double Fahrenheit = input.nextDouble();
		
		double Celcius = (5.0/9)*(Fahrenheit-32);
		
		System.out.println("The degree of temprature represented in Celcius is"+Celcius);
		
		// TODO Auto-generated method stub

	}

}
