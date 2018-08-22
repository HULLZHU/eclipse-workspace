
public class CircleWithException {
	private double radius;
	private static int numberOfObjects;
	
	public CircleWithException() {
		this(1.0);
	}
	
	public CircleWithException(double radius) {
		this.setRadius(radius);
		numberOfObjects ++ ;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius){
		if ( radius > 0 )
			this.radius = radius;
		else
			throw new IllegalArgumentException("Radius cannot be negative.") ;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public static void main(String[] args) {
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-6);
			CircleWithException c3 = new CircleWithException(3);
			}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
		System.out.println("Number of Objects is " + CircleWithException.getNumberOfObjects());

	}

}
