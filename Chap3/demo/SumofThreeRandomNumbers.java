package demo;

import java.util.*;

public class SumofThreeRandomNumbers {

	public static void main(String[] args) {
		
		System.out.println("Now I will give you three numbers");
		
		int number1 = (int)(Math.random()*10);
		
		int number2 = (int)(Math.random()*10);
		
		int number3 = (int)(Math.random()*10);
		
		System.out.println("Please compute "+number1+"+"+number2+"+"+number3);
		
		int answer = number1 + number2 +number3 ; 
		
		System.out.println("Now input your answer");
		
		Scanner input = new Scanner(System.in);
		
		int your_answer = input.nextInt();
		
		if( your_answer == answer )
		{
			System.out.println("Your answer is right");
		}
		
		else 
		{
			System.out.println("Sorry, your answer is not right");
		}
		// TODO Auto-generated method stub

	}

}
