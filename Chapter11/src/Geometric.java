import java.util.Date;
public class Geometric {
	private String color;
	private boolean filled;
	private Date currentDate = new Date();
	
	public Geometric() {
		
	}
	
	public Geometric(String newColor,boolean newFilled) {
		color = newColor;
		filled = newFilled;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setFilled(boolean newStatus) {
		filled = newStatus;
	}
	
	public Date getDate() {
		return currentDate;
	}
	
	public void printStatus() {
		System.out.println("The Color: "+ color);
		System.out.println("Filled: "+ filled);
		System.out.println(currentDate.toString());
	}
}
