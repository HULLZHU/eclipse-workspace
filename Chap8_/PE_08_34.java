import java.util.*;
public class PE_08_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[6][2];
		System.out.println("Please enter "+ points.length +"s points" );
		for ( int i = 0; i < points.length;i ++ ) {
			for ( int j = 0 ; j < points[i].length ; j ++ ) {
				points[i][j] = input.nextInt();
			}
		}
		
		getRightmostLowestPoint(points);

	}

	private static double[] getRightmostLowestPoint(double[][] points) {
		int rightmostIndex = 0;
		double rightmostX = points[0][0];
		double rightmostY = points[0][1];
		for ( int i = 1; i < points.length ; i ++ ) {
			if ( rightmostY > points[i][1]) {
				rightmostY = points[i][1];
				//locate the first points with the lowest coordinate
				rightmostIndex = i;
			}
			// compare the points which has the same coordinate with the before one
			else if ( rightmostY == points[i][1] && rightmostX<points[i][0]) {
				rightmostX = points[i][0];
				rightmostIndex = i;
			}
		}
		return new double[]{points[rightmostIndex][0], points[rightmostIndex][1]};
		
	}

}
