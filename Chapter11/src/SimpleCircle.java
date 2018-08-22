
public class SimpleCircle extends Geometric {
	private double radius;
	public SimpleCircle() {
	}
	public SimpleCircle(double radius) {
		this.radius = radius;
	}
	public SimpleCircle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius() {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public void printCircle() {
		System.out.println("The circle is created " + super.getDate()+" and radius is "+radius);
	}
	

}
