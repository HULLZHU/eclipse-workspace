
public class HexFormatException extends Exception {
	public HexFormatException(){
		super("Illegal HexNumber Format");
	}
	
	public HexFormatException(String hexString) {
		super(hexString + " is illegal format Hex Number");
	}
}
