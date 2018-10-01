import java.util.Arrays;

public class Point implements Comparable<Point>{
	private double x;
	private double y;
	
	public Point() {
		x = 100*Math.random();
		y = 100*Math.random();
	}

	@Override
	public int compareTo(Point p2) {
		if (this.x < p2.x)
	        return -1;
	      else if (this.x == p2.x) {
	        // Secondary order on y-coordinates
	        if (this.y < p2.y)
	          return -1;
	        else if (this.y == p2.y)
	          return 0;
	        else
	          return 1;
	      } else
	        return 1;
	}
	

    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
    
    static class CompareY implements java.util.Comparator<Point> {
        public int compare(Point p1, Point p2) {
          if (p1.y < p2.y)
            return -1;
          else if (p1.y == p2.y) {
            // Secondary order on x-coordinates
            if (p1.x < p2.x)
              return -1;
            else if (p1.x == p2.x)
              return 0;
            else
              return 1;
          } else
            return 1;
        }
      }
    
    public static void main(String[]args) {
    	Point[] points = new Point[100];
    	for ( int i = 0 ; i < points.length ; i ++ ) {
    		points[i] = new Point();
    	}
    	
    	Arrays.sort(points);
    	for ( int i = 0 ; i < points.length ; i ++) {
    		System.out.println(points[i]);
    	}
    	Arrays.sort(points,new CompareY());
    	for ( int i = 0 ; i < points.length ; i ++) {
    		System.out.println(points[i]);
    	} 
    }

}
