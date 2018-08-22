import java.util.Scanner;

public class PE_4_5 {

	public static void main(String[] args) {
		
		System.out.println("How many side does the regular n-sided polygon have?");
		
		Scanner input = new Scanner(System.in);
		
		double n = input.nextDouble();
		
		System.out.println("What is the length of the side?");
		
		double s = input.nextDouble();
		
		double area = n * s * s /(4*Math.tan(Math.PI/4));
		
		System.out.printf("The area of the n-sided polygon is %.2f " , area);
		
		
		// TODO Auto-generated method stub

	}

}
