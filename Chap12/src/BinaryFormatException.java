
public class BinaryFormatException extends Exception {
	public BinaryFormatException() {
		super("BinaryFormatException occurs");
	}
	
	public BinaryFormatException(String binaryString) {
		super(binaryString + " causes a BinaryFormatException");
	}
}
