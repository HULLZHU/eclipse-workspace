package Chapter6;
import java.util.*;
public class demo2 {

	public static void main(String[] args) {
		System.out.println("Please input a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if ( PE_06_26.isPalindromic(num)) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		
		// TODO Auto-generated method stub

	}

}
