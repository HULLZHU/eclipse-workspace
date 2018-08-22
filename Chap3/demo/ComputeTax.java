package demo;

import java.util.*;

public class ComputeTax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("If you are Single, Input 0");
		
		System.out.println("If you are Married Filing Jointly or Qualifying Widower, Input 1");
		
		System.out.println("If you are Married Filing Seperately,Please Input 2");
		
		System.out.println("If you are head of houshold, please Input 3");
		
		System.out.print("Please input your income");
		
		Scanner input1 = new Scanner(System.in);
		
		double status = input1.nextDouble();
		
		double income = input1.nextDouble();
		
		double tax = 0;
		
		////////////////////////////////////////////////////////////
		if (status==0)
		{
			if (income<=8350&&income>=0)
			{
				tax = income*0.1;
				
			}
			
			else if (income<=33950)
			{
				tax= income *0.15 ;
			}
			
			else if (income<=82250)
			{
				tax=income*0.25;
			}
			else if (income<=171550)
			{
				tax=income*0.28;
			}
			else if (income<=372950)
			{
				tax = income * 0.33;
			}
			else
			{
				tax = income*0.35;
			}
		}
		
		
		///////////////////////////////////////////
		if (status==1)
		{
			if (income<=16700&&income>=0)
			{
				tax = income*0.1;
				
			}
			
			else if (income<=67900)
			{
				tax= income *0.15 ;
			}
			
			else if (income<=137050)
			{
				tax=income*0.25;
			}
			else if (income<=208850)
			{
				tax=income*0.28;
			}
			else if (income<=372950)
			{
				tax = income * 0.33;
			}
			else
			{
				tax = income*0.35;
			}
		}
		
		/////////////////////////////////////////////
		if (status==2)
		{
			if (income<=8350&&income>=0)
			{
				tax = income*0.1;
				
			}
			
			else if (income<=33950)
			{
				tax= income *0.15 ;
			}
			
			else if (income<=68525)
			{
				tax=income*0.25;
			}
			else if (income<=104425)
			{
				tax=income*0.28;
			}
			else if (income<=186475)
			{
				tax = income * 0.33;
			}
			else
			{
				tax = income*0.35;
			}
		}
		
		
		////////////////////////////
		
		
		if (status==3)
		{
			if (income<=11950&&income>=0)
			{
				tax = income*0.1;
				
			}
			
			else if (income<=645500)
			{
				tax= income *0.15 ;
			}
			
			else if (income<=117450)
			{
				tax=income*0.25;
			}
			else if (income<=190200)
			{
				tax=income*0.28;
			}
			else if (income<=372950)
			{
				tax = income * 0.33;
			}
			else
			{
				tax = income*0.35;
			}
		}
		
		else 
			System.out.println("Error : invalid status");
		    
		    
		
		System.out.println("The tax you should pay is"+tax);
		
		// TODO Auto-generated method stub

	}

}
