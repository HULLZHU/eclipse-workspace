import java.util.Scanner;

public class PE_4_7 {

	public static void main(String[] args) {
		
		System.out.println("Please input the radius of the pentagon");
		
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		double x1 = r*Math.cos(Math.toRadians(18));
		
		double y1 = r*Math.sin(Math.toRadians(18));
		
		double x2 = r*Math.cos(Math.toRadians(54));
		
		double y2 = r*Math.sin(Math.toRadians(54));
		
        System.out.printf("These five points are (0, %.2f)\n (%.2f, %.2f1)\n (%.2f,%.2f)\n (%.2f,%.2f)\n (%.2f,%.2f)",r,x1,y1,x2,y2,-x2,-y2,-x1,y1);
		
		
		// TODO Auto-generated method stub

	}

}

