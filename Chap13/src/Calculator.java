
public class Calculator {

	public static void main(String[] args) {
		Rational result =new Rational(0,1);
		if (args.length != 1) {
			System.out.println("Usage: Calculator \"operands1 operator operands2\"");
			System.exit(1);
		}
		
		String [] tokens = args[0].split(" ");
		switch (tokens[1].charAt(0)) {
		case '+': result = getRational(tokens[0]).add(getRational(tokens[2]));
		break;
		case '-':result = getRational(tokens[0]).subtact(getRational(tokens[2]));
		break;
		case '*':result = getRational(tokens[0]).multiply(getRational(tokens[2]));
		break;
		case '/':result =getRational(tokens[0]).divide(getRational(tokens[2]));
		}
		System.out.println(tokens[0] + " " +tokens[1] + " "+tokens[2]+ " = "+result);
		

	}

	private static Rational getRational(String s) {
		String [] str = s.split("/");
		int numer = Integer.parseInt(str[0]);
		int denom = Integer.parseInt(str[1]);
 		return new Rational(numer,denom);
	}

}
