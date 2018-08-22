package demo;

import java.util.Scanner;

public class MultiElseWayStatement3_15b {

	public static void main(String[] args) {
		

		System.out.println("Input a number");
		
		Scanner input= new Scanner(System.in);
		
		//remember to compare it to the 3_14 a
		
		int number = input.nextInt();
		
		if(number%2==0)
			
			System.out.println(number+"is even");
		
		else if(number%5==0)
		    System.out.println(number+"is multiple of five");
		    
		// TODO Auto-generated method stub

	}

}
