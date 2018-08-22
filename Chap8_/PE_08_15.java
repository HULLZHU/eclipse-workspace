import java.util.*;
public class PE_08_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][]points = new double[5][2];
		System.out.println("Please enter points.");
		for ( int i = 0; i < points.length; i++ ) {
			for ( int j = 0; j < points[i].length; j++ ) {
				points[i][j] = input.nextDouble();
			}
		}
		checkPoints(points);
	}

	private static void checkPoints(double[][] points) {
		boolean isSameLine = true;
		double slope = (points[0][1]-points[1][1])/(points[0][0]-points[1][0]);
		for ( int i =2; i < points.length; i ++ ) {
			if( (points[0][1]-points[i][1])/(points[0][0]-points[i][0]) != slope)
				isSameLine = false;
		}
		if ( isSameLine)
			System.out.println("They are on same line.");
		else
			System.out.println("They are not on same line.");
		
	}

}
