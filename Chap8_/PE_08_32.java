import java.util.*;
public class PE_08_32 {

	public static void main(String[] args) {
		System.out.println("Please enter a 3-by-2 matrix");
		Scanner input = new Scanner(System.in);
		double[][]points = new double[3][2];
		for ( int i = 0; i < points.length ; i++ ) {
			for ( int j = 0; j <points[i].length ; j ++ ) {
				points[i][j] = input.nextDouble();
			}
		}
		
		double[] sides = new double[3];
		for ( int i = 0 ; i < points.length ; i ++ ) {
			for ( int j = i + 1; j < points.length ; j ++ ){
				sides[i+j-1] = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
			}
			}
		
		double s = (sides[0]+sides[1]+sides[2])/2;
		double area = Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
		System.out.println("The area is : " + area );
		// TODO Auto-generated method stub

	}

	private static double distance(double d, double e, double f, double g) {		
		return Math.sqrt((d-f)*(d-f)+(e-g)*(e-g));
	}
}
