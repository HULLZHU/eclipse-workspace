import java.util.*;
public class PE_5_26 {

	public static void main(String[] args) {
		System.out.println(" Please Enter an integer");
		Scanner input = new Scanner(System.in);
		final double limit = input.nextDouble();
		double i = 1;
		double sum = 1;
		double part = 1;
		
		while ( i <= limit) {
			part = part*(1/i);
			sum = sum + part;
			i ++;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
