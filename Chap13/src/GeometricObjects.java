import java.util.Date;
public abstract class GeometricObjects {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObjects() {
		 Date dateCreated = new Date();
	}
	
	protected GeometricObjects(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "Created On "+ dateCreated+";\n color : "+ color + ";\n filled"+filled; 
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
			GeometricObjects objectClone = (GeometricObjects)super.clone();
			objectClone.dateCreated = (Date)(dateCreated.clone());
			return objectClone;
	}
	
	//Abstract Method
	public abstract double getArea() ;
	//Abstract Method
	public abstract double getPerimeter();
	
	public static boolean equalArea(GeometricObjects g1, GeometricObjects g2) {
		return g1.getArea()==g2.getArea();
	}
	
	public static boolean equalPerimeter(GeometricObjects g1, GeometricObjects g2) {
		return g1.getPerimeter()==g2.getPerimeter();
	}
}
