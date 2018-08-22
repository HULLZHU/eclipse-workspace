
public class Octagon extends GeometricObject implements Cloneable{
	private double side;
	
	public Octagon() {
		super();
		side = 1;
	}
	
	public Octagon(double side) {
		super();
		this.side = side;
	}
	
	public Octagon(double side, boolean isFilled, String color) {
		super(color,isFilled);
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side =side;
	}

	@Override
	public String howToColor() {
		// TODO Auto-generated method stub
		return "Draw 8 lines and Color";
	}

	@Override
	public boolean equals(GeometricObject obj) {
		if ( this.getArea() == obj.getArea())
			return true;
		return false;
	}

	@Override
	public double getArea() {
		return (2+4/Math.sqrt(2))*side*side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8*side;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
