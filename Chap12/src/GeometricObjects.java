import java.util.Date;
public abstract class GeometricObjects {
	private String color = "white";
	private boolean filled;
	private Date dateCreated = new Date();
	
	protected GeometricObjects() {
	}
	
	protected GeometricObjects(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
}
