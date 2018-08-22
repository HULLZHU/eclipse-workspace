
public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius* radius ;
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	public boolean contains( double newX, double newY) {
		if (Math.sqrt((x-newX)*(x-newX)+(y-newY)*(y-newY))<=radius)
			return true;
		return false;
	}
	
	public boolean contains ( Circle2D newCircle) {
		if ( Math.sqrt((x-newCircle.getX() )*(x-newCircle.getX())+(y-newCircle.getY())*(y-newCircle.getY())) + newCircle.getRadius()<=radius )
			return true;
		return false;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y ; 
	}
	
	public double getRadius() {
		return radius;
	}
	
	public boolean isOverLapped(Circle2D newCircle) {
		if ( Math.sqrt((x-newCircle.getX() )*(x-newCircle.getX())+(y-newCircle.getY())*(y-newCircle.getY())) <= radius + newCircle.getRadius())
			return true;
		return false;
	}
}
