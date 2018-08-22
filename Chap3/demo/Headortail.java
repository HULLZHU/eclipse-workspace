package demo;

import java.util.*;

public class Headortail {

	public static void main(String[] args) {
		
		System.out.println("如果是正面，输入1，如果是反面输入0");
		
		Scanner input = new Scanner(System.in);
		
		int your_answer = input.nextInt();
		
		int real_answer = (int)(Math.random()+0.5);
		
		if ( real_answer == your_answer)
		{
			System.out.println("You are right");
		}
		
		else
		{
			System.out.println("You are not right");
		}
		
				
				
		// TODO Auto-generated method stub

	}

}
