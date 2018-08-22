package demo;

import java.util.*;

public class Divisibly_by_5_and_6 {
	
	public static void main(String[] args)
	{
		System.out.println("Now input a number");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		if ( num%5==0 && num%6==0)
		{
			System.out.println("This number is divisible by 5 and 6");
		}
		else if ( num% 5 ==0|| num% 6 ==0)
		{
			System.out.println(" This number is divisible by 5 or 6");
		}
		
		else if ((num%5 == 0& num%6 != 0)&(num%6 ==0 & num%5!=0))
		{
			System.out.println("The number is divisible by 5 or 6 but not both");
		}
	}

}
