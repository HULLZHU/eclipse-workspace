import java.util.ArrayList;

public class Calculator {

	public static void main(String[] args) {
		try {
			Calculate(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Calculate(String[] args) throws Exception {
		if(args.length!=3) {
			System.out.println("Please enter Operand Operator Operand" );
		}
		
		double result = 0;
		try {
			double num1 = Double.parseDouble(args[0]);
			double num2 = Double.parseDouble(args[2]);
			if (args[1].charAt(0)=='+')
					result = num1 + num2;
			else if (args[1].charAt(0)=='*')
					result = num1*num2;
			else if (args[1].charAt(0)=='-')
					result = num1 - num2;
			else if (args[1].charAt(0)=='/')
					result = num1/num2;
			else 
					result = 1/0;
			System.out.println("The result is :" + result);
				}	
		catch (ArithmeticException ex) {
				throw new IllegalOperatorException();
			}
		
		catch(NumberFormatException ex) {
			throw new NumberFormatException("Please input appropriate numbers");
		}
		
		
		
		
	}
	}
