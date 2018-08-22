
public class Circle extends GeometricObject {
	private double radius;
	
	public Circle() {
		super();
		radius = 1;
	}
	
	public Circle(String color , boolean isFilled) {
		super(color, isFilled);
	}
	
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public boolean equals(GeometricObject obj) {
		if ( obj instanceof Circle) {
			if (obj.getArea() == this.getArea())
				return true;
		}
		return false;
	}
	@Override
	public double getArea() {
		return Math.PI *2 *radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI*radius*radius;
	}

	@Override
	public String howToColor() {
		// TODO Auto-generated method stub
		return "Color the peripheral Curve";
	}
	
	@Override
	public String toString() {
		return "Area: " + getArea();
	}

}
