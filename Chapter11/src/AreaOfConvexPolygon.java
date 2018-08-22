import java.util.*;
public class AreaOfConvexPolygon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of points.");
		int numberOfPoints = input.nextInt();
		double [][] points = new double [numberOfPoints][2];
		System.out.println("Please enter the coordinates clockwise.");
		for ( int i = 0 ; i < numberOfPoints; i ++ ) {
			for ( int j = 0; j < 2; j ++ ) {
				points[i][j] = input.nextDouble();
			}
		}
		
		double[][] vectors = new double[numberOfPoints-1][2];
		for ( int i = 0; i < numberOfPoints-1; i ++ ) {
				vectors[i][0] = points[i+1][0]-points[0][0];
				vectors[i][1] = points[i+1][1]-points[0][1];
		}
		
		double[] areas = new double [numberOfPoints-2];
		for ( int i = 0; i < areas.length ; i ++ ) {
			areas[i] = getArea(vectors[i][0],vectors[i][1],vectors[i+1][0],vectors[i+1][1]);
		}
		
		double sumArea = 0;
		for ( int i = 0; i < areas.length ; i ++ ) {
			sumArea += areas[i];
		}
		
		System.out.println("The sum area is "+ sumArea);
		

	}

	private static double getArea(double x1, double y1, double x2, double y2) {
		return 0.5 * Math.abs(x1*y2 - y1 * x2);
	}

}
