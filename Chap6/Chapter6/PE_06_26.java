package Chapter6;
import java.util.*;
public class PE_06_26 {

	public static void main(String[] args) {
	
		System.out.println("How many palindromic number do you wanna to have");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0;
		int i = 2;
		
		while ( count < num) {
			if ( isPrime(i)&&isPalindromic(i)) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
	
	

	
	public static boolean isPalindromic( int num) {
		String s1 = num+"";
		int i =0;
		while ( i <= s1.length()/2) {
			if (s1.charAt(i) == s1.charAt(s1.length()-1-i))
					i++;
			else 
				return false;
		}
		return true;
	}
	
	
	public static boolean isPrime( int num ) {
		int divisor = 2;
		while ( divisor <= num/2 ) {
			if ( num % divisor == 0)
				return false;
			divisor ++;
		}
		return true;
	}

}
