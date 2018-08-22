package demo;

import java.util.*;
//载入 java.util package

public class ComputeVolumewithConsoleInput {

	public static void main(String[] args) {
			
		System.out.println("Enter radius");
		//提示用户输入半径
		
		Scanner input= new Scanner (System.in);
		
		System.out.print("Enter height");
		//提示用户输入高
		
		Scanner input2= new Scanner (System.in);
		
		double radius=input.nextDouble();
		
		double height=input2.nextDouble();
		
		System.out.println("The volume of the cylinder is"+3.14*radius*radius*height);
		

	}

}
