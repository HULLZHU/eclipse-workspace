
public class ComparableCircle implements Comparable<ComparableCircle> {
	private double radius;
	
	public ComparableCircle() {
		radius = 1;
	}
	
	public ComparableCircle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI*radius*2;
	}

	@Override
	public int compareTo(ComparableCircle circle) {
		if( this.getArea() > circle.getArea())
			return 1;
		else if ( this.getArea() < circle.getArea())
			return -1;
		else
			return 0;
	}
}
