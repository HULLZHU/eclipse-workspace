package demo;

import java.util.*;

public class AdditionLessThan100 {

	public static void main(String[] args) {
		
		System.out.println("Please Compute the addition of following 2 numbers");
		
		int random_num1= (int)(100*Math.random());
		
		int random_num2= (int)(100*Math.random());
		
		int sum = random_num1 + random_num2 ;
		
		System.out.println("The two numbers are"+random_num1+"and"+random_num2);
		
	    Scanner input = new Scanner(System.in);
	    
	    int your_answer = input.nextInt();
	    
	    if (your_answer == sum)
		
	    {
	    	System.out.println(" Your answer is true");
	    }
	    
	    else 
	    {
	    	System.out.println("The true answer is "+sum);
	    }
		
		
		
		// TODO Auto-generated method stub

	}

}
