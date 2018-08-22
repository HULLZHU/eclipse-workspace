import java.util.*;
public class PE_4_4 {

	public static void main(String[] args) {
		
		System.out.println("Please enter the length of a side");
		
		Scanner input = new Scanner(System.in);
		
		double length = input.nextDouble();
		
		double area = 6*length*length/(4*Math.tan(Math.PI/6));
		
		System.out.printf("The area of this hexagon is %.2f",area);
		// TODO Auto-generated method stub

	}

}
