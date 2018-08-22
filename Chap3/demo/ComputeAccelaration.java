package demo;

import java.util.Scanner;

public class ComputeAccelaration {

	public static void main(String[] args) {
		
		System.out.print("Please enter the beginning velocity , ending velocity and timing in order");
		
		Scanner input = new Scanner(System.in);
		
		float beginningVelocity= input.nextFloat();
		
		float endingVelocity= input.nextFloat();
		
		float timing= input.nextFloat();
		
		float averageAcceleration = (beginningVelocity-endingVelocity)/timing;
		
		System.out.println("The average accelaration during this motion is "+ averageAcceleration);
		
		
		// TODO Auto-generated method stub

	}

}
