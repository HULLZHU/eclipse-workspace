
public class Decimal {
	private String decimalNumber;
	private int integerPart;
	private int decimalPart;
	
	public Decimal() {
		decimalNumber = 0+"";
		integerPart = 0;
		decimalPart = 0;
	}
	
	public Decimal(String decimalNumber) {
		this.decimalNumber = decimalNumber;
		String tokens[] = decimalNumber.split("[.]");
		integerPart =Integer.parseInt(tokens[0]);
		decimalPart = Integer.parseInt(tokens[1]);
	}
	
	public Decimal(double number) {
		this(number+"");
	}
	
	public Rational toRational() {
		Rational integerRational = new Rational(integerPart,1);
		int length = (decimalPart+"").length();
		int tempDenominator = (int)Math.pow(10, length);
		Rational decimalRational = new Rational(decimalPart,tempDenominator);
		Rational result = integerRational.add(decimalRational);
		return result;
	}

}
