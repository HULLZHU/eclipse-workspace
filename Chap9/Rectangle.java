
class Rectangle {
	private double width;
	private double height;
    static int count = 0;
	public Rectangle() {
		width = 1;
		height = 1;
		this.count ++;
	}
	
	public Rectangle( double width, double height) {
		this.width = width;
		this.height = height;
		this.count++;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}
	

}
