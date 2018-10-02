
public class GeometricObject {
	private double area = 0;
	
	public GeometricObject () {
		this.area = 10;
	}
	
	public GeometricObject(double area) {
		this.area  = area;
	}
	
	public double getArea() {
		return this.area;
	}
	
	@Override
	public String toString() {
		return "Area:" + this.getArea();
	}

}
