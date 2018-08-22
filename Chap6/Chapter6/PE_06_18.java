package Chapter6;
import java.util.*;
public class PE_06_18 {

	public static void main(String[] args) {
		System.out.println("Please input your password");
		Scanner input = new Scanner (System.in);
		String password = input.nextLine();
		if ( isValid(password))
			System.out.println("ValidInput");
		else 
			System.out.println("NotvalidInput");
	}

	
	public static boolean isValid(String password) {
		if ( condition1(password) && condition2(password) && condition3(password) )
			return true;
		else
			return false;
	}
	
	public static boolean condition1( String password) {
		if (password.length()>=8 )
			return true;
		else 
		    return false;
	}
	
	public static boolean condition2 ( String password) {
		int countOfString = 0;
		boolean temp = true;
		while ( countOfString < password.length()) {
			if ( (password.charAt(countOfString)<='9'&password.charAt(countOfString)>='0')||(password.charAt(countOfString)
				<='Z'&&password.charAt(countOfString)>='A'|| password.charAt(countOfString)>='a'&&password.charAt(countOfString)<='z')) {
				temp =true;
			}
			else {
				temp =false;
				break;
			}
	        countOfString ++;	
		}
		if (temp)
			return true;
		else
			return false;
			
				
		
	}
	
	public static boolean condition3 (String password) {
		int countOfDigit = 0;
		int countOfString = 0;
		while ( countOfString < password.length()) {
			if (password.charAt(countOfString)<='9'&&password.charAt(countOfString)>='0')
				countOfDigit ++;
			countOfString++;
		}
		if ( countOfDigit>=2)
			return true;
		else 
			return false;
	}
}
