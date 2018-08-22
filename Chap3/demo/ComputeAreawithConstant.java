package demo;
import java.util.*;

public class ComputeAreawithConstant {

	public static void main(String[] args) {
		
		final double PI=3.1415926;
		
		//prompt the user to enter a radius
		System.out.println("Enter a number for radius");
	
		//Create scanner project
		Scanner input= new Scanner(System.in);
	
		short radius=input.nextShort();

		double area=PI*radius*radius;
		
		//display result
		
		System.out.println("The area for the circle of radius"+radius+"is"+area);
		
		
		
		
				
		
	}

}
