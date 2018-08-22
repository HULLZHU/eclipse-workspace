package demo;

import java.util.*;

public class SimpleIfDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer");
		
		Scanner input= new Scanner(System.in);
		
		int number = input.nextInt();
		
		if (number%5==0)
		{
			System.out.println("The number"+number+"is a HiFive");	
		}
		
		if (number%2==0)
		{
			System.out.println("The number"+number+" is a Hieven ");
			}

	}

}
