public class SimpleRectangle extends Geometric{
	private double width;
	private double height;
	
	public SimpleRectangle() {
	}
	public SimpleRectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public SimpleRectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}
}
