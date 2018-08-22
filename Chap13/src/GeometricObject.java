import java.util.*;
public abstract class GeometricObject implements Comparable<GeometricObject>, Colorable {
	private String color = "white";
	private boolean isFilled = false;
	Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean isFilled) {
		dateCreated = new Date();
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public boolean isFilled() {
		return this.isFilled;
	}

	@Override
	public int compareTo(GeometricObject GeometricObject) {
		double area = this.getArea();
		double tempArea = GeometricObject.getArea();
		if ( area > tempArea)
			return 1;
		else if ( area < tempArea) 
			return -1;
		else
			return 0;
	}
	
	public static double sumArea(GeometricObject[] a ) {
		double area = 0;
		for ( int i = 0; i <a.length;i ++ ) {
			area += a[i].getArea();
		}
		return area;
	}
	
	public abstract boolean equals(GeometricObject obj);
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	

}
