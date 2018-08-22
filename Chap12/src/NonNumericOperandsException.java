
public class NonNumericOperandsException extends Exception{
	public NonNumericOperandsException() {
		super("wrong input: Usage: Operands1 Operator Operator");
	}
	
	public NonNumericOperandsException(String[]args) {
		super("wrong input");
	}
}
