import java.util.Scanner;

public class PE_4_1 {

	public static void main(String[] args) {
		
		System.out.println("Please input the lenghth of the pentagon");
		
		Scanner input  = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		double s = 2 * r * Math.sin(Math.PI/5);
		
		double area = 5*s*s/(4*Math.tan(Math.PI/5));
		
		System.out.printf("The area of the pentagon is %.2f",area);
		
		
		
		// TODO Auto-generated method stub

	}

}
