package Chapter6;
import java.util.*;
public class PE_06_10 {

	public static void main(String[] args) {
		int num = 2;
		int count = 1;
		while (num<10000) {
			if (isPrime(num)) {
				System.out.print(" "+num);
				if (count % 10 == 0)
					System.out.println();
				count++;
			}
			num ++;
		}
		
	}
	
	public static boolean isPrime(int num) {
		int i = 2;
		boolean prime = true;
		while ( i <= num/2) {
			if (num % i == 0) 
				prime = false;
			i++;
	}
		return prime;
		

}
}
