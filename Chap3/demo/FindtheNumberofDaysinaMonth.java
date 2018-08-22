package demo;

import java.util.*;

public class FindtheNumberofDaysinaMonth {

	public static void main(String[] args) {
		
		System.out.println("Input the year and the month");
		
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		
		int month = input.nextInt();
		
		switch (month)
		{
			
			case 1: System.out.println(" This month has 31 days");
			break ; 
			
			case 2:{ 
				if ((year-2000)%4==0)
			{
				System.out.println("This month has 29 days");
			}
			else 
			{
				System.out.println("This month has 28 days");
			}
			break;
			}
			
			case 3: System.out.println("This month has 31 days");
			break ; 
			
			case 4:System.out.println("This month has 30 days");
			break ; 
			
			case 5:System.out.println("This month has 31 days");
			break ; 
			
			case 6:System.out.println("This month has 30 days");
			break ; 
			
			case 7:System.out.println("This month has 31 days");
			break ; 
			
			case 8 :System.out.println("This month has 31 days");
			break ; 
			
			case 9:System.out.println("This month has 30 days");
			break ; 
			
			case 10:System.out.println("This month has 31 days");
			break ; 
			
			case 11:System.out.println("This month has 30 days");
			break ; 
			
			case 12:System.out.println("This month has 31 days");
			break ; 
			}
		
		}
		
		
		
		// TODO Auto-generated method stub

	}


