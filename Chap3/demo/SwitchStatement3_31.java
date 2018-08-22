package demo;

import java.util.Scanner;

public class SwitchStatement3_31 {

	public static void main(String[] args) {
		
		System.out.println("Input a number");
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		int a = 3;
		
		switch (x%4)
		{
		case 0 : 
			x+=34;
			System.out.println("The number is"+x );
			
		case 1:
			x+=10;
			System.out.println("The number is"+x);
		
		case 2: 
			x+=16;
			System.out.println("The number is"+x);
			
		case 3 :
			x+=34;
			System.out.println("The number is"+x);
		}
		
		
		// TODO Auto-generated method stub

	}

}
