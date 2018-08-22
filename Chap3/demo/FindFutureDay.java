package demo;

import java.util.*;

public class FindFutureDay {

	public static void main(String[] args) {
		
		System.out.println("Please enter an integer for today's day");
		
		Scanner input = new Scanner(System.in);
		
		int today_day = input.nextInt();
		
		switch(today_day)
		{
		case 1:
			System.out.println("Today is Monday");
			break;
			
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday" );
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
		case 7:
			System.out.println("Today is Sunday");
			
		}
		
		System.out.println("Input a number");
		
		int days_aftertoday = input.nextInt();
		
		int remainder = (today_day+days_aftertoday)%7 ;
		
		int sum_of_days = remainder;
		
		switch(sum_of_days)
		
		{
		case 1:
			System.out.println("The future day is Monday");
			break;
			
		case 2:
			System.out.println("The future day is Tuesday");
			break;
		case 3:
			System.out.println("The future day is Wednesday" );
			break;
		case 4:
			System.out.println("The future day is Thursday");
			break;
		case 5:
			System.out.println("The future day is Friday");
			break;
		case 6:
			System.out.println("The future day is Saturday");
		case 7:
			System.out.println("The future day is Sunday");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
