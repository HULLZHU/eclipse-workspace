package demo;

import java.util.*;

import java.math.*;

public class ComputetheDayinSeveraldays {

	public static void main(String[]args)
	{   
		Scanner input=new Scanner(System.in);
		
				//input the day today
		
				//input the number of day by which you need to compute the day in the future
		
				System.out.println("Input the day of today, the number is limited between 1-7");
				
				int today=input.nextInt();
				
				int severaldays=input.nextInt();
				
				int transistor= today + severaldays; 
				
				int dayinfuture = transistor%7;
				
				System.out.print("Today is the "+ today+"th day in a week, and in "+severaldays+"it will be the"+dayinfuture+"th in a week");
		
		
	}
}
