package demo;

import java.util.*;

public class Additionquiz2nd {

	public static void main(String[] args) {
		
		System.out.println("Now we will give you three number");
		
		int num_1 = (int)(Math.random()*10);
		
		int num_2 = (int)(Math.random()*10);
		
		int num_3 = (int)(Math.random()*10);
		
		System.out.println("They are "+num_1+" and "+num_2+" and "+num_3);
		
		System.out.println("Please give addition of three numbers");
		
		Scanner input = new Scanner(System.in);
		
		int your_answer=input.nextInt();
		
		System.out.println("The answer of"+num_1+"+"+num_2+"+"+num_3+" is "+ (your_answer==num_1+num_2+num_3));
		
		
		
		// TODO Auto-generated method stub

	}

}
