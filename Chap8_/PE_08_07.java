
public class PE_08_07 {

	public static void main(String[] args) {
		double [][] points = {{-1,0,3},{-1,-1,-1},{4,1,1},{2,0.5,9},{3.5,2,-1},{3,1.5,3},{-1.5,4,2}};
		double minDistance = computeDistance(points[0][0],points[0][1],points[0][2],points[1][0],points[1][1],points[1][2]);
		int p1 = 0;
		int p2 = 0;
		for ( int i = 0; i < points.length -1; i ++ ) {
			for ( int j = i + 1; j<points.length;j++) {
				double distance = computeDistance(points[i][0],points[i][1],points[i][2],points[j][1],points[j][1],points[j][2]);
				if (distance < minDistance) {
					minDistance = distance;
					p1 = i;
					p2 = j;
				}
			}
		}
		
		System.out.println("The shortest two points are " + "("+points[p1][0]+","+points[p1][1]+","+points[p1][2]+") and ("
				+ points[p2][0]+","+points[p2][1]+","+points[p2][2]+")");
		// TODO Auto-generated method stub

	}

	private static double computeDistance(double d, double e, double f, double g, double h, double i) {
		return Math.sqrt((g-d)*(g-d)+(h-e)*(h-e)+(i-f)*(i-f));
	}

}
