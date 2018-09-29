import java.util.Scanner;
import java.util.Stack;

public class Evaluate {

	public static void main(String[] args) {
		//get the user's input
		Scanner input = new Scanner(System.in);
		String expression = input.nextLine();
		
		//output result
		System.out.println(evaluateExpression(expression));
	}
 
	/** the method to get result */
	private static  int evaluateExpression(String expression) {
		//first create 2 stack to save operands and operators
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		
		//we cannot easily distinguish operators and operands just by operating string
		expression = insertBlanks(expression);
		String[] tokens = expression.split(" ");
		
		for ( int i = 0 ; i < tokens.length ; i ++)
			System.out.print(tokens[i]+" ");
		
		for( String token : tokens) {
			if ( token.length()==0 || token.charAt(0)==' ') {
				continue;
			}
			
			else if ( (token.trim().charAt(0) =='+' ||token.trim().charAt(0)=='-') && operandStack.size() > 1 ) {
				if ( operatorStack.peek() == '+' || operatorStack.peek() == '-') {
					processAnOperator(operandStack,operatorStack);
				}
				
				while ( !operatorStack.isEmpty() && (operatorStack.peek() == '+'||
						operatorStack.peek()=='-'||operatorStack.peek()=='*'||operatorStack.peek()=='/')) {
					processAnOperator(operandStack,operatorStack);
				}
				
				operatorStack.push(token.charAt(0));
			}
			
			else if ( token.trim().charAt(0) == '/' ||token.trim().charAt(0) == '*') {
				while ( !operatorStack.isEmpty() &&( operatorStack.peek()=='*'||
						operatorStack.peek()=='/')){
							processAnOperator(operandStack,operatorStack);
						} 
				
				operatorStack.push(token.charAt(0));
			}
			
			
			//******
			else if ( token.trim().charAt(0) ==')') {
				while ( operatorStack.peek() != '(') {
					processAnOperator(operandStack,operatorStack);
				}
				operatorStack.pop();
			}
			
			//if Integer, convert it and push it in the number stack
			else {
				System.out.println("line 66 "+ token.charAt(0));
				operandStack.push(Integer.parseInt(token.charAt(0)+"")); 
			}
		} 
		
		while ( !operatorStack.isEmpty()) {
			processAnOperator(operandStack,operatorStack);
		}
		
		return operandStack.pop();
		
		
	}
	
	/** process an operator*/
	private static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
		int number1 = operandStack.pop();
		int number2 = operandStack.pop(); 
		char operator = operatorStack.pop();
		if ( operator == '*') {
			operandStack.push(number1 * number2);
			}
		else if ( operator == '/') {
			operandStack.push(number1/number2);
		}
		
		else if ( operator == '-') {
			operandStack.push(number1 - number2);
		}
		
		//the left possibility is operator == *
		else
			operandStack.push(number1 + number2);
	}

	/**insert blanks to help get string [] */
	private static String insertBlanks(String expression) {
		String result = "";
		for ( int i = 0 ; i < expression.length() ; i ++ ) {
				result += " " + expression.charAt(i)+ " ";
		}
		System.out.println("result " + result);
		return result;
	}

}
