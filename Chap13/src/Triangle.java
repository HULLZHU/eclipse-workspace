
public class Triangle extends GeometricObjects {
	private double s1;
	private double s2;
	private double s3;
	public Triangle() {
		super();
		s1=1;
		s2=1;
		s3=1;
	}
	
	public Triangle(String color, boolean filled, double s1, double s2, double s3) {
		super (color,filled);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	

	@Override
	public double getArea() {
		double s = (s1 + s2 + s3 )/3;
		double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		return area;
	}

	@Override
	public double getPerimeter() {
		return s1+s2+s3;
	}
	@Override
	public String toString() {
		return "Tiangle\n Color : "+this.getColor()+"\n Area : "+this.getArea()+"\n Perimeter : "+this.getPerimeter()+ "\n Filled : "+this.isFilled();
	}

}
