package demo;

import java.util.*;

public class AreaofHexagon {
	public static void main(String[] args) {
		System.out.println("Input the side of Hexagon");
		
		Scanner input=new Scanner(System.in);
		
		double side=input.nextDouble();
		
		double area = 3*(Math.pow(3, 1.0/2))*(Math.pow(side, 2))/2 ;
		
		System.out.println("The area of Hexagon is"+area);
	}
}
