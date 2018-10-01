import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class PostFixNotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the postfix expressions. Please");
		System.out.println("Please remember you should include the space between numbers and operators");
		String str = input.nextLine();
		System.out.println(str);
		String[] tokens = str.split(" ");
		Stack<Integer> stack = new Stack<Integer>(); 
		
		//for ( int i = 0 ; i < tokens.length ; i ++) {
			//System.out.print(tokens[i]); 
		//}                                 
		 
		for ( int i = 0 ; i < tokens.length ; i ++ ) {
			if ( tokens[i].equals("+")) { 
				processAnOperator(stack,"+"); 
				//System.out.println("+");
			}
			else if ( tokens[i].equals("/")) {
				processAnOperator(stack,"/");
				//System.out.println("/");
			}
			else if ( tokens[i].equals("*")) {
				processAnOperator(stack,"*");
				//System.out.println("*");
			} 
			
			else if ( tokens[i].equals("-")) {
				processAnOperator(stack,"-");
				//System.out.println("-");
			}
			 
			else {
				stack.push(Integer.parseInt(tokens[i])) ; 
				//System.out.println("SuccessMark");
				} 
		}
		
		System.out.println(stack.pop());
		
    
	}

	private static void processAnOperator(Stack<Integer> stack, String operator) {
		int num2 = stack.pop();
		int num1 = stack.pop();
		
		if ( operator == "+" ) {
			stack.push(num1 + num2);
		}
		
		else if ( operator == "-") {
			stack.push(num1-num2);
		}
		
		else if (operator =="/") {
			stack.push(num1/num2);
		}
		
		else if ( operator =="*") {
			stack.push(num1 * num2);
		}
		
		else {
			System.out.println("Your Operator does not work");
			System.exit(0);
		}
		
	}

} 
