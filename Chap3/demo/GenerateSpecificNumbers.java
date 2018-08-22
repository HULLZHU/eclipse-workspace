package demo;

import java.math.*;

public class GenerateSpecificNumbers {

	public static void main(String[] args)
	{
		System.out.println("Display a random xxx.x");
		
		int num1 = (int)(Math.random()*10000);
		
		double num1_=num1/10.0;
		
		System.out.println("The number1 is"+num1_);
		
		
	    /////////////////////////////////////////////////////////
		
		
		System.out.println("Display random 0.x");
		
		
		double num2=Math.random();
		
		System.out.println("The number2 is "+num2);
		
		////////////////////////////////////////////////////////
		
		System.out.println("Display the number xx");
		
		double num3=Math.random()*100;
		
		int num3_=(int)num3;
		
		System.out.println("The number3 is "+num3_);
		
		
		///////////////////////////////////////////////////////
		
		System.out.println("Display the number 0.xxx");
		
		double num4=Math.random()*1000;
		
		double num4_=((int)(num4))/1000.0;

		System.out.println("The number4 is"+num4_);
				
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
