import java.util.*;

import javax.xml.stream.events.Characters;
public class MyCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an expression.");
		String s1 = input.next();
		String[] tokens = new String[3];
		for ( int i = 0; i < tokens.length; ) {
			for ( int j = 0; j < s1.length() ; j ++ ) {
				if ( s1.charAt(j)>='0'&&s1.charAt(j)<='9')
					tokens[i++] = s1.charAt(j)+"";
				if ( s1.charAt(j)=='*'||s1.charAt(j)=='/'||s1.charAt(j)=='+'||s1.charAt(j)=='i')
					tokens[i++] = s1.charAt(j)+"";
			}
		}
		
		if( isRightOrder(tokens)) {
			System.out.print(tokens[0]+" "+ tokens[1]+" "+tokens[2]+ " "+"="+" "+getResult(tokens));
		}
		else if ( !isRightOrder(tokens)) {
			System.out.println("Please enter again.");
			System.exit(1);
		}
	}

	private static boolean isRightOrder(String[] tokens) {
		for ( int i = 0; i < tokens.length ; i ++ ) {
			if ( i % 2== 0 ) {
				if (tokens[i].charAt(0)<='0'||tokens[i].charAt(0)>='9')
					return false;
			}
			else {
				if ( tokens[i].charAt(0)!='+'&&tokens[i].charAt(0)!='-'&&tokens[i].charAt(0)!='*'&&tokens[i].charAt(i)!='/')
					return false;
			}
		}
		return true;
	}

	private static int getResult(String[] tokens) {
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[2]);
		switch ( tokens[1]) {
		case "+": return num1 + num2;
		case "-": return num1 - num2;
		case "*": return num1 * num2;
		case "/": return num1/num2;
		}
		return -9999;
	}

}
