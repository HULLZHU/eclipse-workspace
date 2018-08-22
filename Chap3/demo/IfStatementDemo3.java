package demo;

import java.util.*;

public class IfStatementDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner input = new Scanner(System.in);
		
		float score = input.nextFloat();
		
		if (score>=90)
		{
			System.out.println("A");
		}
		else if (score>=80)

		{
			System.out.println("B");
		}
		else if (score>=70)
		{
			System.out.print("C");
		}
		else if (score>=60)
		{
			System.out.print("D");
		}
		else
		{
			System.out.println("This student failed to pass the examination");
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
