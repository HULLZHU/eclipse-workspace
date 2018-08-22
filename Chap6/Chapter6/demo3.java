package Chapter6;
import java.util.*;
public class demo3 {

	public static void main(String[] args) {
		System.out.println("Please input a number " );
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if ( PE_06_26.isPrime(num))
			System.out.println("True");
		else 
			System.out.println("False");// TODO Auto-generated method stub

	}

}
