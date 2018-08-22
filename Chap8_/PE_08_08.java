import java.util.*;
public class PE_08_08 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of points.");
		Scanner input = new Scanner(System.in);
		int numberOfPoints = input.nextInt();
		double [][] points = new double [numberOfPoints][2];
		System.out.println("Enter points.");
		for ( int i = 0; i < points.length; i++ ) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
	    boolean [][] temp = new boolean [numberOfPoints][2];
		int p1 = 0, p2 =1;
		double minDistance = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
		for ( int i = 0; i < points.length-1; i ++ ) {
			for ( int j = i + 1; j<points.length; j ++ ) {
				double distance = distance( points[i][0],points[i][1],points[j][0],points[j][1]);
				if( distance < minDistance) {
				minDistance = distance;
				}
			}
		}
		
		for ( int i = 0; i < points.length-1 ;i ++ ) {
			for ( int j = i + 1; j < points.length; j++ ) {
				if ( distance( points[i][0],points[i][1],points[j][0],points[j][1])== minDistance) {
					System.out.println("The closest pair of points can be " +"("+points[i][0]+","+points[i][1]+","+") and ("
				+ points[j][0]+","+points[j][1]+","+")" );
				}
			}
		}

	}

	private static double distance(double d, double e, double f, double g) {
		return Math.sqrt((d-f)*(d-f)+(g-e)*(g-e));
	}

}
