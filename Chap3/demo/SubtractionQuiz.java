package demo;

import java.util.*;

import java.math.*;

public class SubtractionQuiz {

	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("Now let us do some substraction");
		
		int a =(int)(Math.random()*10);
		
		int b =(int)(Math.random()*10);
		
		if(a<b)
		{
			int temp =a;
			a=b;
			b=temp;
		}
		
		
		int correct_result=a-b;
		
	
		{
		System.out.println("Please compute"+a+"-"+b);
		
		Scanner input = new Scanner(System.in);
		
		int user_result = input.nextInt();
		
		if (user_result==correct_result)
		{
			System.out.println("Your answer is correct");
		}
		else                                      
		{
			System.out.println("Your answer is wrong");
		}
		
	
		// TODO Auto-generated method stub

	    }
	}

}

