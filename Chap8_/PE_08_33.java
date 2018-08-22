import java.util.*;
public class PE_08_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[4][2];
		System.out.println("Please enter 2 lines by enter their respective starting point and ending point");
        for ( int i = 0; i < points.length ; i ++ ) {
        	for ( int j = 0; j < points[i].length ; j ++ ) {
        		points[i][j] = input.nextDouble();
        	}
        }
        double [] intersectingPoint = getIntersectingPoint(points);
        System.out.println("The intersecting point is : " + intersectingPoint[0]+","+intersectingPoint[1]);
        double[] areas = new double [4];
        for ( int i = 0 ; i<4 ; i +=2  ) {
        	areas[i] = getArea(points[i/2][0],points[i/2][1],points[2][0],points[2][1],intersectingPoint[0],intersectingPoint[1]);
        	areas[i+1] = getArea(points[i/2][0],points[i/2][1],points[3][0],points[3][1],intersectingPoint[0],intersectingPoint[1]);
        }
        for ( double e: areas)
        	System.out.print(" " + e);
        Arrays.sort(areas);
        for ( int i = 0; i < areas.length; i++ ) {
        	System.out.print("  "+ areas[i]);
        }
	}
	private static double getArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		double side1= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double side2 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double side3 = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	private static double getArea(double[] p1, double[] p2, double[] p0) {
		double [] sides = new double[3];
		double area = 0;
		sides[0] = distance(p1[0],p1[1],p2[0],p2[1]);
		sides[1] = distance(p1[0],p1[1],p0[0],p0[1]);
		sides[2] = distance(p2[0],p2[1],p0[0],p0[1]);
		double s = (sides[0]+sides[1]+sides[2])/2;
		area = Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
		return area;
	}
	private static double distance(double d, double e, double f, double g) {
		return Math.sqrt((d-f)*(d-f)+(e-g)*(e-g));
	}
	private static double[] getIntersectingPoint(double[][] points) {
		double[] intersectingPoint = new double[2];
		double[][] a= {{points[0][1]-points[1][1],points[1][0]-points[0][0]},{points[2][1]-points[3][1],points[3][0]-points[2][0]}};
		double[] b = {(points[0][1]-points[1][1])*points[0][0] - (points[0][0]-points[1][0])*points[0][1],(points[2][1]-points[3][1])*points[2][0]-(points[2][0]-points[3][0])*points[2][1]}; 
		intersectingPoint = solveEquation(a,b);
		return intersectingPoint;
	}
	private static double[] solveEquation(double[][] a , double [] b) {
		double[] result = new double[2];
		result[0] = (b[0]*a[1][1]-b[1]*a[0][1])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
		result[1] = (b[1]*a[0][0]-b[0]*a[1][0])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
		return result;
	}
}
