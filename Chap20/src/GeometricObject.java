import java.util.Comparator;

public abstract class GeometricObject implements Comparator<GeometricObject>, java.io.Serializable {
	private String color = "YELLOW";
	private boolean isFilled = false;
	private java.util.Date dateCreated = new java.util.Date();
	private double area = 1;
	
	public GeometricObject() {
		
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void updateDate() {
		dateCreated=new java.util.Date();
	}
	
	public double getArea() {
		return this.area;
	}
	
	public boolean equalArea(GeometricObject obj) {
		if (this.getArea() == obj.getArea()) {
			return true;
		}
		return false;
	}
	
	public static boolean equalArea(GeometricObject obj1, GeometricObject obj2) {
		if ( obj1.getArea() == obj2.getArea())
			return true;
		return false;
	}
	
	public int compare(GeometricObject o1, GeometricObject o2) {
		double area1 = o1.getArea();
		double area2 = o2.getArea();
		
		if ( area1 < area2)
			return -1;
		else if ( area1 == area2)
			return 0 ;
		else
			return 1;
	}

}
