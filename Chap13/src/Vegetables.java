import java.util.Date;

public abstract class Vegetables {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	protected Vegetables() {
		dateCreated = new Date();
	}
	
	protected Vegetables(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled ( boolean filled) {
		this.filled = filled;
	}
	
	public boolean isFilled () {
		return filled;
	}

}
