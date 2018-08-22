package Chapter6;
import java.util.*;
public class PE_06_27 {

	public static void main(String[] args) {
		System.out.println("how many emirps do you want?");
		Scanner input = new Scanner(System.in);
		int numOfEmirps = input.nextInt();
		int count = 0;
		int  i =2;
		while (count <= numOfEmirps) {
			if ( isPrime(i) && isPrime(reverse(i))) {
				if (!isPalindromic(i)) {
					System.out.print(i+" ");
					count++;
					if ( count%10==0) {
						System.out.println("");
					}
				}
			}
			
			i++;
			
		}
			
	}
	public static int reverse (int i) {
		String s1 = i+"";
		String s2 = "";
		int count = 0;
		while ( count <= s1.length()-1) {
			s2 = s2+ s1.charAt(s1.length()-1-count);
			count ++;
		}
		return Integer.parseInt(s2);
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
