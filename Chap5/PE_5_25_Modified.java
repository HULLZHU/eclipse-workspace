import java.util.*;
public class PE_5_25_Modified {

	public static void main(String[] args) {
		System.out.println("Please input a number.");
		Scanner input = new Scanner(System.in);
		double sum = 0;
	
		for (double limit = input.nextDouble(),i = limit -1; i >=1 ;i-- ) {
			sum = sum + 4*Math.pow(-1, i + 1 )/(2*i - 1);
		}
		System.out.println( sum );
		
		
		// TODO Auto-generated method stub

	}

}
