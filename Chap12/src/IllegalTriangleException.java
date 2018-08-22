
public class IllegalTriangleException extends Exception{
	public IllegalTriangleException(String string) {
		super(string);
	}
	
	public IllegalTriangleException() {
		super("The triangle is illegal");
	}
}
