
public class InvalidRadiusException extends Exception{
	private double radius;
	public InvalidRadiusException(double newRadius) {
		super("Invalid radius "+ newRadius);
		this.radius = newRadius;
	}
	public double getRadius() {
		return radius;
	}

}

