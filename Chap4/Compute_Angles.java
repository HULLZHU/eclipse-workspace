import java.util.*;

public class Compute_Angles {

	public static void main(String[] args) {
		
		System.out.println("Please input the coordinates of the three corner points");
		
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		
		double y2 = input.nextDouble();
		
		double x3 = input.nextDouble();
		
		double y3 = input.nextDouble();
		
		double dis12 = Math.sqrt((Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
		
		double dis13 = Math.sqrt((Math.pow(x1-x3,2)+Math.pow(y1-y3,2)));
		
		double dis23 = Math.sqrt((Math.pow(x2-x3,2)+Math.pow(y2-y3,2)));
	
		double A =Math.toDegrees( Math.acos((dis13* dis13 + dis12 * dis12 - dis23 * dis23)/(2 * dis12 * dis13)));
		
		double B =Math.toDegrees( Math.acos((dis23* dis23 + dis12 * dis12 - dis13 * dis13)/(2 * dis23 * dis12)));
		
		double C =Math.toDegrees( Math.acos((dis13* dis13 + dis23 * dis23 - dis12 * dis12)/(2 * dis13 * dis23)));
		
		System.out.println(" The angles of this triangle is " + Math.round(A*100)/100.0 + " and "+ Math.round(B*100)/100.0 +" and "+Math.round(C*100)/100.0);
		
		System.out.println("The distance between p1 and p2 is " + dis12);
		
		System.out.println("The distance between p2 and p3 is " + dis23);
		
		System.out.println("The distance between p1 and p3 is " + dis13 );

	}

}
