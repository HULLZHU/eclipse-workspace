package demo;

import java.util.*;

public class ComputingTaxFilter {

	public static void main(String[] args) {
		
		System.out.println("Choose your status");
		
		System.out.println("If you are single, input 0");
		
		System.out.println("If you are Married Filing Joinly or Qualifying Widower,Input 1");
		
		System.out.println("If you are Married Filing Seperately£¬ Input 2");
		
		System.out.println("If you are head of houshold, input 3");
		
		System.out.println("Input your annual salary");
		
		Scanner input = new Scanner(System.in);
		
		int status = input.nextInt();
		
		int salary = input.nextInt();
		
		if (status == 0)
		{
			if ( salary < 8350)
			{
				System.out.println("you should pay" + salary * 0.1);	
			}
			else if ( salary < 33950)
			{
				System.out.println("you should pay"+ salary *0.15);
			}
			else if (salary <82250)
			{
				System.out.println("You should pay"+ salary*0.25);
			}
			else  if (salary < 171550)
			{
				System.out.println("You should pay"+ salary * 0.28);
			}
			else if ( salary < 372950)
			{
				System.out.println("You should pay"+salary*0.33);
			}
			else
			{
				System.out.println("You should pay"+ salary * 0.35);
			}
		
		}
		if (status == 1)
		{
			if ( salary < 16700)
			{
				System.out.println("you should pay" + salary * 0.1);	
			}
			else if ( salary < 67900)
			{
				System.out.println("you should pay"+ salary *0.15);
			}
			else if (salary <137050)
			{
				System.out.println("You should pay"+ salary*0.25);
			}
			else  if (salary < 208850)
			{
				System.out.println("You should pay"+ salary * 0.28);
			}
			else if ( salary < 372950)
			{
				System.out.println("You should pay"+salary*0.33);
			}
			else
			{
				System.out.println("You should pay"+ salary * 0.35);
			}
		
		}
		
		if (status == 2)
		{
			if ( salary < 8350)
			{
				System.out.println("you should pay" + salary * 0.1);	
			}
			else if ( salary <33950)
			{
				System.out.println("you should pay"+ salary *0.15);
			}
			else if (salary <68525)
			{
				System.out.println("You should pay"+ salary*0.25);
			}
			else  if (salary < 104425)
			{
				System.out.println("You should pay"+ salary * 0.28);
			}
			else if ( salary <186475)
			{
				System.out.println("You should pay"+salary*0.33);
			}
			else
			{
				System.out.println("You should pay"+ salary * 0.35);
			}
		
		}
		if (status == 3)
		{
			if ( salary < 11950)
			{
				System.out.println("you should pay" + salary * 0.1);	
			}
			else if ( salary <45500)
			{
				System.out.println("you should pay"+ salary *0.15);
			}
			else if (salary <117450)
			{
				System.out.println("You should pay"+ salary*0.25);
			}
			else  if (salary < 190200)
			{
				System.out.println("You should pay"+ salary * 0.28);
			}
			else if ( salary < 372950)
			{
				System.out.println("You should pay"+salary*0.33);
			}
			else
			{
				System.out.println("You should pay"+ salary * 0.35);
			}
		
		}
		

	}

}
