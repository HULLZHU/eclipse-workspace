
public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	public Rectangle() {
		super();
		this.width = 1;
		this.height = 1;
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, boolean isFilled, double width, double height) {
		super(color, isFilled);
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double getArea() {
		return width*height;
	}
	

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

	@Override
	public String howToColor() {
		return "Color all four sides";
	}
	
	@Override
	public String toString() {
		return "Area: " + getArea();
	}

	@Override
	public boolean equals(GeometricObject obj) {
		if ( obj instanceof Rectangle ) {
			if ( obj.getArea() == this.getArea())
				return true;
		}
		return false;
	}
}
